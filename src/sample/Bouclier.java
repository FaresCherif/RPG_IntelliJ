package sample;

public class Bouclier extends Arme {

    public Bouclier(){
        this.setDegat(0);
        this.setBlocage(2);
        this.setDurabilite(10);
        this.setEffet(new Effet());
    }

    public Bouclier(int degat,int blocage,int durabilite,Effet effet){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
        this.setEffet(new Effet());
    }

    public String toString() {
        String arc="";
        arc+="Bouclier : "+getDegat()+" degat / "+getBlocage()+" blocage / ";
        return arc;
    }

    @Override
    public boolean estBouclier() {
        return true;
    }
}
