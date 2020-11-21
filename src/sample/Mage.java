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
    }

    /**
     * Petit sort
     */
    public void utiliseSort(Personnage personnageVise, Sort sort) {
        if (sort.getCoutMana() > this.getPointsDeMana()) {
            System.out.println("Vous n'avez pas assez de mana");
        } else {
            personnageVise.perdreVie(sort.getDegat());
            this.perdreMana(sort.getCoutMana());
            //TODO prendre en compte l'effet
        }
    }


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


