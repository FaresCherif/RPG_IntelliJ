package sample;

import java.util.ArrayList;

public class Ennemi extends Personnage {
    public Arme typeArme1;

    public Ennemi(int pointsDeVie, int pointDeVieMax, int pointsDeMana, int pointDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSorts ) {
        super(pointsDeVie,pointDeVieMax, pointsDeMana,pointDeManaMax, niveau, listeDesArmes, listeDesSorts);
    }

    public Ennemi( ) {
        super(7, 7,5,5,1, new ArrayList<Arme>(), new ArrayList<Sort>());
        Epee epee=new Epee();
        recupererEpee(epee);
    }

    public void morsure(Personnage personnage){
        int nbPointAttaque;
        nbPointAttaque=2;
        personnage.perdreVie(nbPointAttaque);
    }




}
