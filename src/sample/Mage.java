package sample;

import java.util.ArrayList;

public class Mage extends Personnage {


    /**
     * Constructeur d'un Mage
     * @param pointsDeVie   : Nombre de points de vie d'un Mage
     * @param pointsDeMana  : Jauge de points de mana d'un Mage
     * @param niveau        : Niveau d'un Mage
     * @param listeDesArmes : Liste des armes d'un Mage
     */
    public Mage(int pointsDeVie, int pointsDeMana, int niveau, ArrayList<Arme> listeDesArmes) {
        super(pointsDeVie, pointsDeMana, niveau, listeDesArmes);
    }

    /**
     * Petit sort
     */
    public void petitSort() {

    }

    /**
     * Gros sort
     */
    public void grosSort() {

    }
}
