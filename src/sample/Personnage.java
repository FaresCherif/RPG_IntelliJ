package sample;

import java.util.ArrayList;

/**
 * Classe définissant un Personnage de RPG
 */
public abstract class Personnage {

    /**
     * Nombre de points de vie du Personnage
     */
    private int pointsDeVie;

    /**
     * Nombre de points de mana du Personnage
     */
    private int pointsDeMana;

    /**
     * Niveau du Personnage
     */
    private int niveau;

    /**
     * Liste des armes du Personnages
     */
    private ArrayList<Arme> listeDesArmes;

    /**
     * Constructeur d'un Personnage
     * @param pointsDeVie : Nombre de points de vie d'un Personnage
     * @param pointsDeMana : Jauge de points de mana d'un Personnage
     * @param niveau : Niveau d'un Personnage
     * @param listeDesArmes : Liste des armes d'un Personnage
     */
    public Personnage(int pointsDeVie, int pointsDeMana, int niveau, ArrayList<Arme> listeDesArmes) {
        this.pointsDeVie = pointsDeVie;
        this.pointsDeMana = pointsDeMana;
        this.niveau = niveau;
        this.listeDesArmes = listeDesArmes;
    }

    /**
     * Récupère le nombre de points de vie du Personnage
     * @return pointsDeVie
     */
    public int getPointsDeVie() {
        return pointsDeVie;
    }

    /**
     * Modifie le nombre de points de vie du Personnage
     * @param pointsDeVie : Nombre de points de vie
     */
    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    /**
     * Récupère le nombre de points de mana du Personnage
     * @return pointsDeMana
     */
    public int getPointsDeMana() {
        return pointsDeMana;
    }

    /**
     * Modifie le nombre de points de mana du Personnage
     * @param pointsDeMana : Nombre de points de mana
     */
    public void setPointsDeMana(int pointsDeMana) {
        this.pointsDeMana = pointsDeMana;
    }

    /**
     * Récupère le niveau du Personnage
     * @return niveau
     */
    public int getNiveau() {
        return niveau;
    }

    /**
     * Modifie le niveau du Personnage
     * @param niveau
     */
    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    /**
     * Récupère la liste des armes du Personnage
     * @return listeDesArmes
     */
    public ArrayList<Arme> getListeDesArmes() {
        return listeDesArmes;
    }

    /**
     * Modifie la liste des armes du Personnages
     * @param listeDesArmes
     */
    public void setListeDesArmes(ArrayList<Arme> listeDesArmes) {
        this.listeDesArmes = listeDesArmes;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                "pointsDeVie=" + pointsDeVie +
                ", pointsDeMana=" + pointsDeMana +
                ", niveau=" + niveau +
                ", listeDesArmes=" + listeDesArmes +
                '}';
    }
}
