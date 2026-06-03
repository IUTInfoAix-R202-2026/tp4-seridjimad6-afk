package fr.univ_amu.iut.exercice3;

/**
 * Service d'authentification de l'application VigieChiro PR Companion.
 *
 * <p>C'est une <b>interface</b> : le ViewModel dépendra de ce contrat, pas d'une implémentation
 * concrète. Ce découplage est ce qui rendra l'injection de dépendances (exercice 4) intéressante :
 * on pourra fournir une vraie implémentation en production, et un faux service (mock) dans les
 * tests, sans changer une ligne du ViewModel.
 */
public interface ServiceAuth {

  /**
   * Tente d'authentifier un utilisateur.
   *
   * @return {@code true} si les identifiants sont valides, {@code false} sinon.
   */
  boolean connecter(String identifiant, String motDePasse);
}
