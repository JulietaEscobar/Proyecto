/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.pkg1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Julieta Escobar
 */
public class AltasController implements Initializable {
    Stage stage;
    
    @FXML
    private void Alumnos(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Alumnos.fxml"));
        Parent root = (Parent)loader.load();
        AlumnosController controller = (AlumnosController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void Materias(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Materias.fxml"));
        Parent root = (Parent)loader.load();
        MateriasController controller = (MateriasController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    private void Maestros(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Maestros.fxml"));
        Parent root = (Parent)loader.load();
        MaestrosController controller = (MaestrosController)loader.getController();
        controller.setStage(this.stage);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.stage = new Stage();
    }
    
    public void setStage(Stage stage) {
        this.stage = stage;
    }
    
}
