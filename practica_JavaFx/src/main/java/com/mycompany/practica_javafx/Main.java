/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica_javafx;
import com.practica.productos.modelo.Producto;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        TextField campo = new TextField();
        Button boton = new Button("Mostrar");
        Label label = new Label();

        boton.setOnAction(e -> {
            try {
                Producto p = new Producto(campo.getText());
                label.setText(p.getNombre());
            } catch (Exception ex) {
                label.setText(ex.getMessage());
            }
        });

        VBox layout = new VBox(10, campo, boton, label);
        Scene scene = new Scene(layout, 300, 200);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
}
}
