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
        primaryStage.setMaximized(true);
        primaryStage.show();



    }


    public static void main(String[] args) {
        launch(args);
    }
}

//TODO  mettre des images dans les boutons de choix des personnages
// remplacer if par exception quand une personne meurt
// la classe partie ?
// mettre les translate du controller directement dans le fxml
// faire l'animation des attaques
// refactorer le code
// gérer le blocage et mettre des effets
// mettre des objets dans la boutique
// créer de nouveaux sort
// sauvegarder et charger
// randomiser attaque ennemi