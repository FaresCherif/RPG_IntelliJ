package sample;

import javafx.scene.Group;

/**
 * Interface définissant des méthodes à implémenter pour les animations des attaques d'armes et des sorts
 */
public interface Animation {

    public void animationArme(Group affichageArme);

    public void animationBlocage(Group affichageBouclier);

    public void animationSort(Group animationSort);

    public void animationDebutEffet(Group animationSort);

    public void animationFinEffet(Group animationSort);
}
