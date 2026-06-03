package fr.univ_amu.iut.exercice2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Point d'entrée de l'exercice 2.
 *
 * <p>Même bootstrap qu'à l'exercice 1 : assemblage Modèle -> ViewModel -> Vue, contrôleur fourni à
 * la main via {@code setControllerFactory}. Ce câblage manuel deviendra automatique avec Guice à
 * l'exercice 4.
 */
public class CompteurApp extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    CompteurViewModel viewModel = new CompteurViewModel(new Compteur());

    FXMLLoader loader = new FXMLLoader(getClass().getResource("CompteurView.fxml"));
    loader.setControllerFactory(type -> new CompteurController(viewModel));
    Parent racine = loader.load();

    stage.setTitle("Exercice 2 - Compteur MVVM");
    stage.setScene(new Scene(racine));
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
