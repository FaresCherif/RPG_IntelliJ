package sample;

import java.util.ArrayList;

public class Mage extends Personnage {


    /**
     * Constructeur d'un Mage
     *
     * @param pointsDeVie   : Nombre de points de vie d'un Mage
     * @param pointsDeMana  : Jauge de points de mana d'un Mage
     * @param niveau        : Niveau d'un Mage
     * @param listeDesArmes : Liste des armes d'un Mage
     */
    public Mage(int pointsDeVie, int pointsDeVieMax, int pointsDeMana, int pointsDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSorts) {
        super(pointsDeVie, pointsDeVieMax, pointsDeMana, pointsDeManaMax, niveau, listeDesArmes, listeDesSorts);
    }

    public Mage() {
        super(10, 10, 15, 15, 1, new ArrayList<Arme>(), new ArrayList<Sort>());
        Sort sort=new Sort();
        this.apprendreSort(sort);
    }

    /**
     * Petit sort
     */



    @Override
    public String toString() {
        String mage;
        mage = "Mage{" +
                "nom =" + this.getNom()+
                " pointsDeVie=" + this.getPointsDeVie() +
                ", pointsDeVieMax=" + this.getPointsDeVieMax() +
                ", pointsDeMana=" + this.getPointsDeMana() +
                ", pointsDeManaMax=" + this.getPointsDeManaMax() +
                ", niveau=" + this.getNiveau();

        mage += '}';

        return mage;
    }
}


