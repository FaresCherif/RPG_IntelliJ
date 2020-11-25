package sample;

public class Effet {

    private int type;
    private int degat;
    private int duree;

    //type 1 : freeze , type 2 : invulnerable , type 3 : feu, type 4 : boostAttaque

    public Effet(int type, int degat, int duree){
        this.type=type;
        this.degat=degat;
        this.duree=duree;
    }

    public Effet(){
        this.type=0;
        this.degat=0;
        this.duree=0;
    }

    public int getType(){
        return this.type;
    }

    public int getDegat(){
        return this.degat;
    }

    public void setDegat(int degat){
        this.degat=degat;
    }

    public void setType(int type){
        this.type=type;
    }

    public int getDuree(){
        return this.duree;
    }

    public void setDuree(int duree){
        this.duree=duree;
    }

}
