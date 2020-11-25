package sample;
import java.awt.*;
import java.io.*;
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
import java.nio.charset.StandardCharsets;
import javafx.scene.text.Text;

import java.io.File;


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

    @FXML
    private Group allerSauvegarder;

    @FXML
    private Button sauvegarde;

    @FXML
    private Button bouttonCharger;

    @FXML
    private Group chargerPagePrincipale;

    @FXML
    private Button acheterEpee;

    @FXML
    private Group allerListeArme;

    @FXML
    private Group menuArme;

    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    private Personnage personnage;
    private Ennemi ennemi;
    private Image imagePersonnage;

    private Sort boulleEnnergie=new Sort();
    private Sort soin = new Sort(-8,new Effet(),4);
    private Sort grosseBoulleEnnergie=new Sort(8,new Effet(),8);

    private Epee epee= new Epee(5,10);
    private Arc arc =new Arc();


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        arc.setDegat(4);
        arc.setDurabilite(10);
        arc.setNbFlecheMax(20);


        pagePrincipale.setVisible(true);
        bouttonCreationPerso.setVisible(false);
        pagePrincipale.setTranslateX(-width/2+250);
        pagePrincipale.setTranslateY(-height/2+150);

        BackgroundImage myBI= new BackgroundImage(new Image("https://cameronscookware.com/wp-content/uploads/2019/12/fantasy-world-background-best-of-fantasy-world-backgrounds-4k-download-2019-of-fantasy-world-background.jpg",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));

        descriptionArmeEquipee.setTranslateX(-350);
        descriptionAffichagePerso.setTranslateX(-350);

        bouttonCharger.setTranslateY(500);

        chargerPagePrincipale.setTranslateX(-width/2+250);
    }

    public void allerPageCreerPersonnage(ActionEvent actionEvent) {
        chargerPagePrincipale.setVisible(false);
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
        personnage.recupererArme(epee);
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
        personnage.recupererArme(arc);

    }

    public void pageDescriptionPerso(){

        if(entrerNomPerso.isVisible()){
            personnage.setNom(entrerNomPerso.getText());
        }
        pagePrincipale.setVisible(false);
        chargerPagePrincipale.setVisible(false);



        allerSauvegarder.setTranslateX(-300);
        allerSauvegarder.setTranslateY(-300);
        allerSauvegarder.setVisible(true);
        magasinListeObjet.setVisible(false);
        allerSauvegarder.setVisible(true);
        sauvegarde.setVisible(true);
        menuArme.setVisible(false);
        descriptionAffichageEnnemi.setVisible(false);
        affichageMort.setVisible(false);
        affichageVictoire.setVisible(false);
        affichageEnnemi.setVisible(false);
        personnage.recuperer();

        nomCreationPerso.setVisible(false);
        affichagePerso.setVisible(true);
        descriptionAffichagePerso.setVisible(true);
        allerMagasin.setVisible(true);
        allerMagasin.setTranslateX(600);

        allerListeArme.setVisible(true);
        allerListeArme.setTranslateX(-100);
        allerListeArme.setTranslateY(-300);

        imagePersonnage=imageViewPersonnage.getImage();
        pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
        descriptionAffichagePerso.setTranslateY(-150);
        pointManaDescriptionPersonage.setTranslateY(20);
        pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
        niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));
        niveauDescriptionPersonage.setTranslateY(40);

        bouttonAffichagePerso.setVisible(true);
        bouttonAffichagePerso.setTranslateX(-300);
        bouttonAffichagePerso.setTranslateY(300);

        descriptionArmeEquipee.setVisible(true);
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
        allerListeArme.setVisible(false);
        BackgroundImage myBI= new BackgroundImage(new Image("https://static.wikia.nocookie.net/finalfantasy/images/c/c8/Battleback_coliseum.png/revision/latest?cb=20141030003602",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        gridPane.setBackground(new Background(myBI));

        if(personnage.getNiveau()==1){
            ennemi=new Ennemi();
            Epee epeeMechant=new Epee();
            ennemi.recupererArme(epeeMechant);
        }
        else{
            if(ennemi==null){
                ennemi=new Ennemi();
            }
            if(ennemi.getNiveau()<personnage.getNiveau()){
                ennemi.setPointsDeVieMax(personnage.getNiveau()*5);
                ennemi.setPointsDeManaMax(personnage.getNiveau()*5);
                ennemi.setNiveau(personnage.getNiveau());
            }
            if(!ennemi.getListeDesSorts().contains(boulleEnnergie)&& ennemi.getNiveau()>=3){
                ennemi.apprendreSort(boulleEnnergie);
            }
            if(!ennemi.getListeDesSorts().contains(grosseBoulleEnnergie)&& ennemi.getNiveau()>=4){
                ennemi.apprendreSort(grosseBoulleEnnergie);
            }
        }
        ennemi.recuperer();
        pageCombat();
    }

    public void pageCombat(){
        allerSauvegarder.setVisible(false);
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

            if(personnage.getTypeArme1()!=null){
                personnage.getTypeArme1().perdreDurabilite();
            }
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

    public void coupEpee() {
        try {
            personnage.coupEpee(ennemi);
        } catch (EnnemiMortException e) {
            affichageVictoire.setVisible(true);
            e.printStackTrace();
        }
        tourEnnemi();
    }

    public void tirerFleche() {
        if(personnage.getTypeArme1().getNbFleche()>0){
            try {
                personnage.tirerFleche(ennemi);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
                e.printStackTrace();
            }
            tourEnnemi();
        }

    }

    public void faireFleche() {
        personnage.typeArme1.recupererFleche(5);
        tourEnnemi();
    }

    public void boulleEnergie() {
        if(personnage.getPointsDeMana()>=boulleEnnergie.getCoutMana()) {
            try {
                personnage.utiliseSort(ennemi, boulleEnnergie);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
                e.printStackTrace();
            }
            tourEnnemi();
        }
    }

    public void sortSoin() {
        if(personnage.getPointsDeMana()>=soin.getCoutMana()) {
            try {
                personnage.utiliseSort(personnage, soin);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
                e.printStackTrace();
            }
            tourEnnemi();
        }
    }

    public void attaqueEnnemi(){
        if(ennemi.getListeDesSorts().isEmpty()){
            try {
                ennemi.morsure(personnage);
            } catch (PersonnageMortException e) {
                affichageMort.setVisible(true);
            }
        }
        else{
            attaqueProMana();
        }
    }


    public void attaqueProMana(){
        Sort sort=ennemi.getListeDesSorts().get(0);

        for (int cptSortEnnemi = 1; cptSortEnnemi < ennemi.getListeDesSorts().size(); cptSortEnnemi += 1) {

            if (ennemi.getListeDesSorts().get(cptSortEnnemi).getCoutMana() <= ennemi.getPointsDeMana() && ennemi.getListeDesSorts().get(cptSortEnnemi).getDegat()>sort.getDegat()) {
                sort=ennemi.getListeDesSorts().get(cptSortEnnemi);
            }

        }

        if(sort.getCoutMana()<=ennemi.getPointsDeMana()) {
            try {
                ennemi.utiliseSort(personnage, sort);
            } catch (EnnemiMortException e) {
                affichageMort.setVisible(true);
            }
        }
        else{
            try {
                ennemi.morsure(personnage);
            } catch (PersonnageMortException e) {
                affichageMort.setVisible(true);
            }
        }
    }

    public void tourEnnemi() {
        if(ennemi.getPointsDeVie()>0){
            attaqueEnnemi();
            try {
                ennemi.morsure(personnage);
            } catch (PersonnageMortException e) {
                affichageMort.setVisible(true);
                e.printStackTrace();
            }
        }

        if(personnage.getClass()==Mage.class){
            personnage.reprendreMana(3);
        }
        else{
            personnage.reprendreMana(1);
        }
        pageCombat();
    }


    public void passerTour() {
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
        allerListeArme.setVisible(false);
        allerSauvegarder.setVisible(false);
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

        if(!personnage.getListeDesArmes().contains(epee)){
            acheterEpee.setVisible(true);
            acheterEpee.setTranslateX(decalageMagasin);
            decalageMagasin+=200;
        }

        retourBoutique.setTranslateX(decalageMagasin);

        if(personnage.getClass()==Guerrier.class){
            affichagePerso.setTranslateX(-400);
        }
        if(personnage.getClass()==Chasseur.class){
            affichagePerso.setTranslateX(-300);
        }

        descriptionAffichagePerso.setTranslateX(-250);
        descriptionArmeEquipee.setTranslateX(-250);

        if(personnage.getClass()==Mage.class){
            descriptionArmeEquipee.setTranslateX(-350);
            descriptionAffichagePerso.setTranslateX(-350);
        }


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

    public void grosseBoulleEnergie() {
        if(personnage.getPointsDeMana()>=grosseBoulleEnnergie.getCoutMana()) {
            try {
                personnage.utiliseSort(ennemi, grosseBoulleEnnergie);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
                e.printStackTrace();
            }
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

    public void acheterEpee(){
        if(personnage.getNbPiece()>=30){
            personnage.perdrePiece(30);
            personnage.gagnereArme(epee);
        }
        pageMagasin();

    }


    public void sauvegarder(){

        File dir  = new File("sauvegarde/");
        File[] liste = dir.listFiles();
        for(File item : liste){
            item.delete();
        }

        try{
            File ff=new File("sauvegarde/"+personnage.getNom()+".txt"); // définir l'arborescence
            ff.createNewFile();
            FileWriter ffw=new FileWriter(ff);
            if(personnage.getClass().getName()=="sample.Mage"){
                ffw.write("1");
            }
            if(personnage.getClass().getName()=="sample.Chasseur"){
                ffw.write("2");
            }
            if(personnage.getClass().getName()=="sample.Guerrier"){
                ffw.write("3");
            }
            ffw.write(",");
            ffw.write(personnage.getNom());
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getPointsDeVie()));
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getPointsDeVieMax()));
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getPointsDeMana()));
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getPointsDeManaMax()));
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getNiveau()));
            ffw.write(",");
            ffw.write(Integer.toString(personnage.getNbPiece()));
            ffw.write("\n"); // forcer le passage à la ligne

            for(int cptArmeSauvegarde=0;cptArmeSauvegarde<personnage.getListeDesArmes().size();cptArmeSauvegarde+=1){
                ffw.write("1,");
                if(personnage.getListeDesArmes().get(cptArmeSauvegarde).getClass().getName()=="sample.Arc"){
                    ffw.write("1");
                }
                if(personnage.getListeDesArmes().get(cptArmeSauvegarde).getClass().getName()=="sample.Epee"){
                    ffw.write("2");
                }
                if(personnage.getListeDesArmes().get(cptArmeSauvegarde).getClass().getName()=="sample.Bouclier"){
                    ffw.write("3");
                }
                ffw.write(",");
                ffw.write(Integer.toString(personnage.getListeDesArmes().get(cptArmeSauvegarde).getDegat()));
                ffw.write(",");
                ffw.write(Integer.toString(personnage.getListeDesArmes().get(cptArmeSauvegarde).getBlocage()));
                ffw.write(",");
                ffw.write(Integer.toString(personnage.getListeDesArmes().get(cptArmeSauvegarde).getNbFleche()));
                ffw.write(",");
                System.out.println(personnage.getListeDesArmes().get(cptArmeSauvegarde).getDurabilite());
                ffw.write(Integer.toString(personnage.getListeDesArmes().get(cptArmeSauvegarde).getDurabilite()));
                ffw.write(",");
                ffw.write("\n");
            }

            for(int cptSortSauvegarde=0;cptSortSauvegarde<personnage.getListeDesSorts().size();cptSortSauvegarde+=1){
                ffw.write("2,");
                ffw.write(Integer.toString(personnage.getListeDesSorts().get(cptSortSauvegarde).getDegat()));
                ffw.write(",");
                ffw.write(Integer.toString(personnage.getListeDesSorts().get(cptSortSauvegarde).getCoutMana()));
                ffw.write("\n");
            }




            ffw.close();

        } catch (Exception e) {
            System.out.println("Erreur sauvegarder");
        }
    }

    public void charger(){
        affichagePerso.setTranslateX(-400);
        File dir  = new File("sauvegarde/");
        File[] liste = dir.listFiles();
        for(File item : liste){
            if(item.isFile())
            {
                try(BufferedReader br = new BufferedReader(new FileReader(item))) {
                    String line = br.readLine();
                    int i=0;

                    while (line != null) {
                        System.out.println(line);
                        if(i==0){
                            String[] ligne = line.split(",");

                            personnage=new Mage();
                            System.out.println("classe");


                            if(Integer.parseInt(ligne[0])==1){
                                personnage=new Mage();
                            }
                            if(Integer.parseInt(ligne[0])==2){
                                personnage=new Chasseur();
                                Image nouvelleImage= new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQfhvRyJp2XzvYeVTaMTgCENERCy1wVFTSdCg&usqp=CAU",100,100,false,false);
                                imageViewPersonnage.setImage(nouvelleImage);
                            }
                            if(Integer.parseInt(ligne[0])==3){
                                personnage=new Guerrier();
                                Image nouvelleImage= new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTWNdOOAfEZGi0pM4wh3W9C93M9z1gkadS_vg&usqp=CAU",200,100,false,false);
                                imageViewPersonnage.setImage(nouvelleImage);
                            }


                            personnage.setNom(ligne[1]);
                            personnage.setPointsDeVie(Integer.parseInt(ligne[2]));
                            personnage.setPointsDeVieMax(Integer.parseInt(ligne[3]));
                            personnage.setPointsDeMana(Integer.parseInt(ligne[4]));
                            personnage.setPointsDeManaMax(Integer.parseInt(ligne[5]));
                            personnage.setNiveau(Integer.parseInt(ligne[6]));
                            personnage.setNbPiece(Integer.parseInt(ligne[7]));
                        }
                        else{
                            String[] ligne = line.split(",");
                            if(Integer.parseInt(ligne[0])==1){
                                Arme arme;
                                if(Integer.parseInt(ligne[1])==1){
                                    arme=new Arc();
                                    arme.setDegat(Integer.parseInt((ligne[2])));
                                    arme.setBlocage(Integer.parseInt(ligne[3]));
                                    ((Arc) arme).setNbFlecheMax(Integer.parseInt(ligne[4]));
                                    personnage.recupererArme(arme);
                                    personnage.recuperer();
                                }
                                if(Integer.parseInt(ligne[1])==2){
                                    arme=new Epee(Integer.parseInt(ligne[2]),Integer.parseInt(ligne[5]));
                                    personnage.recupererArme(arme);
                                }
                                if(Integer.parseInt(ligne[1])==3){
                                    arme=new Bouclier();
                                    personnage.recupererArme(arme);
                                }

                            }
                            if(Integer.parseInt(ligne[0])==2){
                                Sort sort=new Sort(Integer.parseInt(ligne[1]),new Effet(),Integer.parseInt(ligne[2]));

                                if(sort.getDegat()==boulleEnnergie.getDegat()&&sort.getCoutMana()==boulleEnnergie.getCoutMana()){
                                    personnage.apprendreSort(boulleEnnergie);
                                }

                                if(sort.getDegat()==soin.getDegat()&&sort.getCoutMana()==soin.getCoutMana()){
                                    personnage.apprendreSort(soin);
                                }

                                if(sort.getDegat()==grosseBoulleEnnergie.getDegat()&&sort.getCoutMana()==grosseBoulleEnnergie.getCoutMana()){
                                    personnage.apprendreSort(grosseBoulleEnnergie);
                                }
                            }
                        }

                        line = br.readLine();
                        i++;
                    }
                    pageDescriptionPerso();
                }catch (Exception e){
                    System.out.println("Erreur chargement");
                }

            }
        }
    }

    public void listerArme(){
        allerMagasin.setVisible(false);
        sauvegarde.setVisible(false);
        bouttonCombat.setVisible(false);
        allerListeArme.setVisible(false);
        bouttonAffichagePerso.setVisible(false);
        menuArme.setVisible(true);
    }


}
