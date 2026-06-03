package fr.univ_amu.iut.exercice3;

/**
 * Implémentation simple (en dur) de {@link ServiceAuth}.
 *
 * <p>Pour le TP, un unique compte est reconnu : identifiant {@code marie}, mot de passe {@code
 * chiro2026}. Dans une vraie application, cette classe interrogerait une base de données (cf. TP5)
 * ou un annuaire.
 */
public class ServiceAuthSimple implements ServiceAuth {

  @Override
  public boolean connecter(String identifiant, String motDePasse) {
    return "marie".equals(identifiant) && "chiro2026".equals(motDePasse);
  }
}
