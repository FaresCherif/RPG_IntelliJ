package sample;

public class Arc extends Arme {

    private int nbFleche;


    public void Arc(int degat, int blocage,int nbFleche){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.nbFleche=nbFleche;
    }

    public void Arc(){
        this.setDegat(2);
        this.setBlocage(0);
        this.nbFleche=20;
    }

    public void setNbFleche(int nbFleche){
        this.nbFleche=nbFleche;
    }

    public void perdreFleche(int nbFleche){
        this.nbFleche-=nbFleche;
    }

    @Override
    public void tirerFleche(){
        perdreFleche(1);
    }

    public void recupererFleche(int nbFleche){
        setNbFleche(this.nbFleche+nbFleche);
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Arc : "+getDegat()+" degat / "+getBlocage()+" blocage / "+this.getNbFleche()+" fleches";
        return arc;
    }

    public int getNbFleche(){
        return this.nbFleche;
    }




}
