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
        this.setEffet(new Effet());

    }

    public Epee(int degat,int blocage,int durabilite, Effet effet){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
        this.setEffet(effet);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Epêe : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }


    @Override
    public void animationArme(Group affichageEpee) {
        affichageEpee.setTranslateX(-100);
        //On affiche l'épee
        affichageEpee.setVisible(true);
        //On défini une timeline, au début de l'animation, l'épee est positionné à 0 en X,
        //Sur les 100 milisecondes suivantes, l'épee se déplace de 80 en X
        Timeline tx = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageEpee.translateXProperty(), 0)),
                new KeyFrame(Duration.millis(100), new KeyValue(affichageEpee.translateXProperty(), 80))
        );
        Timeline ty = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageEpee.translateYProperty(), 0)),
                new KeyFrame(Duration.millis(100), new KeyValue(affichageEpee.translateYProperty(), 80))
        );

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                //L'animation se répète 3 fois
                tx.setCycleCount(3);
                ty.setCycleCount(3);
                //L'animation est joué
                tx.play();
                ty.play();
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
                affichageEpee.setVisible(false);
            }
        };
        t2.start();
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
