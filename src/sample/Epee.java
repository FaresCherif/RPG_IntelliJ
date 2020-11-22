package sample;

public class Epee extends Arme{

    public Epee(){
        this.setDegat(5);
        this.setBlocage(0);
    }

    public Epee(int degat){
        this.setDegat(degat);
        this.setBlocage(0);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Epêe : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }

}
