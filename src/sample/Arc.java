package sample;

public class Arc extends Arme {

    private int nbFleche;
    private int nbFlecheMax;




    public void Arc(){
        this.setDegat(2);
        this.setBlocage(0);
        this.nbFleche=20;
        this.nbFlecheMax=20;
    }

    public void Arc(int degat, int blocage,int nbFleche,int nbFlecheMax){
        this.setDegat(degat);
        this.setBlocage(blocage);
        this.nbFleche=nbFleche;
        this.nbFlecheMax=nbFlecheMax;
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

    @Override
    public void recupererFleche(int nbFleche){
        setNbFleche(this.nbFleche+nbFleche);
        if(this.nbFlecheMax<this.nbFleche){
            this.nbFleche=this.nbFlecheMax;
        }
    }

    @Override
    public String toString() {
        String arc="";
        arc+="Arc : "+getDegat()+" degat / "+getBlocage()+" blocage / "+this.getNbFleche()+"/"+this.nbFlecheMax+" fleches";
        return arc;
    }

    @Override
    public int getNbFleche(){
        return this.nbFleche;
    }

    @Override
    public void recupererToutFleche(){
        this.nbFleche=this.nbFlecheMax;
    }

    public int getNbFlecheMax(){
        return this.nbFlecheMax;
    }

    public void setNbFlecheMax(int nbFlecheMax){
        this.nbFlecheMax=nbFlecheMax;
    }




}
