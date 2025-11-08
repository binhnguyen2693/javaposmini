package com.mycompany.posmini;

import javafx.fxml.FXML;

public class SplashController {

    @FXML
    private void goToLogin() throws Exception {
        App.setRoot("/fxml/Login");
    }
}
