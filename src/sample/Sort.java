package sample;

public class Sort {

    private int degat;
    private Effet effet;
    private int coutMana;

    public Sort(){
        this.degat=5;
        this.effet=new Effet();
        this.coutMana=5;
    }

    public Sort(int degat, Effet effet,int coutMana){
        this.degat=degat+effet.getDegat();
        this.effet=effet;
        this.coutMana=coutMana;
    }

    public void setEffet(Effet effet){
        this.effet=effet;
    }

    public Effet getEffet(){
        return this.effet;
    }

    public void setDegat(int degat){
        this.degat=degat+effet.getDegat();
    }

    public int getDegat(){
        return this.degat;
    }

    public void removeEffet(){
        this.effet=null;
    }

    public int getCoutMana(){
        return(this.coutMana);
    }

    public void setCoutMana(int coutMana){
        this.coutMana=coutMana;
    }

    @Override
    public String toString(){
        String text="Sort "+getDegat()+" degat, "+getCoutMana()+" mana "+getEffet().getType()+" type "+getEffet().getDegat()+" degat "+getEffet().getDuree()+" duree ";
        return text;
    }

    public boolean comparerType(Sort sort) {
        if (sort.getEffet() != null && this.getEffet() != null) {
            return (sort.getEffet().getType() == this.getEffet().getType() && sort.getEffet().getDegat() == this.getEffet().getDegat() && sort.getEffet().getDuree() == this.getEffet().getDuree());
        }
        else {
            if (sort.getEffet() != null && this.getEffet() == null) {
                return (sort.getEffet().getType() == 0 && sort.getEffet().getDegat() == 0 && sort.getEffet().getDuree() == 0);
            } else {
                if (sort.getEffet() == null && this.getEffet() != null) {
                    return (0 == this.getEffet().getType() && 0 == this.getEffet().getDegat() && 0 == this.getEffet().getDuree());
                }
                else{
                    return true;
                }
            }
        }
    }

    public boolean comparerSort(Sort sort){
        return(sort.getCoutMana()==this.getCoutMana()&&sort.getDegat()==this.getDegat()&& sort.comparerType(this));
    }
}
