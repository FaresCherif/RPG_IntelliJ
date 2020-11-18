package sample;

public class Arc extends Arme {

    private int nbFleche;

    public void Arc(Fleche fleche, int nbFleche){
        this.setDegat(fleche.getDegat()+fleche.getEffet().getDegat());
        this.setBlocage(0);
        this.nbFleche=nbFleche;
    }

    public void setNbFleche(int nbFleche){
        this.nbFleche=nbFleche;
    }

    public int getNbFleche(){
        return this.nbFleche;
    }

}
