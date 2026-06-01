package fr.univ_amu.iut.exercice3;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class FormulaireConnexionViewModel {

  private final ServiceAuth serviceAuth;

  private final StringProperty identifiant = new SimpleStringProperty("");
  private final StringProperty motDePasse = new SimpleStringProperty("");
  private final StringProperty statut = new SimpleStringProperty("");
  private final BooleanProperty validable = new SimpleBooleanProperty(false);

  public FormulaireConnexionViewModel(ServiceAuth serviceAuth) {
    this.serviceAuth = serviceAuth;

    // Formulaire valide uniquement si les deux champs sont remplis
    validable.bind(
        identifiant.isNotEmpty()
            .and(motDePasse.isNotEmpty()));
  }

  public StringProperty identifiantProperty() {
    return identifiant;
  }

  public StringProperty motDePasseProperty() {
    return motDePasse;
  }

  public StringProperty statutProperty() {
    return statut;
  }

  public BooleanProperty validableProperty() {
    return validable;
  }

  /**
   * Commande de connexion.
   */
  public void connecterCommand() {
    // 1. Afficher l'état en cours
    statut.set("Connexion en cours...");

    // 2. Appeler le service d'authentification
    boolean succes = serviceAuth.connecter(identifiant.get(), motDePasse.get());

    // 3. Publier le résultat
    if (succes) {
      statut.set("Bienvenue " + identifiant.get() + " !");
    } else {
      statut.set("Identifiants incorrects. Vérifiez votre saisie.");
    }
  }
}