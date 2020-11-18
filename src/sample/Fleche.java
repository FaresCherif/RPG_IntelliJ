package sample;

public class Fleche {

    private int degat;
    private Effet effet;

    public Fleche(){
        this.degat=2;
        this.effet=null;
    }

    public Fleche(int degat, Effet effet){
        this.degat=degat;
        this.effet=effet;
    }

    public void setEffet(Effet effet){
        this.effet=effet;
    }

    public Effet getEffet(){
        return this.effet;
    }

    public void setDegat(int degat){
        this.degat=degat;
    }

    public int getDegat(){
        return this.degat;
    }

    public void removeEffet(){
        this.effet=null;
    }

}
