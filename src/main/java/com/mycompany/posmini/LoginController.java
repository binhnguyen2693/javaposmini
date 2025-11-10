package com.mycompany.posmini;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField usernameField;
    @FXML private PasswordField passwordField;
    @FXML private Label errorLabel;

    @FXML
    private void handleLogin() throws Exception {
        String user = usernameField.getText();
        String pass = passwordField.getText();

        if (user.equals("binhnguyen") && pass.equals("hnd")) {
        App.setRoot("Main");
        } else {
            errorLabel.setText("Sai tài khoản hoặc mật khẩu!");
        }
    }
}
