package sample;

public class ListeEffet {

    private int feu;
    private int invulnerable;
    private int freeze;

    public ListeEffet(){
        feu=0;
        invulnerable=0;
        freeze=0;
    }

    public int getFeu() {
        return feu;
    }

    public int getFreeze() {
        return freeze;
    }

    public int getInvulnerable() {
        return invulnerable;
    }

    public void setFeu(int feu) {
        this.feu = feu;
    }

    public void setFreeze(int freeze) {
        this.freeze = freeze;
    }

    public void setInvulnerable(int invulnerable) {
        this.invulnerable = invulnerable;
    }
}
