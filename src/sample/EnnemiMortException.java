package sample;

/**
 * Classe définissant une exception à lever quand un ennemi du personnage meurt (pv <= 0)
 */
public class EnnemiMortException extends Exception {

    public static String message = "Votre adversaire a subi un coup fatal, il est décédé !";

    /**
     * Constructeur principal
     */
    public EnnemiMortException(String messageException) {
        super(messageException);
    }
}
