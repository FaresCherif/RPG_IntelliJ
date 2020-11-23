package sample;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.*;
import javafx.scene.text.Text;


public class Controller implements Initializable{

    @FXML
    private GridPane gridPane;

    @FXML
    private Button bouttonCreer;

    @FXML
    private Button bouttonMage;

    @FXML
    private Button bouttonGuerrier;

    @FXML
    private Button bouttonChasseur;

    @FXML
    private Group bouttonCreationPerso;

    @FXML
    private Group pagePrincipale;

    @FXML
    private Label descriptionChasseur;

    @FXML
    private Label descriptionMage;

    @FXML
    private Label descriptionGuerrier;

    @FXML
    private Group descriptionCreationPerso;

    @FXML
    private Group nomCreationPerso;

    @FXML
    private Button validerNom;

    @FXML
    private TextArea entrerNomPerso;

    @FXML
    private Group affichagePerso;

    @FXML
    private ImageView imageViewPersonnage;

    @FXML
    private Image imagePerso;

    @FXML
    private Group descriptionAffichagePerso;

    @FXML
    private Label pointVieDescriptionPersonage;

    @FXML
    private Label pointManaDescriptionPersonage;

    @FXML
    private Label niveauDescriptionPersonage;

    @FXML
    private Group bouttonAffichagePerso;

    @FXML
    private Group affichageEnnemi;

    @FXML
    private ImageView imageViewEnnemi;

    @FXML
    private Image imageEnnemi;

    @FXML
    private Label pointVieDescriptionEnnemi;

    @FXML
    private Label pointManaDescriptionEnnemi;

    @FXML
    private Label niveauDescriptionEnnemi;

    @FXML
    private Group descriptionAffichageEnnemi;

    @FXML
    private Group descriptionArmeEquipee;

    @FXML
    private Label armePersonage;

    @FXML
    private Label piecePersonnage;

    @FXML
    private Group bouttonCombat;

    @FXML
    private Button bouttonSort;

    @FXML
    private Group bouttonAttaqueEpee;

    @FXML
    private Group bouttonAttaqueArc;

    @FXML
    private Button retourEpeeAttaqueBoutton;

    @FXML
    private Button retourArcAttaqueBoutton;

    @FXML
    private Group listeSortPersonnageCombat;

    @FXML
    private Button boulleEnergie;

    @FXML
    private  Button retourSortBoutton;

    @FXML
    private Button sortSoint;

    @FXML
    private Group psserTourCombat;

    @FXML
    private Group affichageMort;

    @FXML
    private Label descriptionMort;

    @FXML
    private Button retourDescriptionMort;

    @FXML
    private Group affichageVictoire;

    @FXML
    private Label descriptionVictoire;

    @FXML
    private Button retourDescriptionVictoire;

    @FXML
    private Group bouttonAttaqueSansArme;

    @FXML
    private Button retourSansArmeAttaqueBoutton;

    @FXML
    private Group allerMagasin;

    @FXML
    private Group magasinListeObjet;

    @FXML
    private Button acherterGrosseBoulleEnergie;

    @FXML
    private Button retourBoutique;

    @FXML
    private Button acherterBoulleEnergie;

    @FXML
    private Button grosseBoulleEnergie;

    @FXML
    private Button acheterSoin;

    @FXML
    private Button fabriquerFleche;

    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    private Personnage personnage;
    private Ennemi ennemi;
    private Image imagePersonnage;

    private Sort boulleEnnergie=new Sort();
    private Sort soin = new Sort(-8,new Effet(),4);
    private Sort grosseBoulleEnnergie=new Sort(8,new Effet(),8);




    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        pagePrincipale.setVisible(true);
        bouttonCreationPerso.setVisible(false);

        pagePrincipale.setTranslateX(-width/2+250);
        pagePrincipale.setTranslateY(-height/2+150);

