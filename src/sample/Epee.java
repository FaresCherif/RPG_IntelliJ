package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class Epee extends Arme implements Animation {

    public Epee(){
        this.setDegat(5);
        this.setBlocage(0);
        this.setDurabilite(10);
    }

    public Epee(int degat,int durabilite){
        this.setDegat(degat);
        this.setBlocage(0);
        this.setDurabilite(durabilite);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Epêe : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }


    @Override
    public void animationArme(Group affichageEpee) {
        //On affiche l'épee
        affichageEpee.setVisible(true);
        //On défini une timeline, au début de l'animation, l'épee est positionné à 0 en X,
        //Sur les 100 milisecondes suivantes, l'épee se déplace de 80 en X
        Timeline t = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageEpee.translateXProperty(), 0)),
                new KeyFrame(Duration.millis(100), new KeyValue(affichageEpee.translateXProperty(), 80))
        );
        //L'animation se répète 3 fois
        t.setCycleCount(3);
        //L'animation est joué
        t.play();
    }

    @Override
    public void animationBlocage() {

    }

    @Override
    public void animationSort() {

    }

    @Override
    public void animationGrosSort() {

    }
}
