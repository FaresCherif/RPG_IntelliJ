package sample;

public class Epee extends Arme{

    public Epee(){
        this.setDegat(5);
        this.setBlocage(0);
        this.setDurabilite(10);
    }

    public Epee(int degat,int blocage,int durabilite){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Epêe : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }


}
