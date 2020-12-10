package sample;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.*;
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
import javafx.application.Platform;
import javafx.util.Duration;


import java.io.File;


public class Controller implements Initializable{


    /**
     * Instanciation dans le Controller des éléments
     * défini dans le fxml
     * **/

    @FXML
    private GridPane gridPane;

    @FXML
    private Button bouttonCreer;

    @FXML
    private ImageView bouttonMage;

    @FXML
    private ImageView bouttonGuerrier;

    @FXML
    private ImageView bouttonChasseur;

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
    private Group animationEpee;

    @FXML
    private Group animationArc;

    @FXML
    private Group animationBouclier;

    @FXML
    private Group animationBouleEnergie;

    @FXML
    private Group animationGrosseBouleEnergie;

    @FXML
    private Group animationSoin;

    @FXML
    private Group animationMur;

    @FXML
    private Group animationWorld;

    @FXML
    private Group animationFullCowl;

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
    private Image sauvegarde;

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

    @FXML
    private ComboBox listeArme;

    @FXML
    private ComboBox listeArme2;

    @FXML
    private Button acheterArc;

    @FXML
    private Group menuArme2;

    @FXML
    private Label arme1;

    @FXML
    private Label arme2;

    @FXML
    public TextArea console;

    @FXML
    private Group grConsole;

    @FXML
    private Button theWorldo;

    @FXML
    private Button fulCowlo;

    @FXML
    private Button leMuro;

    @FXML
    private Group allerChoixHistoire;

    @FXML
    private Group choixHistoire;

    @FXML
    private Button choixAvenetureMage;

    @FXML
    private Button choisirHistoireGuerrier;

    @FXML
    private Button acheterBouclier;

    @FXML
    private Button retourListeArme;

    @FXML
    private Group retourArme;

    @FXML
    private ProgressBar barrePersoPv;

    @FXML
    private ProgressBar barrePersoMana;

    @FXML
    private ProgressBar barreEnnemiPv;

    @FXML
    private ProgressBar barreEnnemiMana;

    @FXML
    private Group labelClasse;

    @FXML
    private Group labelNom;

    @FXML
    private Group groupLoot;

    @FXML
    private Group allerQuetes;

    @FXML
    private Group listeQuete;

    @FXML
    private Label queteFinirAventure;

    @FXML
    private Label argent;

    /**
     * récupération de la taille de l'écran
     */
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    /**
     * definition du personnage
     */
    private Personnage personnage;

    /**
     * definition de l'ennemi
     */
    private Ennemi ennemi;

    /**
     * definition de l'image du perso
     */
    private Image imagePersonnage;

    /**
     * definition des sorts sans effets
     */
    private Sort boulleEnnergie=new Sort();
    private Sort soin = new Sort(-8,new Effet(),4);
    private Sort grosseBoulleEnnergie=new Sort(8,new Effet(),8);

    /**
     * definition des épées
     */
    private Epee epee= new Epee();
    private Epee epeeMoyenne= new Epee(7,0,15,new Effet());
    private Epee epeeBien= new Epee(10,0,20,new Effet());
    private Epee epeeRare= new Epee(15,0,30,new Effet());
    private Epee epeeExcellent= new Epee(30,0,50,new Effet());

    /**
     * definition des arcs
     */
    private Arc arc= new Arc();
    private Arc arcMoyenne= new Arc(7,0,20,20,15,new Effet());
    private Arc arcBien= new Arc(10,0,30,30,20,new Effet());
    private Arc arcRare= new Arc(15,0,50,50,30,new Effet());
    private Arc arcExcellent= new Arc(30,0,70,70,50,new Effet());

    /**
     * definition du bouclier
     */
    private Bouclier bouclier=new Bouclier();

    /**
     * definition des sorts
     */
    private Effet timeStop=new Effet(1,0,2);
    private Sort theWorld=new Sort(0,timeStop,5);

    private Effet boostForce=new Effet(4,0,3);
    private Sort fullCowl = new Sort(0,boostForce,4);

    private Effet invulnerabilite=new Effet(2,0,1);
    public Sort leMur=new Sort(0,invulnerabilite,2);

    /**
     * definition des ennemis de l'histoire
     */
    private Ennemi ennemi1,ennemi2,ennemi3,ennemi4,ennemi5;


    /**
     * definition des numeros correspondant au status des quetes
     */
    private int numeroChoixHistoire;

    private int milleQuete;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


        console.setEditable(false);

        /**
         * definir l'arc
         */
        arc.setDegat(4);
        arc.setDurabilite(10);
        arc.setNbFlecheMax(20);

        retourListeArme.setTranslateY(200);

        /**
         * afficher la page principale et la placer au milieu
         */
        pagePrincipale.setVisible(true);
        bouttonCreationPerso.setVisible(false);
        pagePrincipale.setTranslateX(-width/2+350);
        pagePrincipale.setTranslateY(-height/2+150);

        /**
         * afficher l'image du background
         */
        Image img = null;
        try {
            img = new Image(new FileInputStream("src/sample/images/paysage.jpg"),width,height,false,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BackgroundImage myBI= new BackgroundImage(img,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));

        /**
         * mettre le boutton charger à sa place
         */
        bouttonCharger.setTranslateY(500);

        chargerPagePrincipale.setTranslateX(-width/2+350);

    }

    public void allerPageCreerPersonnage(ActionEvent actionEvent) {

        labelClasse.setVisible(true);
        chargerPagePrincipale.setVisible(false);
        pagePrincipale.setVisible(false);
        bouttonCreationPerso.setVisible(true);

        /**
         * mise en place des textes de description au survole des classes
         */
        descriptionMage.setText("Le mage est un être puissant capable de déchainer les éléments contre ses ennemies\n et de se protéger grace à ses sorts malgrés sa faible résistance physique");
        descriptionGuerrier.setText("Le guerrier est un combatant féroce ne reculant jamais face à un combat.\n Avec ses capacités exceptionnelles presque rien ne peut l'arreter, à part un livre");
        descriptionChasseur.setText("BLA BLA Nature, BLA BLA Archer. Une classe équilibré pour les casu \n PS : Ceci n'est pas la classe préféré d'un des développeurs");
    }

