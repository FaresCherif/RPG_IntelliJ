package sample;

public class Arc extends Arme {

    private int nbFleche;

    public void Arc(int degat, int blocage,int nbFleche){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.nbFleche=nbFleche;
    }

    public void Arc(){
        this.setDegat(0);
        this.setBlocage(0);
        this.nbFleche=20;
    }

    public void setNbFleche(int nbFleche){
        this.nbFleche=nbFleche;
    }

    public void perdreFleche(int nbFleche){
        this.nbFleche-=nbFleche;
    }

    public void tirerFleche(){
        perdreFleche(1);
    }

    public int getNbFleche(){
        return this.nbFleche;
    }

    public void ajouterFleche(int nbFleche){
        setNbFleche(nbFleche+1);
    }

}
