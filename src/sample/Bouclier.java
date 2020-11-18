package sample;

public class Bouclier extends Arme {

    public Bouclier(){
        this.setDegat(0);
        this.setBlocage(10);
    }

    public Bouclier(int blocage){
        this.setDegat(0);
        this.setBlocage(blocage);
    }

}