    /**
     *affichage du texte au survol
     */
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

    /**
     * creer les différentes classes
     */
    public void creerMage(){
        labelNom.setVisible(true);
        labelClasse.setVisible(false);
        bouttonCreationPerso.setVisible(false);
        descriptionMage.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Mage();
        validerNom.setTranslateX(300);

        /**
         * afficher l'image du mage
         */
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/mage.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage = new Image(fin,100,200,false,false);

        imageViewPersonnage.setImage(nouvelleImage);

        /**
         * apprendre les compétences de base du mage
         */

        personnage.apprendreSort(boulleEnnergie);
        personnage.apprendreSort(soin);


    }

    public void creerGuerrier(){
        labelNom.setVisible(true);
        labelClasse.setVisible(false);
        bouttonCreationPerso.setVisible(false);
        descriptionGuerrier.setVisible(false);
        nomCreationPerso.setVisible(true);
        personnage=new Guerrier();
        validerNom.setTranslateX(300);

        /**
         * afficher l'image du guerrier
         */
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/guerrier.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage= new Image(fin,200,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);

        /**
         * apprendre les compétences de base du guerrier
         */

        personnage.recupererArme(epee);
        personnage.apprendreSort(fullCowl);

    }

    public void creerChasseur(){
        labelNom.setVisible(true);
        labelClasse.setVisible(false);
        bouttonCreationPerso.setVisible(false);
        descriptionChasseur.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Chasseur();

        validerNom.setTranslateX(300);

        /**
         * afficher l'image du chasseur
         */

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/chasseur.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage= new Image(fin,100,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);

        /**
         * apprendre les compétences de base du chasseur
         */

        personnage.recupererArme(arc);
        personnage.apprendreSort(theWorld);
        personnage.apprendreSort(leMur);

    }

