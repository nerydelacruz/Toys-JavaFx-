package org.nerydelacruz.controller;

import javafx.fxml.Initializable;
import org.nerydelacruz.sistema.Principal;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPrincipal implements Initializable {
    private Principal escenarioPrincipal;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

    public Principal getEscenarioPrincipal() {
        return escenarioPrincipal;
    }

    public void setEscenarioPrincipal(Principal escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }
}
