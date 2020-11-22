package sample;

import java.util.ArrayList;

public class Chasseur extends Personnage {

    /**
     * Le chasseur possède ne peut s'équiper que d'arcs
     */

    /**
     * Constructeur d'un Chasseur
     * @param pointsDeVie   : Nombre de points de vie d'un Chasseur
     * @param pointsDeMana  : Jauge de points de mana d'un Chasseur
     * @param niveau        : Niveau d'un Chasseur
     * @param listeDesArmes : Liste des armes d'un Chasseur
     */
    public Chasseur(int pointsDeVie,int pointDeVieMax, int pointsDeMana,int pointDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSort,String nom, int nbPiece) {
        super(pointsDeVie,pointDeVieMax, pointsDeMana,pointDeManaMax, niveau, listeDesArmes,listeDesSort,nom,nbPiece);
    }

    public Chasseur(){
        super(12,12,12,12,1,new ArrayList<Arme>(),new ArrayList<Sort>(),"",0);
        Arc arc=new Arc();
        arc.setDegat(2);
        arc.setNbFleche(20);
        this.recupererArc(arc);
    }

    /**
     * Le chasseur inflige des dégât à son adversaire avec son arc
     */



    /**
     * Le chasseur inflige des dégâts à l'aide de son sort
     */
    public void rituelDeLaForet() {
        //TODO
    };

    @Override
    public String toString() {
        String chasseur;
        chasseur= "Chasseur{" +
                "nom =" + this.getNom()+
                " pointsDeVie=" + this.getPointsDeVie() +
                ", pointsDeVieMax=" + this.getPointsDeVieMax() +
                ", pointsDeMana=" + this.getPointsDeMana() +
                ", pointsDeManaMax=" + this.getPointsDeManaMax() +
                ", niveau=" + this.getNiveau();
        chasseur += '}';

        return chasseur;
    }


    public void recupererArc(Arc arc){
        if(this.getListeDesArmes().isEmpty()){
            typeArme1=arc;
        }
        gagnereArme(arc);
    }

    public Arme getArme(){
        return this.typeArme1;
    }


}
