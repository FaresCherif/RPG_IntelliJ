package sample;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.Group;
import javafx.util.Duration;

public class Arc extends Arme implements Animation {

    private int nbFleche;
    private int nbFlecheMax;

    public void Arc(int degat, int blocage,int nbFleche,int nbFlecheMax,int durabilite,Effet effet){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.nbFleche=nbFleche;
        this.nbFlecheMax=nbFlecheMax;
        this.setDurabilite(durabilite);
        this.setEffet(effet);
    }

    public void Arc(){
        this.setDegat(2);
        this.setBlocage(0);
        this.nbFleche=20;
        this.nbFlecheMax=20;
        this.setDurabilite(10);
        this.setEffet(new Effet());
    }



    public void setNbFleche(int nbFleche){
        this.nbFleche=nbFleche;
    }

    public void perdreFleche(int nbFleche){
        this.nbFleche-=nbFleche;
    }

    @Override
    public void tirerFleche(){
        perdreFleche(1);
    }

    @Override
    public void recupererFleche(int nbFleche){
        setNbFleche(this.nbFleche+nbFleche);
        if(this.nbFlecheMax<this.nbFleche){
            this.nbFleche=this.nbFlecheMax;
        }
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Arc : "+getDegat()+" degat / "+getBlocage()+" blocage / "+this.getNbFleche()+"/"+this.nbFlecheMax+" fleches";
        return arc;
    }

    @Override
    public int getNbFleche(){
        return this.nbFleche;
    }

    @Override
    public void recupererToutFleche(){
        this.nbFleche=this.nbFlecheMax;
    }

    public int getNbFlecheMax(){
        return this.nbFlecheMax;
    }

    public void setNbFlecheMax(int nbFlecheMax){
        this.nbFlecheMax=nbFlecheMax;
    }

    @Override
    public void animationArme(Group affichageArc) {
        affichageArc.setTranslateX(-100);
        //On affiche l'épee
        affichageArc.setVisible(true);
        //On défini une timeline, au début de l'animation, l'épee est positionné à 0 en X,
        //Sur les 100 milisecondes suivantes, l'épee se déplace de 80 en X
        Timeline tx = new Timeline(
                new KeyFrame(Duration.millis(0), new KeyValue(affichageArc.translateXProperty(), 0)),
                new KeyFrame(Duration.millis(300), new KeyValue(affichageArc.translateXProperty(), 550))
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
                affichageArc.setVisible(false);
            }
        };
        t2.start();
    }

    @Override
    public void animationBlocage(Group affichageBouclier) {

    }

    @Override
    public void animationSort() {

    }

    @Override
    public void animationGrosSort() {

    }
}
