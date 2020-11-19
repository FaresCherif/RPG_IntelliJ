package sample;

import java.util.ArrayList;

public class Chasseur extends Personnage {

    /**
     * Le chasseur possède ne peut s'équiper que d'arcs
     */
    public final static Arc typeArme;

    /**
     * Constructeur d'un Chasseur
     * @param pointsDeVie   : Nombre de points de vie d'un Chasseur
     * @param pointsDeMana  : Jauge de points de mana d'un Chasseur
     * @param niveau        : Niveau d'un Chasseur
     * @param listeDesArmes : Liste des armes d'un Chasseur
     */
    public Chasseur(int pointsDeVie, int pointsDeMana, int niveau, ArrayList<Arme> listeDesArmes) {
        super(pointsDeVie, pointsDeMana, niveau, listeDesArmes);
    }

    /**
     * Le chasseur inflige des dégât à son adversaire avec son arc
     */
    public void tireArc(Personnage adversaire, Arme arc) {
        //TODO
    };

    /**
     * Le chasseur inflige des dégâts à l'aide de son sort
     */
    public void rituelDeLaForet() {
        //TODO
    };
}
