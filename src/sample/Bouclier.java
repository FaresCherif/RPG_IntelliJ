package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

public class Bouclier extends Arme implements Animation {

    public Bouclier(){
        this.setDegat(0);
        this.setBlocage(2);
        this.setDurabilite(10);
        this.setEffet(new Effet());
    }

    public Bouclier(int degat,int blocage,int durabilite,Effet effet){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
        this.setEffet(new Effet());
    }

    public String toString() {
        String arc="";
        arc+="Bouclier : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }

    @Override
    public boolean estBouclier() {
        return true;
    }

    @Override
    public void animationArme(Group affichageArme) {

    }

    @Override
    public void animationBlocage(Group affichageBouclier) {
        affichageBouclier.setTranslateX(-100);
        affichageBouclier.setVisible(true);
        Timeline tx = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageBouclier.scaleXProperty(), 0)),
                new KeyFrame(Duration.millis(100), new KeyValue(affichageBouclier.scaleXProperty(), 2))
        );
        Timeline ty = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageBouclier.scaleYProperty(), 0)),
                new KeyFrame(Duration.millis(100), new KeyValue(affichageBouclier.scaleYProperty(), 2))
        );

        final Thread t1 = new Thread(){
            @Override
            public void run(){
                tx.setCycleCount(3);
                tx.play();
                ty.setCycleCount(3);
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
                affichageBouclier.setVisible(false);
            }
        };
        t2.start();
    }

    @Override
    public void animationSort(Group animationSort) {

    }

    @Override
    public void animationGrosSort() {

    }
}
