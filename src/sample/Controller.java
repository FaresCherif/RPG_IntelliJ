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

    private Personnage personnage;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
        int width = gd.getDisplayMode().getWidth();
        int height = gd.getDisplayMode().getHeight();

        pagePrincipale.setVisible(true);
        bouttonCreationPerso.setVisible(false);

        pagePrincipale.setTranslateX(-width/2+250);
        pagePrincipale.setTranslateY(-height/2+150);
        BackgroundImage myBI= new BackgroundImage(new Image("https://cameronscookware.com/wp-content/uploads/2019/12/fantasy-world-background-best-of-fantasy-world-backgrounds-4k-download-2019-of-fantasy-world-background.jpg",width,height,false,true),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
                BackgroundSize.DEFAULT);
        gridPane.setBackground(new Background(myBI));



        Guerrier guerrier = new Guerrier();
        Chasseur chasseur = new Chasseur();
        Mage mage= new Mage();
        Epee epee = new Epee();
        Arc arc = new Arc();
        Sort sort=new Sort();

        chasseur.recupererArc(arc);

        System.out.println(chasseur);
        guerrier.coupEpee(chasseur);
        System.out.println(chasseur);
        chasseur.tireArc(guerrier,arc);
        System.out.println(chasseur);
        chasseur.recupererFleche(5);
        System.out.println(chasseur);
        chasseur.tireArc(guerrier,arc);
        System.out.println(chasseur);
        System.out.println(guerrier);
        System.out.println("\n");

        guerrier.recupererEpee(epee);
        guerrier.coupEpee(chasseur);
        System.out.println(chasseur);

        System.out.println("\n");
        System.out.println(mage);
        mage.apprendreSort(sort);
        mage.utiliseSort(guerrier,sort);

        System.out.println(mage);
        System.out.println(guerrier);
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

    }

    public void creerGuerrier(){
        bouttonCreationPerso.setVisible(false);
        descriptionGuerrier.setVisible(false);
        nomCreationPerso.setVisible(true);
        personnage=new Guerrier();
        validerNom.setTranslateX(300);

    }

    public void creerChasseur(){
        bouttonCreationPerso.setVisible(false);
        descriptionChasseur.setVisible(false);
        nomCreationPerso.setVisible(true);

        personnage=new Chasseur();

        validerNom.setTranslateX(300);
    }

    public void pageDescriptionPerso(){
        nomCreationPerso.setVisible(false);
        personnage.setNom(entrerNomPerso.getText());


    }
}
