package fr.univ_amu.iut.exercice3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Point d'entrée de l'exercice 3.
 *
 * <p>Observez le câblage manuel : on choisit ICI l'implémentation concrète du service ({@link
 * ServiceAuthSimple}) et on la passe au ViewModel. C'est exactement ce que Guice fera à notre place
 * à l'exercice 4, déclaré une bonne fois pour toutes dans un module.
 */
public class FormulaireConnexionApp extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    ServiceAuth serviceAuth = new ServiceAuthSimple();
    FormulaireConnexionViewModel viewModel = new FormulaireConnexionViewModel(serviceAuth);

    FXMLLoader loader = new FXMLLoader(getClass().getResource("FormulaireConnexionView.fxml"));
    loader.setControllerFactory(type -> new FormulaireConnexionController(viewModel));
    Parent racine = loader.load();

    stage.setTitle("Exercice 3 - Formulaire MVVM");
    stage.setScene(new Scene(racine));
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
