package sample;

public class Sort {

    private int degat;
    private Effet effet;
    private int coutMana;

    public Sort(){
        this.degat=5;
        this.effet=null;
        this.coutMana=5;
    }

    public Sort(int degat, Effet effet,int coutMana){
        this.degat=degat+effet.getDegat();
        this.effet=effet;
        this.coutMana=coutMana;
    }

    public void setEffet(Effet effet){
        this.effet=effet;
    }

    public Effet getEffet(){
        return this.effet;
    }

    public void setDegat(int degat){
        this.degat=degat+effet.getDegat();
    }

    public int getDegat(){
        return this.degat;
    }

    public void removeEffet(){
        this.effet=null;
    }

    public int getCoutMana(){
        return(this.coutMana);
    }

    public void setCoutMana(int coutMana){
        this.coutMana=coutMana;
    }
}
