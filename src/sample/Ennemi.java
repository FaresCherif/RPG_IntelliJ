package sample;

import javafx.scene.control.TextArea;

import java.util.ArrayList;

public class Ennemi extends Personnage {
    public Arme typeArme1;

    public Ennemi(int pointsDeVie, int pointDeVieMax, int pointsDeMana, int pointDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSorts,String nom,int nbPiece,ListeEffet effet ) {
        super(pointsDeVie,pointDeVieMax, pointsDeMana,pointDeManaMax, niveau, listeDesArmes, listeDesSorts,nom,nbPiece,effet);
    }

    public Ennemi( ) {
        super(7, 7,5,5,1, new ArrayList<Arme>(), new ArrayList<Sort>(),"",0,new ListeEffet());
    }

    public void morsure(Personnage personnage, TextArea console) throws PersonnageMortException {
        int nbPointAttaque;
        nbPointAttaque=3*getNiveau();
        personnage.perdreVie(nbPointAttaque,console);

        if(personnage.getPointsDeVie() <= 0) {
            throw new PersonnageMortException(PersonnageMortException.message);
        }
    }




}
