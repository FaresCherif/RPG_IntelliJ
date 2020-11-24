package sample;

public class Bouclier extends Arme {

    public Bouclier(){
        this.setDegat(0);
        this.setBlocage(10);
        this.setDurabilite(10);
    }

    public Bouclier(int blocage,int durabilite){
        this.setDegat(0);
        this.setBlocage(blocage);
        this.setDurabilite(durabilite);
    }



}
