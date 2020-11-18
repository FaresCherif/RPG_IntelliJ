package sample;

public abstract class Arme {

    private int degat;
    private int  blocage;

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

}
