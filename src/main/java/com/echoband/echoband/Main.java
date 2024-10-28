package com.echoband.echoband;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("viewSignUp.fxml"));
        BorderPane root = fxmlLoader.load();

        // Crear y configurar el ImageView con la imagen
        Image imagen = new Image(Main.class.getResource("/imgSignUp.jpg").toExternalForm());
        ImageView imageView = new ImageView(imagen);

        // Enlazar el tamaño del ImageView al tamaño de la región derecha del BorderPane
        imageView.fitWidthProperty().bind(root.widthProperty().divide(2)); // Ajusta al 50% del ancho de la ventana
        imageView.fitHeightProperty().bind(root.heightProperty());         // Ajusta a la altura completa de la ventana
        imageView.setPreserveRatio(true);  // Mantiene la relación de aspecto original de la imagen

        // Colocar el ImageView en el lado derecho del BorderPane
        root.setRight(imageView);

        // Crear la escena y agregar el archivo CSS
        Scene scene = new Scene(root, 1200, 700);
        scene.getStylesheets().add(Main.class.getResource("styleSignUp.css").toExternalForm());

        stage.setTitle("Inicio de Sesión");
        stage.setMinWidth(1200);
        stage.setMinHeight(700);
        stage.centerOnScreen();
        stage.setFullScreen(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}