        BackgroundImage myBI= new BackgroundImage(new Image("https://cameronscookware.com/wp-content/uploads/2019/12/fantasy-world-background-best-of-fantasy-world-backgrounds-4k-download-2019-of-fantasy-world-background.jpg",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));

    }

    public void allerPageCreerPersonnage(ActionEvent actionEvent) {
        pagePrincipale.setVisible(false);
        bouttonCreationPerso.setVisible(true);

        bouttonGuerrier.setTranslateX(200);
        bouttonChasseur.setTranslateX(400);

        descriptionCreationPerso.setTranslateY(200);

        descriptionMage.setText("Le mage est un être puissant capable de déchainer les éléments contre ses ennemies\n et de se protéger grace à ses sorts malgrés sa faible résistance physique");
        descriptionChasseur.setText("Le guerrier est un combatant féroce ne reculant jamais face à un combat.\n Avec ses capacités exceptionnelles presque rien ne peut l'arreter, à part un livre");
        descriptionGuerrier.setText("BLA BLA Nature, BLA BLA Archer. Une classe équilibré pour les casu \n PS : Ceci n'est pas la classe préféré d'un des développeurs");

    }

    public void hooverBouttonChoixPersonnageGuerrier(MouseEvent event) {
        descriptionChasseur.setVisible(false);
        descriptionMage.setVisible(false);
        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            descriptionGuerrier.setVisible(true);
        }
    }

    public void hooverBouttonChoixPersonnageMage(MouseEvent event) {
        descriptionChasseur.setVisible(false);
        descriptionGuerrier.setVisible(false);
        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            descriptionMage.setVisible(true);
        }
    }

    public void hooverBouttonChoixPersonnageChasseur(MouseEvent event) {
        descriptionGuerrier.setVisible(false);
        descriptionMage.setVisible(false);

        if (event.getEventType() == MouseEvent.MOUSE_ENTERED) {
            descriptionChasseur.setVisible(true);
        }
    }

    public void creerMage(){
        bouttonCreationPerso.setVisible(false);
        descriptionMage.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Mage();
        validerNom.setTranslateX(300);
        Image nouvelleImage = new Image("https://listimg.pinclipart.com/picdir/s/559-5599557_rpg-character-png-2d-clipart.png",100,200,false,false);

        imageViewPersonnage.setImage(nouvelleImage);
        affichagePerso.setTranslateX(-400);
        personnage.apprendreSort(boulleEnnergie);
        personnage.apprendreSort(soin);

    }

    public void creerGuerrier(){
        bouttonCreationPerso.setVisible(false);
        descriptionGuerrier.setVisible(false);
        nomCreationPerso.setVisible(true);
        personnage=new Guerrier();
        validerNom.setTranslateX(300);
        Image nouvelleImage= new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWNdOOAfEZGi0pM4wh3W9C93M9z1gkadS_vg&usqp=CAU",200,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);
        affichagePerso.setTranslateX(-500);

    }

    public void creerChasseur(){
        bouttonCreationPerso.setVisible(false);
        descriptionChasseur.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Chasseur();

        validerNom.setTranslateX(300);
        Image nouvelleImage= new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfhvRyJp2XzvYeVTaMTgCENERCy1wVFTSdCg&usqp=CAU",100,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);
        affichagePerso.setTranslateX(-400);

    }

    public void pageDescriptionPerso(){
        magasinListeObjet.setVisible(false);
        descriptionAffichageEnnemi.setVisible(false);
        affichageMort.setVisible(false);
        affichageVictoire.setVisible(false);
        affichageEnnemi.setVisible(false);
        personnage.recuperer();

        nomCreationPerso.setVisible(false);
        personnage.setNom(entrerNomPerso.getText());
        affichagePerso.setVisible(true);
        descriptionAffichagePerso.setVisible(true);
        allerMagasin.setVisible(true);
        allerMagasin.setTranslateX(600);

        imagePersonnage=imageViewPersonnage.getImage();
        pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
        descriptionAffichagePerso.setTranslateY(-150);
        descriptionAffichagePerso.setTranslateX(-350);
        pointManaDescriptionPersonage.setTranslateY(20);
        pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
        niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));
        niveauDescriptionPersonage.setTranslateY(40);

        bouttonAffichagePerso.setVisible(true);
        bouttonAffichagePerso.setTranslateX(-300);
        bouttonAffichagePerso.setTranslateY(300);

        descriptionArmeEquipee.setVisible(true);
        descriptionArmeEquipee.setTranslateX(-350);
        descriptionArmeEquipee.setTranslateY(150);
        if(personnage.getArme()!=null){
            armePersonage.setText("Arme équipée "+ personnage.getArme());
        }
        else{
            armePersonage.setText("Pas d'arme équipée");
        }
        piecePersonnage.setTranslateY(20);
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");

    }

    public void fondCombat(){
        BackgroundImage myBI= new BackgroundImage(new Image("https://static.wikia.nocookie.net/finalfantasy/images/c/c8/Battleback_coliseum.png/revision/latest?cb=20141030003602",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        gridPane.setBackground(new Background(myBI));

        if(ennemi==null){
            ennemi=new Ennemi();
            Epee epeeMechant=new Epee();
        }
        else{
            ennemi.recuperer();
            if(ennemi.getNiveau()<personnage.getNiveau()){
                ennemi.setPointsDeVieMax(ennemi.getPointsDeVieMax()+5*ennemi.getNiveau());
                ennemi.setPointsDeManaMax(ennemi.getPointsDeManaMax()+5*ennemi.getNiveau());
                ennemi.setNiveau(personnage.getNiveau());
            }
        }
        pageCombat();
    }

    public void pageCombat(){
        allerMagasin.setVisible(false);
        psserTourCombat.setVisible(true);
        if(personnage.getArme()!=null){
            armePersonage.setText("Arme équipée "+ personnage.getArme());
        }
        else{
            armePersonage.setText("Pas d'arme équipée");
        }
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");
        pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
        pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
        niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));


        pointVieDescriptionEnnemi.setText(" PV : "+ennemi.getPointsDeVie()+"/"+ennemi.getPointsDeVieMax());
        pointManaDescriptionEnnemi.setText(" PM : "+ennemi.getPointsDeMana()+"/"+ennemi.getPointsDeManaMax());
        niveauDescriptionEnnemi.setText(" Niveau : "+Integer.toString(ennemi.getNiveau()));
        bouttonAttaqueArc.setVisible(false);
        listeSortPersonnageCombat.setVisible(false);
        bouttonAttaqueSansArme.setVisible(false);

        if(ennemi.getPointsDeVie()>0){


            bouttonAffichagePerso.setVisible(false);
            affichageEnnemi.setVisible(true);
            affichageEnnemi.setTranslateX(600);

            bouttonAttaqueEpee.setVisible(false);


            descriptionAffichageEnnemi.setVisible(true);
            descriptionAffichageEnnemi.setTranslateY(-150);
            descriptionAffichageEnnemi.setTranslateX(600);

            pointManaDescriptionEnnemi.setTranslateY(20);
            niveauDescriptionEnnemi.setTranslateY(40);

            bouttonCombat.setVisible(true);
            bouttonCombat.setTranslateX(-200);
            bouttonCombat.setTranslateY(300);

            psserTourCombat.setVisible(true);
            bouttonSort.setTranslateX(200);
            psserTourCombat.setTranslateX(200);
            psserTourCombat.setTranslateX(200);
            psserTourCombat.setTranslateY(300);

            if(personnage.getPointsDeVie()<=0){
                psserTourCombat.setVisible(false);
                bouttonAttaqueEpee.setVisible(false);
                bouttonCombat.setVisible(false);

                affichageMort.setVisible(true);
                affichageMort.setTranslateY(300);
                retourDescriptionMort.setTranslateX(400);
                retourDescriptionMort.setTranslateY(-200);
                descriptionMort.setTranslateY(-150);
            }
        }
        else{
            personnage.gagnerPiece(ennemi.getNiveau()*10);
            piecePersonnage.setText(personnage.getNbPiece()+" pieces");
            personnage.gagnerNiveau();
            pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
            pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
            niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));
            psserTourCombat.setVisible(false);
            bouttonAttaqueEpee.setVisible(false);

            affichageVictoire.setVisible(true);
            affichageVictoire.setTranslateY(300);
            retourDescriptionVictoire.setTranslateX(400);
            retourDescriptionVictoire.setTranslateY(-200);
            descriptionVictoire.setTranslateY(-150);
        }


    }

    public void optionAttaque(){
        int decalageBouttonAttaque=-200;
        psserTourCombat.setVisible(false);
        bouttonCombat.setVisible(false);
        if(personnage.getArme()!=null) {
            if (personnage.getArme().getClass() == Epee.class) {
                bouttonAttaqueEpee.setVisible(true);
                bouttonAttaqueEpee.setTranslateX(decalageBouttonAttaque);
                decalageBouttonAttaque+=400;
                bouttonAttaqueEpee.setTranslateY(300);
            } else if (personnage.getArme().getClass() == Arc.class) {
                bouttonAttaqueArc.setVisible(true);
                bouttonAttaqueArc.setTranslateX(decalageBouttonAttaque);
                bouttonAttaqueArc.setTranslateY(300);
                decalageBouttonAttaque+=400;
                fabriquerFleche.setTranslateX(decalageBouttonAttaque);
                decalageBouttonAttaque+=200;
            }
        }
        else{
            bouttonAttaqueSansArme.setTranslateY(300);
            bouttonAttaqueSansArme.setTranslateX(decalageBouttonAttaque);
            bouttonAttaqueSansArme.setVisible(true);
        }
        retourEpeeAttaqueBoutton.setTranslateX(decalageBouttonAttaque);
        retourArcAttaqueBoutton.setTranslateX(decalageBouttonAttaque);
        retourSansArmeAttaqueBoutton.setTranslateX(decalageBouttonAttaque);

    }

    public void optionSort(){
        psserTourCombat.setVisible(false);
        bouttonCombat.setVisible(false);
        listeSortPersonnageCombat.setTranslateX(-200);
        listeSortPersonnageCombat.setTranslateY(300);
        listeSortPersonnageCombat.setVisible(true);
        int decalageSort=0;

        if(personnage.getListeDesSorts().contains(boulleEnnergie)){
            decalageSort+=200;
            boulleEnergie.setVisible(true);
        }

        if(personnage.getListeDesSorts().contains(soin)){
            sortSoint.setTranslateX(decalageSort);
            decalageSort+=200;
            sortSoint.setVisible(true);
        }

        if(personnage.getListeDesSorts().contains(grosseBoulleEnnergie)){
            grosseBoulleEnergie.setTranslateX(decalageSort);
            decalageSort+=200;
            grosseBoulleEnergie.setVisible(true);
        }


        retourSortBoutton.setTranslateX(decalageSort);

    }

    public void coupEpee() throws EnnemiMortException {
        personnage.coupEpee(ennemi);
        tourEnnemi();
    }

    public void tirerFleche() throws EnnemiMortException {
        if(personnage.getTypeArme1().getNbFleche()>0){
            personnage.tirerFleche(ennemi);
            tourEnnemi();
        }

    }

    public void faireFleche(){
        personnage.typeArme1.recupererFleche(5);
        tourEnnemi();
    }

    public void boulleEnergie() throws EnnemiMortException {
        if(personnage.getPointsDeMana()>=boulleEnnergie.getCoutMana()) {
            personnage.utiliseSort(ennemi, boulleEnnergie);
            tourEnnemi();
        }
    }

    public void sortSoin() throws EnnemiMortException {
        if(personnage.getPointsDeMana()>=soin.getCoutMana()) {
            personnage.utiliseSort(personnage, soin);
            tourEnnemi();
        }
    }

    public void tourEnnemi(){
        if(ennemi.getPointsDeVie()>0){
            ennemi.morsure(personnage);
        }
        ennemi.reprendreMana(1);
        if(personnage.getClass()==Mage.class){
            personnage.reprendreMana(3);
        }
        else{
            personnage.reprendreMana(1);
        }
        pageCombat();
    }


    public void passerTour(){
        tourEnnemi();
    }

    public void retourPageDescriptionPerso(){
        BackgroundImage myBI= new BackgroundImage(new Image("https://cameronscookware.com/wp-content/uploads/2019/12/fantasy-world-background-best-of-fantasy-world-backgrounds-4k-download-2019-of-fantasy-world-background.jpg",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));
        pageDescriptionPerso();
    }

    public void pageMagasin(){
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");
        bouttonAffichagePerso.setVisible(false);
        int decalageMagasin=0;
        allerMagasin.setVisible(false);
        magasinListeObjet.setVisible(true);
        acherterBoulleEnergie.setVisible(false);
        acherterGrosseBoulleEnergie.setVisible(false);
        acherterGrosseBoulleEnergie.setVisible(false);
        acheterSoin.setVisible(false);



        if(!personnage.getListeDesSorts().contains(grosseBoulleEnnergie)){
            acherterGrosseBoulleEnergie.setVisible(true);
            acherterGrosseBoulleEnergie.setTranslateX(decalageMagasin);
            decalageMagasin+=200;
        }

        if(!personnage.getListeDesSorts().contains(boulleEnnergie)){
            acherterBoulleEnergie.setVisible(true);
            acherterBoulleEnergie.setTranslateX(decalageMagasin);
            decalageMagasin+=200;
        }

        if(!personnage.getListeDesSorts().contains(soin)){
            acheterSoin.setVisible(true);
            acheterSoin.setTranslateX(decalageMagasin);
            decalageMagasin+=200;
        }
        retourBoutique.setTranslateX(decalageMagasin);
    }

    public void acheterBoulleEnergie(){
        if(personnage.getNbPiece()>=50){
            personnage.perdrePiece(50);
            personnage.apprendreSort(boulleEnnergie);
        }
        pageMagasin();
    }

    public void acheterGrosseBoulleEnergie(){
        if(personnage.getNbPiece()>=100){
            personnage.perdrePiece(100);
            personnage.apprendreSort(grosseBoulleEnnergie);
        }
        pageMagasin();
    }

    public void grosseBoulleEnergie() throws EnnemiMortException {
        if(personnage.getPointsDeMana()>=grosseBoulleEnnergie.getCoutMana()) {
            personnage.utiliseSort(ennemi, grosseBoulleEnnergie);
            tourEnnemi();
        }
    }


    public void acheterSoin(){
        if(personnage.getNbPiece()>=50){
            personnage.perdrePiece(50);
            personnage.apprendreSort(soin);
        }
        pageMagasin();
    }
}
