/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

/**
 *
 * @author dmadero
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EjemploGUI extends Application {


    @Override
    public void start(Stage stage) {
       Button btOK = new Button ("OK");
       Scene scene = new Scene (btOK, 200, 250);
       stage.setTitle("MyJavaFX");
       stage.setScene(scene);
       stage.show();
    }
    static void main(String[] args) {
       
    } 
}
