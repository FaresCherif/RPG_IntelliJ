package sample;
import java.awt.*;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
    private Group animationEpee;

    @FXML
    private Group animationArc;

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

    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int width = gd.getDisplayMode().getWidth();
    int height = gd.getDisplayMode().getHeight();

    private Personnage personnage;
    private Ennemi ennemi;
    private Image imagePersonnage;

    private Sort boulleEnnergie=new Sort();
    private Sort soin = new Sort(-8,new Effet(),4);
    private Sort grosseBoulleEnnergie=new Sort(8,new Effet(),8);

    private Epee epee= new Epee();
    private Arc arc =new Arc();
    private Bouclier bouclier=new Bouclier();

    private Effet timeStop=new Effet(1,0,2);
    private Sort theWorld=new Sort(0,timeStop,5);

    private Effet boostForce=new Effet(4,0,3);
    private Sort fullCowl = new Sort(0,boostForce,4);

    private Effet invulnerabilite=new Effet(2,0,1);
    public Sort leMur=new Sort(0,invulnerabilite,2);

    private Ennemi ennemi1,ennemi2,ennemi3,ennemi4,ennemi5;

    private int numeroChoixHistoire;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        console.setEditable(false);
        arc.setDegat(4);
        arc.setDurabilite(10);
        arc.setNbFlecheMax(20);

        retourListeArme.setTranslateY(200);
        pagePrincipale.setVisible(true);
        bouttonCreationPerso.setVisible(false);
        pagePrincipale.setTranslateX(-width/2+350);
        pagePrincipale.setTranslateY(-height/2+150);

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


        bouttonCharger.setTranslateY(500);

        chargerPagePrincipale.setTranslateX(-width/2+350);

    }

    public void allerPageCreerPersonnage(ActionEvent actionEvent) {
        chargerPagePrincipale.setVisible(false);
        pagePrincipale.setVisible(false);
        bouttonCreationPerso.setVisible(true);


        descriptionMage.setText("Le mage est un être puissant capable de déchainer les éléments contre ses ennemies\n et de se protéger grace à ses sorts malgrés sa faible résistance physique");
        descriptionGuerrier.setText("Le guerrier est un combatant féroce ne reculant jamais face à un combat.\n Avec ses capacités exceptionnelles presque rien ne peut l'arreter, à part un livre");
        descriptionChasseur.setText("BLA BLA Nature, BLA BLA Archer. Une classe équilibré pour les casu \n PS : Ceci n'est pas la classe préféré d'un des développeurs");


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

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/mage.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage = new Image(fin,100,200,false,false);

        imageViewPersonnage.setImage(nouvelleImage);
        personnage.apprendreSort(boulleEnnergie);
        personnage.apprendreSort(soin);

    }

    public void creerGuerrier(){
        bouttonCreationPerso.setVisible(false);
        descriptionGuerrier.setVisible(false);
        nomCreationPerso.setVisible(true);
        personnage=new Guerrier();
        validerNom.setTranslateX(300);
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/guerrier.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage= new Image(fin,200,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);
        personnage.recupererArme(epee);
        personnage.apprendreSort(fullCowl);
    }

    public void creerChasseur(){
        bouttonCreationPerso.setVisible(false);
        descriptionChasseur.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Chasseur();

        validerNom.setTranslateX(300);
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("src/sample/images/chasseur.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image nouvelleImage= new Image(fin,100,100,false,false);
        imageViewPersonnage.setImage(nouvelleImage);
        personnage.recupererArme(arc);
        personnage.apprendreSort(theWorld);
        personnage.apprendreSort(leMur);

    }

    public void pageDescriptionPerso(){
        barrePersoPv.setStyle("-fx-accent: red;");
        barrePersoPv.setProgress(1F);
        barrePersoMana.setStyle("-fx-accent: blue;");
        barrePersoMana.setProgress(1F);

        barreEnnemiPv.setStyle("-fx-accent: red;");
        barreEnnemiPv.setProgress(1F);
        barreEnnemiMana.setStyle("-fx-accent: blue;");
        barreEnnemiMana.setProgress(1F);


        retourArme.setVisible(false);
        grConsole.setVisible(false);
        choixHistoire.setVisible(false);
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
        sauvegarde.setVisible(true);
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


        descriptionArmeEquipee.setVisible(true);

        if(personnage.getArme()!=null){
            armePersonage.setText("Arme équipée "+ personnage.getArme());
        }
        else{
            armePersonage.setText("Pas d'arme équipée");
        }
        piecePersonnage.setText(personnage.getNbPiece()+" pieces");


    }

    public void fondCombat(){
        console.appendText("Le combat commence, allez vous survivre ? Rien de moins sûr\n");
        allerChoixHistoire.setVisible(false);
        allerListeArme.setVisible(false);

        Image img = null;
        try {
            img = new Image(new FileInputStream("src/sample/images/arene.jpg"),width,height,true,true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        BackgroundImage myBI= new BackgroundImage(img,
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);

        gridPane.setBackground(new Background(myBI));

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

            if(personnage.getTypeArme1()!=null){
                personnage.getTypeArme1().perdreDurabilite();
            }
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
            console.appendText("Vous concentrez votre mana dans une boulle que vous envoyez sur l'ennemi ");
            try {
                personnage.utiliseSort(ennemi, boulleEnnergie,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void sortSoin() {
        if(personnage.getPointsDeMana()>=soin.getCoutMana()) {
            console.appendText("Vous concentrez votre mana pour soigner vos blessure ");
            try {
                personnage.utiliseSort(personnage, soin,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void sortTheWorld(){
        if(personnage.getPointsDeMana()>=theWorld.getCoutMana()) {
            console.appendText("Vous utiliser votre mana pour arreter le flux du temps pendant un tour ");
            try {
                personnage.utiliseSort(ennemi, theWorld,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void fullCowl(){
        if(personnage.getPointsDeMana()>=fullCowl.getCoutMana()) {
            console.appendText("Vous utiliser votre mana pour booster vos dégat à l'arme blance pendant quelques tours ");
            try {
                personnage.utiliseSort(personnage, fullCowl,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }

    public void leMur(){
        if(personnage.getPointsDeMana()>=leMur.getCoutMana()) {
            console.appendText("Vous invoquez un mur de pierre pour bloquer la prochaine attaque adverse ");

            try {
                personnage.utiliseSort(personnage, leMur,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
            }
            tourEnnemi();
        }
    }


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
        allerChoixHistoire.setVisible(true);
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

        choixAleatoireMagasin();




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

    public void acheterBouclier(){
        if(personnage.getNbPiece()>=40){
            personnage.perdrePiece(40);
            personnage.gagnereArme(bouclier);
        }
        pageMagasin();
    }

    public void grosseBoulleEnergie() {
        if(personnage.getPointsDeMana()>=grosseBoulleEnnergie.getCoutMana()) {
            console.appendText("Vous invoquez une enorme quantité d'energie dans une attaque qui va être dur à encaisser pour l'adversaire ");
            try {
                personnage.utiliseSort(ennemi, grosseBoulleEnnergie,console);
            } catch (EnnemiMortException e) {
                affichageVictoire.setVisible(true);
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


    public void acheterArc(){
        if(personnage.getNbPiece()>=30){
            personnage.perdrePiece(30);
            personnage.gagnereArme(arc);
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
            ffw.write(",");
            ffw.write(Integer.toString(numeroChoixHistoire));
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
                                Image nouvelleImage= new Image("src/sample/images/chasseur.jpg",100,100,false,false);
                                imageViewPersonnage.setImage(nouvelleImage);
                            }
                            if(Integer.parseInt(ligne[0])==3){
                                personnage=new Guerrier();
                                Image nouvelleImage= new Image("src/sample/images/guerrier.png",200,100,false,false);
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
                                    }
                                    if (Integer.parseInt(ligne[8]) == 2) {
                                        setEnnemiPv();
                                    }
                                    if (Integer.parseInt(ligne[8]) == 3) {
                                        setEnnemiNeutre();
                                    }

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
                                    arme=new Epee(Integer.parseInt(ligne[2]),Integer.parseInt(ligne[3]),Integer.parseInt(ligne[5]),new Effet());
                                    personnage.recupererArme(arme);
                                }
                                if(Integer.parseInt(ligne[1])==3){
                                    arme=new Bouclier();
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
        retourArme.setVisible(true);
        allerChoixHistoire.setVisible(false);
        allerMagasin.setVisible(false);
        sauvegarde.setVisible(false);
        bouttonCombat.setVisible(false);
        allerListeArme.setVisible(false);
        bouttonAffichagePerso.setVisible(false);
        menuArme.setVisible(true);

        menuArme2.setVisible(true);


        for(int i=0;i<listeArme.getItems().size();i++){
            listeArme.getItems().remove(i);
        }

        for(int cptArmeListeArme=0;cptArmeListeArme<personnage.getListeDesArmes().size();cptArmeListeArme+=1) {

            if(personnage.getListeDesArmes().get(cptArmeListeArme).estBouclier()==false) {
                listeArme.getItems().add(cptArmeListeArme + "," + personnage.getListeDesArmes().get(cptArmeListeArme));
            }
        }

        for(int i=0;i<listeArme2.getItems().size();i++){
            listeArme2.getItems().remove(i);
        }

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



        while(nbElementShop<3 && cptLimit<1000) {
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


}
