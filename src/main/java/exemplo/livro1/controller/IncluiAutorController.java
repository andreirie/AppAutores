package exemplo.livro1.controller;

import java.sql.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import exemplo.livro1.model.Autor;
import exemplo.livro1.dao.AutorDAO;

public class IncluiAutorController {

    @FXML
    private Button btnConf;

    @FXML
    private TextField txtNomEst;

    @FXML
    public void initialize() {
    }

    @FXML
    private void btnConfOnAction(ActionEvent event) {
        Autor autor = new Autor();
        autor.setNome(txtNomEst.getText());

        AutorDAO autorDAO = new AutorDAO();
        try {
            autorDAO.inserir(autor);
            Alert alert;
            alert = new Alert(AlertType.INFORMATION, "Você clicou no botão Confirmar", ButtonType.OK);
            alert.setTitle("Autor cadastrado com sucesso!");
            alert.setHeaderText("Informação");
            alert.show();
        } catch (SQLException e1) {
            Alert alert;
            alert = new Alert(AlertType.INFORMATION, "Você clicou no botão Cancelar", ButtonType.OK);
            alert.setTitle("Autor não foi cadastrado com sucesso!");
            alert.setHeaderText("Informação");
            alert.show();
            e1.printStackTrace();
        }
    }

    @FXML
    void btnVoltarOnAction(ActionEvent event) {
        // Obtém o stageAtual (janela que será fechada)
        Stage stageAtual = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Fecha o Stage atual
        stageAtual.close();
    }
}

