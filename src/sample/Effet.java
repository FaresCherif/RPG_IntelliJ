package sample;

public class Effet {

    private String nom;
    private int degat;
    private int duree;

    public Effet(String nom, int degat){
        this.nom=nom;
        this.degat=degat;
        this.duree=duree;
    }

    public String getNom(){
        return this.nom;
    }

    public int getDegat(){
        return this.degat;
    }

    public void setDegat(int degat){
        this.degat=degat;
    }

    public void setNom(String nom){
        this.nom=nom;
    }

    public int getDuree(){
        return this.duree;
    }

    public void setDuree(int duree){
        this.duree=duree;
    }

}
