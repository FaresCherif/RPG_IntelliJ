package sample;

public abstract class Arme {

    private int degat;
    private int blocage;
    private int durabilite;

    public int getDegat(){
        return this.degat;
    }

    public int getBlocage(){
        return this.blocage;
    }


    public void setDegat(int degat){
        this.degat=degat;
    }

    public void setBlocage(int blocage){
        this.blocage=blocage;
    }

    public void tirerFleche(){};

    public int getNbFleche(){return 0;}

    public void recupererToutFleche(){}

    public void recupererFleche(int nbFleche){}

    public void setDurabilite(int durabilite){this.durabilite=durabilite;}

    public int getDurabilite(){return this.durabilite;}

    public void perdreDurabilite(){this.durabilite-=1;}

}
