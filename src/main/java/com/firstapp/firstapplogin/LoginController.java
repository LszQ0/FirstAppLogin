package com.firstapp.firstapplogin;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button exitButton;

    @FXML
    private Button loginButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Open!");
    }
}
