package sample;

import java.util.ArrayList;

/**
 * Classe définissant un Personnage de RPG
 */
public abstract class Personnage {

    public Arme typeArme1;
    public Arme typeArme2;
    private String nom;

    /**
     * Nombre de points de vie du Personnage
     */
    private int pointsDeVie;

    private int pointsDeVieMax;


    /**
     * Nombre de points de mana du Personnage
     */
    private int pointsDeMana;

    private int pointsDeManaMax;


    /**
     * Niveau du Personnage
     */
    private int niveau;

    /**
     * Liste des armes du Personnages
     */
    private ArrayList<Arme> listeDesArmes;
    private ArrayList<Sort> listeDesSorts;

    /**
     * Constructeur d'un Personnage
     * @param pointsDeVie : Nombre de points de vie d'un Personnage
     * @param pointsDeMana : Jauge de points de mana d'un Personnage
     * @param niveau : Niveau d'un Personnage
     * @param listeDesArmes : Liste des armes d'un Personnage
     * @param listeDesSorts : Liste des sorts d'un Personnage
     */
    public Personnage(int pointsDeVie, int pointsDeVieMax,int pointsDeMana,int pointsDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSorts) {
        this.pointsDeVie = pointsDeVie;
        this.pointsDeVieMax=pointsDeVieMax;
        this.pointsDeMana = pointsDeMana;
        this.pointsDeManaMax=pointsDeManaMax;
        this.niveau = niveau;
        this.listeDesArmes = listeDesArmes;
        this.listeDesSorts=listeDesSorts;
        this.typeArme1=null;
        this.typeArme2=null;
        this.nom="";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom){
        this.nom=nom;
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


    public int getPointsDeVieMax() {
        return pointsDeVieMax;
    }

    public void setPointsDeVieMax(int pointsDeVieMax) {
         this.pointsDeVieMax=pointsDeVieMax;
    }

    public int getPointsDeManaMax() {
        return pointsDeManaMax;
    }

    public void setPointsDeManaMax(int pointsDeManaMax) {
        this.pointsDeManaMax=pointsDeManaMax;
    }

    /**
     * Récupère la liste des sorts du Personnage
     * @return listeDesSorts
     */
    public ArrayList<Sort> getListeDesSorts() {
        return listeDesSorts;
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

    /**
     * Modifie la liste des sorts du Personnages
     * @param listeDesSorts
     */
    public void setListeDesSorts(ArrayList<Sort> listeDesSorts) {
        this.listeDesSorts = listeDesSorts;
    }

    @Override
    public String toString() {
        return "Personnage{" +
                " pointsDeVie=" + pointsDeVie +
                ", pointsDeVieMax=" + pointsDeVieMax +
                ", pointsDeMana=" + pointsDeMana +
                ", pointsDeManaMax=" + pointsDeManaMax +
                ", niveau=" + niveau +
                '}';
    }

    public void perdreVie(int nbPointAttaque){
        this.pointsDeVie-=nbPointAttaque;
    }

    public void reprendreVie(int nbPvSoin){
        this.pointsDeVie+=nbPvSoin;
        if(pointsDeVie>pointsDeVieMax){
            pointsDeVie=pointsDeVieMax;
        }
    }


    public void perdreMana(int coutMana){
        this.pointsDeMana-=coutMana;
    }

    public void reprendreMana(int quantiteMana){
        this.pointsDeMana+=quantiteMana;
        if(pointsDeMana>pointsDeManaMax){
            pointsDeMana=pointsDeManaMax;
        }
    }

    public void gagnereArme(Arme arme){
        this.getListeDesArmes().add(arme);
    }

    public void perdreArme(Arme arme){
        this.listeDesArmes.remove(arme);
    }

    public void apprendreSort(Sort sort){
        this.listeDesSorts.add(sort);
    }

    public void oublierSort(Sort sort){
        this.listeDesSorts.remove(sort);
    }


    /**
     * Le Guerrier inflige des dégât à son adversaire avec son épée
     */

    public void coupEpee(Personnage adversaire) {
        if(typeArme1==null && typeArme1.getClass()!=Epee.class){
            System.out.println("Vous n'avez pas d'épée équipée");
        }
        else{
            int nbPointAttaque;
            nbPointAttaque=this.typeArme1.getDegat();
            adversaire.perdreVie(nbPointAttaque);

            //TODO prendre en compte blocage adverse
        }
    };

    public void tirerFleche(Personnage adversaire) {
        if(typeArme1==null && typeArme1.getClass()!=Arc.class){
            System.out.println("Vous n'avez pas d'arc équipée");
        }
        else{
            int nbPointAttaque;
            nbPointAttaque=this.typeArme1.getDegat();
            adversaire.perdreVie(nbPointAttaque);
            this.typeArme1.tirerFleche();
            //TODO prendre en compte blocage adverse
        }
    };

    public Arme getArme(){
        if(this.typeArme1!=null){
            return this.typeArme1;
        }
        else{
            return null;
        }
    }

    public void utiliseSort(Personnage personnageVise, Sort sort) {
        if (sort.getCoutMana() > this.getPointsDeMana()) {
            System.out.println("Vous n'avez pas assez de mana");
        } else {
            personnageVise.perdreVie(sort.getDegat());
            this.perdreMana(sort.getCoutMana());
            //TODO prendre en compte l'effet
        }
    }


}
