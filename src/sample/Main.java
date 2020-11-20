package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

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


    public static void main(String[] args) {
        launch(args);
    }
}
