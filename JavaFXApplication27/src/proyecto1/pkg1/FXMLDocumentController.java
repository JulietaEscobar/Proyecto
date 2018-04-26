/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg1;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 *
 * @author Julieta Escobar
 */
public class FXMLDocumentController implements Initializable {
    Stage stage;
    
    @FXML
    private void Altas(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Altas.fxml"));
        Parent root = (Parent)loader.load();
        AltasController controller = (AltasController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void Asistencia(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Asistencia.fxml"));
        Parent root = (Parent)loader.load();
        AsistenciaController controller = (AsistenciaController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void Inscripcion(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Inscripcion.fxml"));
        Parent root = (Parent)loader.load();
        InscripcionController controller = (InscripcionController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.stage = new Stage();
    }    
    
}
