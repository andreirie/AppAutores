package exemplo.livro1.controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenusController {
    @FXML
    private MenuItem menuAutorInclui;

    @FXML
    private MenuItem menuAutorAltera;

    @FXML
    private MenuItem telaVazia;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    void incluiOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/exemplo/curso1/view/incluiAutor.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            Scene newScene = new Scene(root);
            newStage.setScene(newScene);
            newStage.setTitle("Autor");
            newStage.setResizable(false);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    void alteraOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/exemplo/curso1/view/TelaVazia.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            Scene newScene = new Scene(root);
            newStage.setScene(newScene);
            newStage.setTitle("Autor");
            newStage.setResizable(false);
            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FXML
    private void telaVaziaOnAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/exemplo/curso1/view/TelaVazia.fxml"));
            Parent root = loader.load();
            Stage newStage = new Stage();
            Scene newScene = new Scene(root);
            newStage.setTitle("Professor");
            newStage.setScene(newScene);
            newStage.setResizable(false);
            newStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

