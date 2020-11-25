package sample;

public class Epee extends Arme{

    public Epee(){
        this.setDegat(5);
        this.setBlocage(0);
        this.setDurabilite(10);
        this.setEffet(new Effet());

    }

    public Epee(int degat,int blocage,int durabilite, Effet effet){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
        this.setEffet(effet);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Epêe : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }


}
