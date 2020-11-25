package sample;

public abstract class Arme {

    private int degat;
    private int blocage;
    private int durabilite;
    private Effet effet;

    public int getDegat(){
        if(effet!=null){
            return this.degat+effet.getDegat();
        }
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

    public Effet getEffet() {
        return effet;
    }

    public void setEffet(Effet effet) {
        this.effet = effet;
    }
}
