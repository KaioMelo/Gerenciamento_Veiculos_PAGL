package br.mil.fab.pagl.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FXMLLoginController implements Initializable {

    @FXML
    private TextField textFieldCPF;
    @FXML
    private TextField getTextFielSenha;
    @FXML
    private Button btnLogin;
    @Override
    public void initialize(URL url, ResourceBundle rB) {
    }

    private void loadScene(String fxmlPath, ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
        ScrollPane root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        stage.centerOnScreen();
    }

    @FXML
    public void entrarInterfaceHome(ActionEvent event) throws IOException{
        loadScene("/view/FXMLInicio.fxml", event);
    }
}
