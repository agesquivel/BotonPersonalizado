package sample;

import customizedcontrols.ButtonCustomized;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        VBox contenedorPrincipal = new VBox();
        ButtonCustomized miBoton = new ButtonCustomized("Botón inclinado");
        contenedorPrincipal.getChildren().add(miBoton);

        miBoton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                  miBoton.contarClic();
            }
        });

        //Poner un componente que muestre el conteo de clics


        //Vincular una property del componente con la property pptNumClics del botón


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(contenedorPrincipal, 300, 275));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
