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
    private Group affichageVisctoire;

    @FXML
    private Label descriptionVictoire;

    @FXML
    private Button retourDescriptionVictoire;


    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    private Personnage personnage;
    private Ennemi ennemi;
    private Image imagePersonnage;

    private Sort boulleEnnergie=new Sort();
    private Sort soin = new Sort(-8,new Effet(),4);




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
        descriptionAffichageEnnemi.setVisible(false);
        affichageMort.setVisible(false);
        affichageVisctoire.setVisible(false);
        affichageEnnemi.setVisible(false);
        personnage.recuperer();

        nomCreationPerso.setVisible(false);
        personnage.setNom(entrerNomPerso.getText());
        affichagePerso.setVisible(true);
        descriptionAffichagePerso.setVisible(true);
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

    }

    public void fondCombat(){
        BackgroundImage myBI= new BackgroundImage(new Image("https://static.wikia.nocookie.net/finalfantasy/images/c/c8/Battleback_coliseum.png/revision/latest?cb=20141030003602",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        gridPane.setBackground(new Background(myBI));
        ennemi=new Ennemi();
        pageCombat();
    }

    public void pageCombat(){
        psserTourCombat.setVisible(true);
        armePersonage.setText("Arme équipée "+ personnage.getArme());
        pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
        pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
        niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));


        pointVieDescriptionEnnemi.setText(" PV : "+ennemi.getPointsDeVie()+"/"+ennemi.getPointsDeVieMax());
        pointManaDescriptionEnnemi.setText(" PM : "+ennemi.getPointsDeMana()+"/"+ennemi.getPointsDeManaMax());
        niveauDescriptionEnnemi.setText(" Niveau : "+Integer.toString(ennemi.getNiveau()));
        bouttonAttaqueArc.setVisible(false);
        listeSortPersonnageCombat.setVisible(false);

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
            personnage.gagnerNiveau();
            pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
            pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
            niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));
            psserTourCombat.setVisible(false);
            bouttonAttaqueEpee.setVisible(false);

            affichageVisctoire.setVisible(true);
            affichageVisctoire.setTranslateY(300);
            retourDescriptionVictoire.setTranslateX(400);
            retourDescriptionVictoire.setTranslateY(-200);
            descriptionVictoire.setTranslateY(-150);
        }


    }

    public void optionAttaque(){
        psserTourCombat.setVisible(false);
        bouttonCombat.setVisible(false);
        if(personnage.getArme()!=null) {
            if (personnage.getArme().getClass() == Epee.class) {
                bouttonAttaqueEpee.setVisible(true);
                bouttonAttaqueEpee.setTranslateX(-200);
                bouttonAttaqueEpee.setTranslateY(300);
                retourEpeeAttaqueBoutton.setTranslateX(200);
            } else if (personnage.getArme().getClass() == Arc.class) {
                bouttonAttaqueArc.setVisible(true);
                bouttonAttaqueArc.setVisible(true);
                bouttonAttaqueArc.setTranslateX(-200);
                bouttonAttaqueArc.setTranslateY(300);
                retourArcAttaqueBoutton.setTranslateX(200);
            }
        }
        else{
            pageCombat();
        }

    }

    public void optionSort(){
        psserTourCombat.setVisible(false);
        if(personnage.getClass()==Mage.class){
            bouttonCombat.setVisible(false);
            listeSortPersonnageCombat.setTranslateX(-200);
            listeSortPersonnageCombat.setTranslateY(300);
            listeSortPersonnageCombat.setVisible(true);
            int i=0;

            if(personnage.getListeDesSorts().contains(boulleEnnergie)){
                i+=200;
                boulleEnergie.setVisible(true);
            }

            if(personnage.getListeDesSorts().contains(soin)){
                sortSoint.setTranslateX(i);
                i+=200;
                sortSoint.setVisible(true);
            }

            retourSortBoutton.setTranslateX(i);
        }
        else{
            pageCombat();
        }
    }

    public void coupEpee(){
        personnage.coupEpee(ennemi);
        tourEnnemi();
    }

    public void tirerFleche(){
        if(personnage.getTypeArme1().getNbFleche()>0){
            personnage.tirerFleche(ennemi);
            tourEnnemi();
        }

    }

    public void boulleEnergie(){
        if(personnage.getPointsDeMana()>boulleEnnergie.getCoutMana()) {
            personnage.utiliseSort(ennemi, boulleEnnergie);
            tourEnnemi();
        }
    }

    public void sortSoin(){
        if(personnage.getPointsDeMana()>soin.getCoutMana()) {
            personnage.utiliseSort(personnage, soin);
            tourEnnemi();
        }
    }

    public void tourEnnemi(){
        if(ennemi.getPointsDeVie()>0){
            ennemi.morsure(personnage);
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
}
