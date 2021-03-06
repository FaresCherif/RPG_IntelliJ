package sample;

import java.util.ArrayList;

public class Guerrier extends Personnage {

    /**
     * Le Guerrier peut s'équiper d'une épée
     */

    /**
     * Le Guerrier peut s'équiper d'un bouclier
     */

    /**
     * Constructeur d'un Guerrier
     * @param pointsDeVie   : Nombre de points de vie d'un Guerrier
     * @param pointsDeMana  : Jauge de points de mana d'un Guerrier
     * @param niveau        : Niveau d'un Guerrier
     * @param listeDesArmes : Liste des armes d'un Guerrier
     * @param listeDesArmes : Liste des armes d'un Guerrier
     */
    public Guerrier(int pointsDeVie,int pointDeVieMax,int pointsDeMana,int pointDeManaMax, int niveau, ArrayList<Arme> listeDesArmes,ArrayList<Sort> listeDesSorts,String nom,int nbPiece,ListeEffet listeEffet ) {
        super(pointsDeVie,pointDeVieMax, pointsDeMana,pointDeManaMax, niveau, listeDesArmes, listeDesSorts,nom,nbPiece,listeEffet);
    }

    public Guerrier( ) {
        super(25, 25,10,10,1, new ArrayList<Arme>(), new ArrayList<Sort>(),"",0,new ListeEffet());

    }




    /**
     * Le Guerrier inflige des dégâts à son adversaire à l'aide de son sort
     */
    public void criDeGuerre() {

        //TODO
    };

    @Override
    public String toString() {
        String guerrier;
        guerrier= "Guerrier{" +
                "nom =" + this.getNom()+
                " pointsDeVie=" + this.getPointsDeVie() +
                ", pointsDeVieMax=" + this.getPointsDeVieMax() +
                ", pointsDeMana=" + this.getPointsDeMana() +
                ", pointsDeManaMax=" + this.getPointsDeManaMax() +
                ", niveau=" + this.getNiveau();

        guerrier += '}';

        return guerrier;
    }


    public Arme getArme(){
        return this.typeArme1;
    }
}
