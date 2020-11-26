package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.util.ArrayList;

/**
 * Classe définissant un Personnage de RPG
 */
public abstract class Personnage {

    @FXML
    public TextArea console;

    public Arme typeArme1;
    public Arme typeArme2;
    private String nom;
    private ListeEffet listeEffet;

    /**
     * Nombre de points de vie du Personnage
     */
    private int pointsDeVie;

    private int pointsDeVieMax;
    private int nbPiece;

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
    public Personnage(int pointsDeVie, int pointsDeVieMax,int pointsDeMana,int pointsDeManaMax, int niveau, ArrayList<Arme> listeDesArmes, ArrayList<Sort> listeDesSorts,String nom,int nbPiece,ListeEffet listeEffet) {
        this.pointsDeVie = pointsDeVie;
        this.pointsDeVieMax=pointsDeVieMax;
        this.pointsDeMana = pointsDeMana;
        this.pointsDeManaMax=pointsDeManaMax;
        this.niveau = niveau;
        this.listeDesArmes = listeDesArmes;
        this.listeDesSorts=listeDesSorts;
        this.typeArme1=null;
        this.typeArme2=null;
        this.nom=nom;
        this.nbPiece=nbPiece;
        this.listeEffet=listeEffet;
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
        if(nbPointAttaque<0){
            this.pointsDeVie-=nbPointAttaque;
            if(this.pointsDeVie>this.pointsDeVieMax){
                this.pointsDeVie=this.pointsDeVieMax;
            }
        }
        else{
            if(getBlocage()<=nbPointAttaque){
                if(getInvulnerable()<=0) {
                    this.pointsDeVie -= (nbPointAttaque - getBlocage());
                }
            }
        }

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

    public void coupEpee(Personnage adversaire) throws EnnemiMortException {
        if(typeArme1==null && typeArme1.getClass()!=Epee.class){
            System.out.println("Vous n'avez pas d'épée équipée");
        }
        else{
            int nbPointAttaque;
            nbPointAttaque=this.typeArme1.getDegat();
            if(Math.random()*100<5){
                nbPointAttaque+=nbPointAttaque;
            }

            if(getListeEffet().getBoostDegatEpee()>0) {
                nbPointAttaque=2*nbPointAttaque;
                getListeEffet().setBoostDegatEpee(getListeEffet().getBoostDegatEpee()-1);
            }


            adversaire.perdreVie(nbPointAttaque);

            //TODO prendre en compte blocage adverse

            if(adversaire.getPointsDeVie() <= 0) {
                throw new EnnemiMortException(EnnemiMortException.message);
            }
        }
    };

    public void tirerFleche(Personnage adversaire) throws EnnemiMortException {
        if(typeArme1==null && typeArme1.getClass()!=Arc.class){
            System.out.println("Vous n'avez pas d'arc équipée");
        }
        else{
            int nbPointAttaque;
            nbPointAttaque=this.typeArme1.getDegat();
            if(Math.random()*100<5){
                nbPointAttaque+=nbPointAttaque;
            }
            adversaire.perdreVie(nbPointAttaque);
            this.typeArme1.tirerFleche();
            //TODO prendre en compte blocage adverse

            if(adversaire.getPointsDeVie() <= 0) {
                throw new EnnemiMortException(EnnemiMortException.message);
            }
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

    public void utiliseSort(Personnage personnageVise, Sort sort) throws EnnemiMortException {
        if (sort.getCoutMana() > this.getPointsDeMana()) {
            System.out.println("Vous n'avez pas assez de mana");
        } else {
            System.out.println(personnageVise.getBlocage());
            System.out.println(sort.getDegat());
            if(personnageVise.getBlocage()<=sort.getDegat() && personnageVise.getInvulnerable()<=0) {

                if(sort.getEffet()!=null) {
                    if (sort.getEffet().getType() == 1) {
                        personnageVise.setFreeze(sort.getEffet().getDuree());

                    }
                    if (sort.getEffet().getType() == 2) {
                        personnageVise.setInvulnerabilite(sort.getEffet().getDuree());
                    }
                    if (sort.getEffet().getType() == 3) {
                        personnageVise.setFeu(sort.getEffet().getDuree());
                    }
                    if (sort.getEffet().getType() == 4) {
                        personnageVise.setBoostDegatEpee(sort.getEffet().getDuree());
                    }
                }
            }


            int degat=sort.getDegat();
            if(Math.random()*100<5){
                degat+=degat;
            }
            personnageVise.perdreVie(degat);

            this.perdreMana(sort.getCoutMana());
            //TODO prendre en compte l'effet

            if(personnageVise.getPointsDeVie() <= 0) {
                throw new EnnemiMortException(EnnemiMortException.message);
            }
        }
    }

    public void setFreeze(int nbTour){
        this.listeEffet.setFreeze(nbTour);
    }

    public void setInvulnerabilite(int nbTour){
        this.listeEffet.setInvulnerable(nbTour);
    }

    public void setFeu(int nbTour){
        this.listeEffet.setFeu(nbTour);
    }

    public int getFreeze(){
        return this.listeEffet.getFreeze();
    }

    public int getInvulnerable(){
        return this.listeEffet.getInvulnerable();
    }

    public int getFeu(){
        return this.listeEffet.getFeu();
    }

    public int getBoostDegatEpee(){
        return this.listeEffet.getBoostDegatEpee();
    }

    public void setBoostDegatEpee(int boostDegatEpee){
        this.getListeEffet().setBoostDegatEpee(boostDegatEpee);
    }


    public void recupererArme(Arme arme){
        if(this.getListeDesArmes().isEmpty()){
            typeArme1=arme;
        }
        gagnereArme(arme);
    }

    public Arme getTypeArme1(){
        return this.typeArme1;
    }

    public void setTypeArme1(Arme arme){
        this.typeArme1=arme;
    }

    public void recuperer(){
        this.pointsDeVie=pointsDeVieMax;
        this.pointsDeMana=pointsDeManaMax;
        if(this.typeArme1!=null){
            this.typeArme1.recupererToutFleche();
        }
        listeEffet=new ListeEffet();
    }

    public void gagnerNiveau(){
        this.niveau+=1;
        this.pointsDeVieMax+=niveau*10;
        this.pointsDeManaMax+=niveau*10;
    }

    public void setNbPiece(int nbPiece){
        this.nbPiece=nbPiece;
    }

    public int getNbPiece(){
        return this.nbPiece;
    }

    public void gagnerPiece(int nbPiece){
        this.nbPiece+=nbPiece;
    }

    public void perdrePiece(int nbPiece){
        this.nbPiece-=nbPiece;
    }

    public void setTypeArme2(Arme arme){
        this.typeArme2=arme;}

    public Arme getTypeArme2(){return this.typeArme2;}

    public int getBlocage(){
        int blocagePerso=0;
        if(getTypeArme1()!=null){
            blocagePerso+=getTypeArme1().getBlocage();
        }
        if(getTypeArme2()!=null){
            blocagePerso+=getTypeArme2().getBlocage();
        }
        return blocagePerso;
    }

    public void setListeEffet(ListeEffet listeEffet) {
        this.listeEffet = listeEffet;
    }

    public ListeEffet getListeEffet() {
        return listeEffet;
    }
}
