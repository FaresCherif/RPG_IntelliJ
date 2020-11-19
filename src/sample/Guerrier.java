package sample;

import java.util.ArrayList;

public class Guerrier extends Personnage {

    /**
     * Le Guerrier peut s'équiper d'une épée
     */
    public final static Epee typeArme1;

    /**
     * Le Guerrier peut s'équiper d'un bouclier
     */
    public final static Bouclier typeArme2;


    /**
     * Constructeur d'un Guerrier
     * @param pointsDeVie   : Nombre de points de vie d'un Guerrier
     * @param pointsDeMana  : Jauge de points de mana d'un Guerrier
     * @param niveau        : Niveau d'un Guerrier
     * @param listeDesArmes : Liste des armes d'un Guerrier
     * @param listeDesArmes : Liste des armes d'un Guerrier
     */
    public Guerrier(int pointsDeVie, int pointsDeMana, int niveau, ArrayList<Arme> listeDesArmes) {
        super(pointsDeVie, pointsDeMana, niveau, listeDesArmes);
    }

    /**
     * Le Guerrier inflige des dégât à son adversaire avec son épée
     */
    public void coupEpee(Personnage adversaire, Arme epee) {
        //TODO
    };

    /**
     * Le Guerrier inflige des dégâts à son adversaire à l'aide de son sort
     */
    public void criDeGuerre() {
        //TODO
    };
}