    public void pageDescriptionPerso(){

        /**
         * mise en place des informations du perso
         */

        listeQuete.setVisible(false);
        allerQuetes.setVisible(true);
        labelNom.setVisible(false);
        barrePersoPv.setStyle("-fx-accent: red;");
        barrePersoPv.setProgress(1F);
        barrePersoMana.setStyle("-fx-accent: blue;");
        barrePersoMana.setProgress(1F);

        barreEnnemiPv.setStyle("-fx-accent: red;");
        barreEnnemiPv.setProgress(1F);
        barreEnnemiMana.setStyle("-fx-accent: blue;");
        barreEnnemiMana.setProgress(1F);

        /**
         * verification du status de la quete
         */
        if(personnage.getNbPiece()>=1000){
            milleQuete=1;
        }

        retourArme.setVisible(false);
        grConsole.setVisible(false);
        choixHistoire.setVisible(false);

        /**
         * verification de la durabilité de l'arme
         */
        if(personnage.getTypeArme1()!=null&& personnage.getTypeArme1().getDurabilite()==0){
            personnage.getListeDesArmes().remove(personnage.getTypeArme1());
            personnage.setTypeArme1(null);
        }

        if(entrerNomPerso.isVisible()){
            personnage.setNom(entrerNomPerso.getText());
        }
        pagePrincipale.setVisible(false);
        chargerPagePrincipale.setVisible(false);


        if(ennemi5==null && personnage.getNiveau()==1) {
            allerChoixHistoire.setVisible(true);
        }


        allerSauvegarder.setVisible(true);
        magasinListeObjet.setVisible(false);
        allerSauvegarder.setVisible(true);
        menuArme.setVisible(false);
        menuArme2.setVisible(false);
        descriptionAffichageEnnemi.setVisible(false);
        affichageMort.setVisible(false);
        affichageVictoire.setVisible(false);
        affichageEnnemi.setVisible(false);
        personnage.recuperer();

        nomCreationPerso.setVisible(false);
        affichagePerso.setVisible(true);

        descriptionAffichagePerso.setVisible(true);


        allerMagasin.setVisible(true);

        allerListeArme.setVisible(true);


        imagePersonnage=imageViewPersonnage.getImage();
        pointVieDescriptionPersonage.setText(" PV : "+personnage.getPointsDeVie()+"/"+personnage.getPointsDeVieMax());
        pointManaDescriptionPersonage.setText(" PM : "+personnage.getPointsDeMana()+"/"+personnage.getPointsDeManaMax());
        niveauDescriptionPersonage.setText(" Niveau : "+Integer.toString(personnage.getNiveau()));

        if(ennemi5!=null || ennemi!=null && ennemi.getNiveau()>1 || personnage.getNiveau()>5) {
            bouttonAffichagePerso.setVisible(true);
        }

        /**
         * affichage de l'arme et des pièces du joueur
         */
        descriptionArmeEquipee.setVisible(true);

        if(personnage.getArme()!=null){
            armePersonage.setText("Arme équipée "+ personnage.getArme());
        }
        else{
            armePersonage.setText("Pas d'arme équipée");
        }
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");


        if(ennemi5==null){
            FileInputStream fin = null;
            try {
                fin = new FileInputStream("src/sample/images/ennemi.png");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Image nouvelleImage = new Image(fin, 100, 100, false, false);

            imageViewEnnemi.setImage(nouvelleImage);
        }
    }

    public void fondCombat(){
        allerQuetes.setVisible(false);
        console.appendText("Le combat commence, allez vous survivre ? Rien de moins sûr\n");
        allerChoixHistoire.setVisible(false);
        allerListeArme.setVisible(false);

        /**
         * changement de l'image du background
         */
        Image img = null;
        try {
            img = new Image(new FileInputStream("src/sample/images/foret.png"),width,height,false,false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BackgroundImage myBI= new BackgroundImage(img,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        gridPane.setBackground(new Background(myBI));

        /**
         * instanciation de l'ennemi
         */
        if(ennemi5==null) {

            if (personnage.getNiveau() == 1) {
                ennemi = new Ennemi();
                Epee epeeMechant = new Epee();
                ennemi.recupererArme(epeeMechant);
            } else {
                if (ennemi == null) {
                    ennemi = new Ennemi();
                }
                if (ennemi.getNiveau() < personnage.getNiveau()) {
                    ennemi.setPointsDeVieMax(personnage.getNiveau() * 5);
                    ennemi.setPointsDeManaMax(personnage.getNiveau() * 5);
                    ennemi.setNiveau(personnage.getNiveau());
                }
                if (!ennemi.getListeDesSorts().contains(boulleEnnergie) && ennemi.getNiveau() >= 3) {
                    ennemi.apprendreSort(boulleEnnergie);
                }
                if (!ennemi.getListeDesSorts().contains(grosseBoulleEnnergie) && ennemi.getNiveau() >= 4) {
                    ennemi.apprendreSort(grosseBoulleEnnergie);
                }
            }
        }

        else{
            if(personnage.getNiveau()==1){
                ennemi=ennemi1;
            }
            else{
                if(personnage.getNiveau()==2){
                    ennemi=ennemi2;
                }
                else{
                    if(personnage.getNiveau()==3){
                        ennemi=ennemi3;
                    }
                    else{
                        if(personnage.getNiveau()==4){
                            ennemi=ennemi4;
                        }
                        else{
                            if(personnage.getNiveau()==5){
                                ennemi=ennemi5;
                            }
                        }
                    }
                }
            }
        }
        ennemi.recuperer();


        pageCombat();
    }

    public void pageCombat(){
        groupLoot.setVisible(false);
        /**
         * mise à jour des informations du perso à chaque tour
         */
        Double vieMax=Double.valueOf(personnage.getPointsDeVieMax());
        Double vie=Double.valueOf(personnage.getPointsDeVie());
        Double manaMax=Double.valueOf(personnage.getPointsDeManaMax());
        Double mana=Double.valueOf(personnage.getPointsDeMana());
        barrePersoPv.setProgress(vie/vieMax);
        barrePersoMana.setProgress(mana/manaMax);
        grConsole.setVisible(true);
        grConsole.setTranslateX(width/2-150);
        grConsole.setTranslateY(height/2-150);
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

            bouttonAttaqueEpee.setVisible(false);


            descriptionAffichageEnnemi.setVisible(true);


            bouttonCombat.setVisible(true);

            psserTourCombat.setVisible(true);


            if(personnage.getPointsDeVie()<=0){
                psserTourCombat.setVisible(false);
                bouttonAttaqueEpee.setVisible(false);
                bouttonCombat.setVisible(false);

                affichageMort.setVisible(true);
                console.appendText("L'ennemi vous a infligé le dégat de trop, vous tombez à terre sans vie \n");
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

            console.appendText("Votre dernière attaque à été tout ce que a sufiie  pour faire plier votre adversaire \n");
            groupLoot.setVisible(true);

            if(ennemi.getNiveau()==5){
                console.appendText("Vous avez fini l'aventure principale, félicitation le monde est sauvé \n");
            }


            /**
             * gestion de la durabilité de l'arme
             */
            if(personnage.getTypeArme1()!=null){
                personnage.getTypeArme1().perdreDurabilite();
            }

            /**
             * désallocation de l'instance de l'ennemi
             */
            if(ennemi5!=null) {
                if (ennemi1 == ennemi) {
                    ennemi1 = null;
                } else {
                    if (ennemi2 == ennemi) {
                        ennemi2=null;
                    } else {
                        if (ennemi3 == ennemi) {
                            ennemi3 = null;
                        } else {
                            if (ennemi4 == ennemi) {
                                ennemi4 = null;
                            } else {
                                if (ennemi5 == ennemi) {
                                    ennemi5 = null;
                                }
                            }
                        }
                    }
                }
            }
        }

        /**
         * changmement ennemi en boss de l'histoire
         */
        if(ennemi==ennemi5 && numeroChoixHistoire==3) {
            FileInputStream fin = null;
            try {
                fin = new FileInputStream("src/sample/images/ennemiBossChasseur.png");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Image nouvelleImage = new Image(fin, 100, 100, false, false);

            imageViewEnnemi.setImage(nouvelleImage);
        }
        else{
            if(ennemi==ennemi5 && numeroChoixHistoire==2) {
                FileInputStream fin = null;
                try {
                    fin = new FileInputStream("src/sample/images/ennemiBossGuerrier.png");
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                Image nouvelleImage = new Image(fin, 100, 100, false, false);

                imageViewEnnemi.setImage(nouvelleImage);
            }
            else{
                if(ennemi==ennemi5 && numeroChoixHistoire==1) {
                    FileInputStream fin = null;
                    try {
                        fin = new FileInputStream("src/sample/images/ennemiBossMage.png");
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    Image nouvelleImage = new Image(fin, 100, 100, false, false);

                    imageViewEnnemi.setImage(nouvelleImage);
                }
                else{

                }
            }
        }


    }

    public void optionAttaque(){

        /**
         * affichage des différentes attaque possible selon l'arme équipée
         */
        int decalageBouttonAttaque=-200;
        psserTourCombat.setVisible(false);
        bouttonCombat.setVisible(false);
        if(personnage.getArme()!=null) {
            if (personnage.getArme().getClass() == Epee.class) {
                bouttonAttaqueEpee.setVisible(true);
                bouttonAttaqueEpee.setTranslateX(decalageBouttonAttaque);
                decalageBouttonAttaque+=400;
            } else if (personnage.getArme().getClass() == Arc.class) {
                bouttonAttaqueArc.setVisible(true);
                bouttonAttaqueArc.setTranslateX(decalageBouttonAttaque);
                decalageBouttonAttaque+=400;
                fabriquerFleche.setTranslateX(decalageBouttonAttaque);
                decalageBouttonAttaque+=200;
            }
        }
        else{
            bouttonAttaqueSansArme.setTranslateX(decalageBouttonAttaque);
            bouttonAttaqueSansArme.setVisible(true);
        }
        retourEpeeAttaqueBoutton.setTranslateX(decalageBouttonAttaque);
        retourArcAttaqueBoutton.setTranslateX(decalageBouttonAttaque);
        retourSansArmeAttaqueBoutton.setTranslateX(decalageBouttonAttaque);

    }

    public void optionSort(){
        /**
         * affichage des sorts appris
         */
        psserTourCombat.setVisible(false);
        bouttonCombat.setVisible(false);
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

        if(personnage.getListeDesSorts().contains(theWorld)){
            theWorldo.setTranslateX(decalageSort);
            decalageSort+=200;
            theWorldo.setVisible(true);
        }

        if(personnage.getListeDesSorts().contains(fullCowl)){
            fulCowlo.setTranslateX(decalageSort);
            decalageSort+=200;
            fulCowlo.setVisible(true);
        }

        if(personnage.getListeDesSorts().contains(leMur)){
            leMuro.setTranslateX(decalageSort);
            decalageSort+=200;
            leMuro.setVisible(true);
        }


        retourSortBoutton.setTranslateX(decalageSort);

    }

    /**
     * définition des attaques et sort
     */
    public void coupEpee() {
        console.appendText("Vous prenner votre épée et infligez un violent l'ennemi infligeant ");
        epee.animationArme(animationEpee);
        try {
            personnage.coupEpee(ennemi,console);
        } catch (EnnemiMortException e) {
            affichageVictoire.setVisible(true);
        }
        tourEnnemi();
    }

    public void tirerFleche() {
        if(personnage.getTypeArme1().getNbFleche()>0){
            arc.animationArme(animationArc);
            console.appendText("Vous tirer une puissante fleche dans le corps de l'ennemi ");
            try {
                personnage.tirerFleche(ennemi,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }

    }

    public void faireFleche() {
        console.appendText("Vous fabriquez des flêches\n");
        personnage.typeArme1.recupererFleche(5);
        tourEnnemi();
    }

    public void boulleEnergie() {
        if(personnage.getPointsDeMana()>=boulleEnnergie.getCoutMana()) {
            animationBoulleEnergie(animationBouleEnergie);
            console.appendText("Vous concentrez votre mana dans une boulle que vous envoyez sur l'ennemi ");
            try {
                personnage.utiliseSort(ennemi, boulleEnnergie,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationBoulleEnergie(Group affichageBoulleEnergie) {
        affichageBoulleEnergie.setTranslateX(-100);
        affichageBoulleEnergie.setVisible(true);
        Timeline tx = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageBoulleEnergie.translateXProperty(), 0)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageBoulleEnergie.translateXProperty(), 550))
        );

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                tx.play();
            }
        };
        t1.start();
        final Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                affichageBoulleEnergie.setVisible(false);
            }
        };
        t2.start();
    }

    public void sortSoin() {
        if(personnage.getPointsDeMana()>=soin.getCoutMana()) {
            animationSoin(animationSoin);
            console.appendText("Vous concentrez votre mana pour soigner vos blessure ");
            try {
                personnage.utiliseSort(personnage, soin,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationSoin(Group affichageSoin) {
        affichageSoin.setTranslateX(-100);
        affichageSoin.setScaleX(2);
        affichageSoin.setScaleY(2);
        affichageSoin.setVisible(true);

        Timeline ta = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageSoin.rotateProperty(), 0)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageSoin.rotateProperty(), 90))
        );

        Timeline tb = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageSoin.rotateProperty(), 0)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageSoin.rotateProperty(), -90))
        );

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                ta.setCycleCount(3);
                tb.setCycleCount(3);
                ta.play();
                tb.play();
            }
        };
        t1.start();
        final Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                affichageSoin.setVisible(false);
            }
        };
        t2.start();
    }

    public void sortTheWorld(){
        if(personnage.getPointsDeMana()>=theWorld.getCoutMana()) {
            animationWorld(animationWorld);
            console.appendText("Vous utiliser votre mana pour arreter le flux du temps pendant un tour ");
            try {
                personnage.utiliseSort(ennemi, theWorld,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationWorld(Group affichageWorld) {
        affichageWorld.setTranslateX(-160);
        affichageWorld.setRotate(90);
        affichageWorld.setScaleX(5);
        affichageWorld.setScaleY(5);
        affichageWorld.setVisible(true);

        Timeline ta = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageWorld.scaleXProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageWorld.scaleXProperty(), 5))
        );

        Timeline tb = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageWorld.scaleYProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageWorld.scaleYProperty(), 5))
        );

        ta.play();
        tb.play();
        ta.setCycleCount(3);
        tb.setCycleCount(3);
    }

    public void finAnimationWorld() {
        animationWorld.setVisible(false);
    }

    public void fullCowl(){
        if(personnage.getPointsDeMana()>=fullCowl.getCoutMana()) {
            animationFullCowl(animationFullCowl);
            console.appendText("Vous utiliser votre mana pour booster vos dégat à l'arme blance pendant quelques tours ");
            try {
                personnage.utiliseSort(personnage, fullCowl,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationFullCowl(Group affichageFullCowl) {
        affichageFullCowl.setTranslateX(-130);
        affichageFullCowl.setVisible(true);

        Timeline ta = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageFullCowl.scaleXProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageFullCowl.scaleXProperty(), 5))
        );

        Timeline tb = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageFullCowl.scaleYProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageFullCowl.scaleYProperty(), 5))
        );

        ta.play();
        tb.play();
        ta.setCycleCount(3);
        tb.setCycleCount(3);
    }

    public void finAnimationFullCowl() {
        animationFullCowl.setVisible(false);
    }

    public void leMur(){
        if(personnage.getPointsDeMana()>=leMur.getCoutMana()) {
            animationMur(animationMur);
            console.appendText("Vous invoquez un mur de pierre pour bloquer la prochaine attaque adverse ");

            try {
                personnage.utiliseSort(personnage, leMur,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationMur(Group affichageMur) {
        affichageMur.setTranslateX(-50);
        affichageMur.setTranslateY(50);
        affichageMur.setVisible(true);

        Timeline ta = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageMur.scaleXProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageMur.scaleXProperty(), 5))
        );

        Timeline tb = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageMur.scaleYProperty(), 3)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageMur.scaleYProperty(), 10))
        );

        ta.play();
        tb.play();
        ta.setCycleCount(3);
        tb.setCycleCount(3);
    }

    public void finAnimationMur() {
        animationMur.setVisible(false);
    }

    /**
     * gestion de l'attaque ennemi
     */
    public void attaqueEnnemi(){
        if(ennemi.getListeDesSorts().isEmpty()){
            console.appendText("L'ennemie bondit vers vous, les crocs à l'avant infligeant ");
            try {
                ennemi.morsure(personnage,console);
            } catch (PersonnageMortException e) {
                affichageMort.setVisible(true);
            }
        }
        else{
            attaqueProMana();
        }
    }

    /**
     * gestion des attaques ennemies en priorisant les sorts
     */
    public void attaqueProMana(){
        Sort sort=ennemi.getListeDesSorts().get(0);

        for (int cptSortEnnemi = 1; cptSortEnnemi < ennemi.getListeDesSorts().size(); cptSortEnnemi += 1) {

            if (ennemi.getListeDesSorts().get(cptSortEnnemi).getCoutMana() <= ennemi.getPointsDeMana() && ennemi.getListeDesSorts().get(cptSortEnnemi).getDegat()>sort.getDegat()) {
                sort=ennemi.getListeDesSorts().get(cptSortEnnemi);
            }

        }

        if(sort.getCoutMana()<=ennemi.getPointsDeMana()) {
            console.appendText("L'ennemie invoque l'ennergie des ether pour vous attaquer ");
            try {
                ennemi.utiliseSort(personnage, sort,console);

            } catch (EnnemiMortException e) {
                affichageMort.setVisible(true);
            }

        }
        else{
            try {
                ennemi.morsure(personnage,console);
            } catch (PersonnageMortException e) {
                affichageMort.setVisible(true);
            }
        }
    }

    public void tourEnnemi() {
        Double vieEnnemiMax=Double.valueOf(ennemi.getPointsDeVieMax());
        Double vieEnnemi=Double.valueOf(ennemi.getPointsDeVie());
        Double manaEnnemiMax=Double.valueOf(ennemi.getPointsDeManaMax());
        Double manaEnnemi=Double.valueOf(ennemi.getPointsDeMana());
        barreEnnemiPv.setProgress(vieEnnemi/vieEnnemiMax);

        if(ennemi.getPointsDeVie()>0){
            if(ennemi.getListeEffet().getFreeze()<=0) {
                attaqueEnnemi();
                /*
                try {
                    ennemi.morsure(personnage,console);
                } catch (PersonnageMortException e) {
                    affichageMort.setVisible(true);
                }
                */
            }
            else{
                ennemi.getListeEffet().setFreeze(ennemi.getListeEffet().getFreeze()-1);
            }
        }

        /**
         * quantite de mana recuperé à chaque tour
         */
        if(personnage.getClass()==Mage.class){
            personnage.reprendreMana(3);
        }
        else{
            personnage.reprendreMana(1);
        }

        if(personnage.getInvulnerable()>=1) {
            personnage.setInvulnerabilite(personnage.getInvulnerable() - 1);
        }
        barreEnnemiMana.setProgress(manaEnnemi/manaEnnemiMax);
        pageCombat();
    }


    public void passerTour() {
        console.appendText("Vous rester immobile, le regard perdu dans la futilité de votre existance.Une stratégie sans faille\n");
        tourEnnemi();
    }

    public void retourPageDescriptionPerso(){
        Image img = null;
        try {
            img = new Image(new FileInputStream("src/sample/images/paysage.jpg"),width,height,false,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BackgroundImage myBI= new BackgroundImage(img,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));
        pageDescriptionPerso();
    }

    public void pageMagasin(){
        allerQuetes.setVisible(false);
        allerChoixHistoire.setVisible(false);
        allerListeArme.setVisible(false);
        allerSauvegarder.setVisible(false);
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");
        bouttonAffichagePerso.setVisible(false);
        allerMagasin.setVisible(false);
        magasinListeObjet.setVisible(true);
        acherterBoulleEnergie.setVisible(false);
        acherterGrosseBoulleEnergie.setVisible(false);
        acherterGrosseBoulleEnergie.setVisible(false);
        acheterSoin.setVisible(false);



        // magasin
        int nbElementShop=0;
        int cptLimit=0;

        /**
         * charger objet aleatoire (3 au maximum / 0 au minimum)
         */
        choixAleatoireMagasin();

    }


    /**
     * achat des différents sort et objets
     */

    public void acheterBoulleEnergie(){
        if(personnage.getNbPiece()>=50){
            personnage.perdrePiece(50);
            personnage.apprendreSort(boulleEnnergie);
            boulleEnergie.setVisible(false);
        }
        pageMagasin();
    }

    public void acheterGrosseBoulleEnergie(){
        if(personnage.getNbPiece()>=100){
            personnage.perdrePiece(100);
            personnage.apprendreSort(grosseBoulleEnnergie);
            grosseBoulleEnergie.setVisible(false);
        }
        pageMagasin();
    }

    public void acheterBouclier(){
        if(personnage.getNbPiece()>=40){
            personnage.perdrePiece(40);
            personnage.gagnereArme(bouclier);
            acheterBouclier.setVisible(false);
        }
        pageMagasin();
    }

    public void grosseBoulleEnergie() {
        if(personnage.getPointsDeMana()>=grosseBoulleEnnergie.getCoutMana()) {
            animationGrosseBoulleEnergie(animationGrosseBouleEnergie);
            console.appendText("Vous invoquez une enorme quantité d'energie dans une attaque qui va être dur à encaisser pour l'adversaire ");
            try {
                personnage.utiliseSort(ennemi, grosseBoulleEnnergie,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void animationGrosseBoulleEnergie(Group affichageGrosseBoulleEnergie) {
        affichageGrosseBoulleEnergie.setTranslateX(-100);
        //On affiche l'épee
        affichageGrosseBoulleEnergie.setVisible(true);
        //On défini une timeline, au début de l'animation, l'épee est positionné à 0 en X,
        //Sur les 100 milisecondes suivantes, l'épee se déplace de 80 en X
        Timeline tx = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageGrosseBoulleEnergie.translateXProperty(), 0)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageGrosseBoulleEnergie.translateXProperty(), 550))
        );

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                //L'animation est joué
                tx.play();
            }
        };
        t1.start();
        final Thread t2 = new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                affichageGrosseBoulleEnergie.setVisible(false);
            }
        };
        t2.start();
    }

    public void acheterSoin(){
        if(personnage.getNbPiece()>=50){
            personnage.perdrePiece(50);
            personnage.apprendreSort(soin);
            acheterSoin.setVisible(false);
        }
        pageMagasin();
    }

    public void acheterEpee(){
        if(personnage.getNbPiece()>=30){
            personnage.perdrePiece(30);
            personnage.gagnereArme(epee);
            acheterEpee.setVisible(false);
        }
        pageMagasin();

    }


    public void acheterArc(){
        if(personnage.getNbPiece()>=30){
            personnage.perdrePiece(30);
            personnage.gagnereArme(arc);
            acheterArc.setVisible(false);
        }
        pageMagasin();
    }

    /**
     * organisation du fichier expliqué dans le rapport
     */
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
            ffw.write(",");
            ffw.write(Integer.toString(numeroChoixHistoire));
            ffw.write(",");
            ffw.write(Integer.toString(milleQuete));
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
                ffw.write(Integer.toString(personnage.getListeDesArmes().get(cptArmeSauvegarde).getDurabilite()));
                ffw.write(",");
                ffw.write("\n");
            }

            for(int cptSortSauvegarde=0;cptSortSauvegarde<personnage.getListeDesSorts().size();cptSortSauvegarde+=1){
                ffw.write("2,");
                if(personnage.getListeDesSorts().get(cptSortSauvegarde).getEffet()!=null){
                    ffw.write(Integer.toString(personnage.getListeDesSorts().get(cptSortSauvegarde).getEffet().getType()));
                    ffw.write(",");
                    ffw.write(Integer.toString(personnage.getListeDesSorts().get(cptSortSauvegarde).getEffet().getDegat()));
                    ffw.write(",");
                    ffw.write(Integer.toString(personnage.getListeDesSorts().get(cptSortSauvegarde).getEffet().getDuree()));
                    ffw.write(",");
                }
                else{
                    ffw.write(0);
                    ffw.write(",");
                    ffw.write(0);
                    ffw.write(",");
                    ffw.write(0);
                    ffw.write(",");
                }

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
        File dir  = new File("sauvegarde/");
        File[] liste = dir.listFiles();
        for(File item : liste){
            if(item.isFile())
            {
                try(BufferedReader br = new BufferedReader(new FileReader(item))) {
                    String line = br.readLine();
                    int i=0;

                    while (line != null) {
                        if(i==0){
                            String[] ligne = line.split(",");

                            personnage=new Mage();


                            if(Integer.parseInt(ligne[0])==1){
                                personnage=new Mage();
                            }
                            if(Integer.parseInt(ligne[0])==2){
                                personnage=new Chasseur();
                                FileInputStream fin = null;
                                try {
                                    fin = new FileInputStream("src/sample/images/chasseur.png");
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Image nouvelleImage= new Image(fin,100,100,false,false);
                                imageViewPersonnage.setImage(nouvelleImage);
                            }
                            if(Integer.parseInt(ligne[0])==3){
                                personnage=new Guerrier();
                                FileInputStream fin = null;
                                try {
                                    fin = new FileInputStream("src/sample/images/guerrier.png");
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                }
                                Image nouvelleImage= new Image(fin,200,100,false,false);
                                imageViewPersonnage.setImage(nouvelleImage);
                            }

                            personnage.setNom(ligne[1]);
                            personnage.setPointsDeVie(Integer.parseInt(ligne[2]));
                            personnage.setPointsDeVieMax(Integer.parseInt(ligne[3]));
                            personnage.setPointsDeMana(Integer.parseInt(ligne[4]));
                            personnage.setPointsDeManaMax(Integer.parseInt(ligne[5]));
                            personnage.setNiveau(Integer.parseInt(ligne[6]));
                            personnage.setNbPiece(Integer.parseInt(ligne[7]));

                            if(Integer.parseInt(ligne[8])!=0) {

                                if (Integer.parseInt(ligne[8]) == 1) {
                                    setEnnemiMana();
                                }
                                if (Integer.parseInt(ligne[8]) == 2) {
                                    setEnnemiPv();
                                }
                                if (Integer.parseInt(ligne[8]) == 3) {
                                    setEnnemiNeutre();
                                }


                                if(Integer.parseInt(ligne[8])!=0) {
                                    if (Integer.parseInt(ligne[8]) == 1) {
                                        setEnnemiMana();
                                        numeroChoixHistoire=1;
                                    }
                                    if (Integer.parseInt(ligne[8]) == 2) {
                                        setEnnemiPv();
                                        numeroChoixHistoire=2;
                                    }
                                    if (Integer.parseInt(ligne[8]) == 3) {
                                        setEnnemiNeutre();
                                        numeroChoixHistoire=3;
                                    }

                                    /**
                                     * instanciation des ennemi selon le niveau du personnage sauvegardé
                                     */
                                    if (personnage.getNiveau() <= 5) {
                                        if (personnage.getNiveau() >= 1) {
                                            ennemi = ennemi1;
                                            if (personnage.getNiveau() >= 2) {
                                                ennemi = ennemi2;
                                                if (personnage.getNiveau() >= 3) {
                                                    ennemi = ennemi3;
                                                    if (personnage.getNiveau() >= 4) {
                                                        ennemi = ennemi4;
                                                        if (personnage.getNiveau() >= 5) {
                                                            ennemi = ennemi5;
                                                        }
                                                    }
                                                }
                                            }

                                        }
                                    }
                                }

                            }

                            milleQuete=Integer.parseInt(ligne[9]);

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
                                    arme.setDurabilite(Integer.parseInt(ligne[5]));
                                    personnage.recupererArme(arme);
                                    personnage.recuperer();
                                }
                                if(Integer.parseInt(ligne[1])==2){
                                    arme=new Epee(Integer.parseInt(ligne[2]),Integer.parseInt(ligne[3]),Integer.parseInt(ligne[5]),new Effet());
                                    personnage.recupererArme(arme);
                                }
                                if(Integer.parseInt(ligne[1])==3){
                                    arme=new Bouclier();
                                    arme.setDurabilite(Integer.parseInt(ligne[5]));
                                    personnage.recupererArme(arme);
                                }

                            }
                            if(Integer.parseInt(ligne[0])==2){
                                Sort sort=new Sort(Integer.parseInt(ligne[4]),new Effet(Integer.parseInt(ligne[1]),Integer.parseInt(ligne[2]),Integer.parseInt(ligne[3])),Integer.parseInt(ligne[5]));

                                if(sort.comparerSort(boulleEnnergie)){
                                    personnage.apprendreSort(boulleEnnergie);
                                }

                                if(sort.comparerSort(soin)){
                                    personnage.apprendreSort(soin);
                                }

                                if(sort.comparerSort(grosseBoulleEnnergie)){
                                    personnage.apprendreSort(grosseBoulleEnnergie);
                                }

                                if(sort.comparerSort(fullCowl)){
                                    personnage.apprendreSort(fullCowl);
                                }

                                if(sort.comparerSort(leMur)){
                                    personnage.apprendreSort(leMur);
                                }

                                if(sort.comparerSort(theWorld)){
                                    personnage.apprendreSort(theWorld);
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
        allerQuetes.setVisible(false);
        retourArme.setVisible(true);
        allerChoixHistoire.setVisible(false);
        allerMagasin.setVisible(false);
        allerSauvegarder.setVisible(false);
        bouttonCombat.setVisible(false);
        allerListeArme.setVisible(false);
        bouttonAffichagePerso.setVisible(false);
        menuArme.setVisible(true);

        menuArme2.setVisible(true);


        for(int i=0;i<listeArme.getItems().size();i++){
            listeArme.getItems().remove(i);
        }

        /**
         * lister les armes offensives
         */
        for(int cptArmeListeArme=0;cptArmeListeArme<personnage.getListeDesArmes().size();cptArmeListeArme+=1) {

            if(personnage.getListeDesArmes().get(cptArmeListeArme).estBouclier()==false) {
                listeArme.getItems().add(cptArmeListeArme + "," + personnage.getListeDesArmes().get(cptArmeListeArme));
                System.out.println(personnage.getListeDesArmes().get(cptArmeListeArme));
            }
        }

        for(int i=0;i<listeArme2.getItems().size();i++){
            listeArme2.getItems().remove(i);
        }

        /**
         * lister les bouclier
         */
        for(int cptArmeListeArme2=0;cptArmeListeArme2<personnage.getListeDesArmes().size();cptArmeListeArme2+=1) {
            if(personnage.getListeDesArmes().get(cptArmeListeArme2).estBouclier()==true){
                listeArme2.getItems().add(cptArmeListeArme2+","+personnage.getListeDesArmes().get(cptArmeListeArme2));
            }
        }



    }

    public void equiperArme(){
        if(listeArme.getValue()!=null) {


            String string[] = listeArme.getValue().toString().split(",");
            personnage.setTypeArme1(personnage.getListeDesArmes().get(Integer.parseInt(string[0])));
        }

    }


    public void equiperArme2(){
        if(listeArme2.getValue()!=null) {
            String string[] = listeArme2.getValue().toString().split(",");

            personnage.setTypeArme2(personnage.getListeDesArmes().get(Integer.parseInt(string[0])));
        }

    }


    public void choixAleatoireMagasin(){
        int nbElementShop=0;
        int cptLimit=0;
        int decalageMagasin=200;
        allerChoixHistoire.setVisible(false);
        acherterGrosseBoulleEnergie.setVisible(false);
        acherterBoulleEnergie.setVisible(false);
        acheterSoin.setVisible(false);
        acheterEpee.setVisible(false);
        acheterArc.setVisible(false);
        acheterBouclier.setVisible(false);
        allerQuetes.setVisible(false);



        while(nbElementShop<3 && cptLimit<100000) {
            cptLimit+=1;
            int choixObjetAleatoire=1 + (int)(Math.random() * ((6 - 1) + 1));;

            if (!personnage.getListeDesSorts().contains(grosseBoulleEnnergie)&& choixObjetAleatoire==1) {
                acherterGrosseBoulleEnergie.setVisible(true);
                acherterGrosseBoulleEnergie.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }

            if (!personnage.getListeDesSorts().contains(boulleEnnergie)&& choixObjetAleatoire==2) {
                acherterBoulleEnergie.setVisible(true);
                acherterBoulleEnergie.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }

            if (!personnage.getListeDesSorts().contains(soin) && choixObjetAleatoire==3) {
                acheterSoin.setVisible(true);
                acheterSoin.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }

            if (!personnage.getListeDesArmes().contains(epee) && choixObjetAleatoire==4) {
                acheterEpee.setVisible(true);
                acheterEpee.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }

            if (!personnage.getListeDesArmes().contains(arc) && choixObjetAleatoire==5) {
                acheterArc.setVisible(true);
                acheterArc.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }

            if(!personnage.getListeDesArmes().contains(acheterBouclier)&&choixObjetAleatoire==6){
                acheterBouclier.setVisible(true);
                acheterBouclier.setTranslateX(decalageMagasin);
                nbElementShop += 1;
                decalageMagasin += 200;
            }


        }
        retourBoutique.setTranslateX(decalageMagasin);

    }

    /**
     * instanciation des différents ennemis selon l'histoire
     */

    public void setEnnemiMana(){
        ennemi1=new Ennemi(15,15,30,30,1,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi1",0,new ListeEffet());
        ennemi2=new Ennemi(25,25,50,50,2,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi3=new Ennemi(30,30,75,75,3,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi4=new Ennemi(50,50,100,100,4,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi5=new Ennemi(75,75,150,150,5,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
    }

    public void setEnnemiPv(){
        ennemi1=new Ennemi(30,30,10,10,1,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi1",0,new ListeEffet());
        ennemi2=new Ennemi(50,50,20,20,2,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi3=new Ennemi(80,80,30,30,3,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi4=new Ennemi(120,120,50,50,4,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi5=new Ennemi(200,200,100,100,5,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
    }

    public void setEnnemiNeutre(){
        ennemi1=new Ennemi(30,30,30,30,1,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi1",0,new ListeEffet());
        ennemi2=new Ennemi(50,50,40,40,2,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi3=new Ennemi(70,70,80,80,3,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi4=new Ennemi(100,100,100,100,4,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
        ennemi5=new Ennemi(180,180,180,180,5,new ArrayList<Arme>(), new ArrayList<Sort>(),"ennemi2",0,new ListeEffet());
    }

    public void pageListeHistoire(){
        allerSauvegarder.setVisible(false);
        allerListeArme.setVisible(false);
        allerMagasin.setVisible(false);
        allerChoixHistoire.setVisible(false);
        bouttonAffichagePerso.setVisible(false);
        choixHistoire.setVisible(true);
        allerQuetes.setVisible(false);

    }

    public void choisirHistoireMage(){
        setEnnemiMana();
        numeroChoixHistoire=1;
        pageDescriptionPerso();
    }

    public void choisirHistoireGuerrier(){
        setEnnemiPv();
        numeroChoixHistoire=2;
        pageDescriptionPerso();
    }

    public void choisirHistoireChasseur(){
        setEnnemiNeutre();
        numeroChoixHistoire=3;
        pageDescriptionPerso();
    }

    /**
     * loot d'un objet aleatoire sur l'ennemi
     */
    public void loot(){
        groupLoot.setVisible(false);
        int choixTypeRecompense=1 + (int)(Math.random() * ((2 - 1) + 1));
        int choixRécompenseAleatoire=1 + (int)(Math.random() * ((1000 - 1) + 1));

        if(choixTypeRecompense==1) {
            if (choixRécompenseAleatoire < 505) {
                personnage.recupererArme(epee);
                console.appendText("Vous trouvez une épée en bois sur le corps de l'ennemi");
            } else {
                if (choixRécompenseAleatoire < 800) {
                    console.appendText("Vous trouvez une épée en pierre sur le corps de l'ennemi");
                    personnage.recupererArme(epeeMoyenne);
                } else {
                    if (choixRécompenseAleatoire < 900) {
                        console.appendText("Vous trouvez une épée en acier sur le corps de l'ennemi");
                        personnage.recupererArme(epeeBien);
                    } else {
                        if (choixRécompenseAleatoire <= 999) {
                            console.appendText("Vous trouvez une épée en diamant sur le corps de l'ennemi");
                            personnage.recupererArme(epeeRare);
                        } else {
                            console.appendText("Vous trouvez une épée en adamentium sur le corps de l'ennemi");
                            personnage.recupererArme(epeeExcellent);
                        }
                    }
                }

            }
        }
        if(choixTypeRecompense==2){
            if (choixRécompenseAleatoire < 505) {
                console.appendText("Vous trouvez un arc en bois sur le corps de l'ennemi");
                personnage.recupererArme(arc);
            } else {
                if (choixRécompenseAleatoire < 800) {
                    console.appendText("Vous trouvez un arc en pierre sur le corps de l'ennemi");
                    personnage.recupererArme(arcMoyenne);
                } else {
                    if (choixRécompenseAleatoire < 900) {
                        console.appendText("Vous trouvez un arc en metal sur le corps de l'ennemi");
                        personnage.recupererArme(arcBien);
                    } else {
                        if (choixRécompenseAleatoire <= 999) {
                            console.appendText("Vous trouvez un arc en or sur le corps de l'ennemi");
                            personnage.recupererArme(arcRare);
                        } else {
                            console.appendText("Vous trouvez un arc en diamant sur le corps de l'ennemi");
                            personnage.recupererArme(arcExcellent);
                        }
                    }
                }

            }
        }
    }

    public void listerQuete(){
        allerSauvegarder.setVisible(false);
        allerListeArme.setVisible(false);
        allerMagasin.setVisible(false);
        allerChoixHistoire.setVisible(false);
        bouttonAffichagePerso.setVisible(false);
        choixHistoire.setVisible(false);
        listeQuete.setVisible(true);
        allerQuetes.setVisible(false);
        if(ennemi==null){
            queteFinirAventure.setText("Quete aventure : 0/5");

        }
        else{
            if(ennemi.getNiveau()<5) {
                queteFinirAventure.setText("Quete aventure : "+Integer.toString(ennemi.getNiveau()) + "/5");
            }
            else{
                queteFinirAventure.setText("Quete aventure : accomplie");
            }
        }

        if(milleQuete!=1){
            argent.setText("Quete picsou : " +Integer.toString(personnage.getNbPiece())+"/100");
        }
        else{
            argent.setText("Quete picsou : accomplie");
        }
    }
}
