package org.nerydelacruz.sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.nerydelacruz.controller.ControladorPrincipal;

import java.io.InputStream;
import java.sql.SQLOutput;

public class Principal extends Application {
    private final String RUTA = "/org/nerydelacruz/view/";
    private Stage escenarioPrincipal;
    private Scene escena;
    public static void main(String [] args){
        System.out.println("Bendicion Primera");
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        this.escenarioPrincipal = escenarioPrincipal;
        escenarioPrincipal.show();
        menuPrincipal();

    }

    public void menuPrincipal(){
        try {
            ControladorPrincipal controladorPrincipal = (ControladorPrincipal) cambiarEscena("MenuPrincipal.fxml", 600, 400);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public Initializable cambiarEscena(String fxml, int ancho, int alto) throws Exception {
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader();
        InputStream archivo = Principal.class.getResourceAsStream(RUTA+fxml);
        JavaFXBuilderFactory javaFXBuilderFactory = new JavaFXBuilderFactory();
        cargadorFXML.setBuilderFactory(javaFXBuilderFactory);
        cargadorFXML.setLocation(Principal.class.getResource(RUTA+fxml));
        escena = new Scene((AnchorPane)cargadorFXML.load(archivo),ancho,alto);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.sizeToScene();
        resultado = (Initializable) cargadorFXML.getController();
        return resultado;


    }
}
