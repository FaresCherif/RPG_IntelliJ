package sample;

public class PersonnageMortException extends Exception {

    public static String message = "Vous avez subi un coup fatal, vous êtes décédé !";

    /**
     * Constructeur principal
     */
    public PersonnageMortException(String messageException) {
        super(messageException);
    }
}
