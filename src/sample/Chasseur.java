package sample;

import java.util.ArrayList;

public class Chasseur extends Personnage {

    /**
     * Le chasseur possède ne peut s'équiper que d'arcs
     */
    public Arc typeArme;
    public Fleche fleche;

    /**
     * Constructeur d'un Chasseur
     * @param pointsDeVie   : Nombre de points de vie d'un Chasseur
     * @param pointsDeMana  : Jauge de points de mana d'un Chasseur
     * @param niveau        : Niveau d'un Chasseur
     * @param listeDesArmes : Liste des armes d'un Chasseur
     */
    public Chasseur(int pointsDeVie,int pointDeVieMax, int pointsDeMana,int pointDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSort) {
        super(pointsDeVie,pointDeVieMax, pointsDeMana,pointDeManaMax, niveau, listeDesArmes,listeDesSort);
    }

    public Chasseur(){
        super(12,12,12,12,1,new ArrayList<Arme>(),new ArrayList<Sort>());
    }

    /**
     * Le chasseur inflige des dégât à son adversaire avec son arc
     */
    public void tireArc(Personnage adversaire, Arc arc) {
        if(arc.getNbFleche()==0){
            System.out.println("Vous n'avez pas de fleche");
        }
        else{
            adversaire.perdreVie(arc.getDegat()+fleche.getDegat());
            this.typeArme.tirerFleche();
            //TODO ajouter Effet fleche
        }

    };


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
        if(typeArme!=null){
            chasseur += ", nbFleche=" + this.typeArme.getNbFleche();
        }
        else{
            chasseur +=  " pas d'arc equipé";
        }

        chasseur += '}';

        return chasseur;
    }

    public void recupererFleche(Fleche fleche,int nbFleche){
        typeArme.ajouterFleche(nbFleche);
        this.fleche=fleche;
    }

    public void recupererFleche(int nbFleche){
        typeArme.ajouterFleche(nbFleche);
        this.fleche=new Fleche();
    }

    public void recupererArc(Arc arc){
        if(this.getListeDesArmes().isEmpty()){
            typeArme=arc;
        }
        gagnereArme(arc);
    }

    public void equiperArme(Arme arme){

    }
}
