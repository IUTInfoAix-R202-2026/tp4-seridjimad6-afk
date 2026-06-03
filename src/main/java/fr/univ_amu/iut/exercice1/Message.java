package fr.univ_amu.iut.exercice1;

/**
 * Modèle de l'exercice 1.
 *
 * <p>Un modèle MVVM contient les données et la logique métier PURE : aucune référence à JavaFX, ni
 * aux propriétés observables, ni à l'interface. C'est un simple POJO (Plain Old Java Object).
 *
 * <p>Ici le modèle ne porte qu'une chaîne de caractères : le message saisi par l'utilisateur.
 */
public class Message {

  private String texte;

  public Message(String texteInitial) {
    this.texte = texteInitial;
  }

  public String getTexte() {
    return texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }
}
