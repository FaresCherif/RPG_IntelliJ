package sample;

import javafx.scene.Group;

/**
 * Interface définissant des méthodes à implémenter pour les animations des attaques d'armes et des sorts
 */
public interface Animation {

    public void animationArme(Group affichageArme);

    public void animationBlocage();

    public void animationSort();

    public void animationGrosSort();
}
