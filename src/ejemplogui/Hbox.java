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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class Hbox extends Application {

    @Override
    public void start(Stage stage) throws FileNotFoundException {

        Button bt1 = new Button("Boton1");
        Button bt2 = new Button("Boton2");
        Button bt3 = new Button("Boton3");

        Label label1 = new Label("Search");
        FileInputStream input = new FileInputStream("camarita.png");
        Image image = new Image(input);
        Label label3 = new Label("Search", new ImageView(image));

        TableView table = new TableView();
        table.setEditable(true);
        TableColumn firstNameCol = new TableColumn("First Name");
        TableColumn lastNameCol = new TableColumn("Last Name");
        TableColumn emailCol = new TableColumn("Email");
        table.getColumns().addAll(firstNameCol, lastNameCol, emailCol);

        TextField textField = new TextField();
        Label label4 = new Label("nombre: ");
//GridPane        
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.TOP_LEFT);
        pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        pane.setHgap(5.5);
        pane.setVgap(5.5);
        pane.add(new Label("First Name:"), 0, 0);
        pane.add(new TextField(), 1, 0);
        pane.add(new Label("MI:"), 0, 1);
        pane.add(new TextField(), 1, 1);
        pane.add(new Label("Last Name:"), 0, 2);
        pane.add(new TextField(), 1, 2);
        Button btAdd = new Button("Add Name");
        pane.add(btAdd, 1, 3);
        GridPane.setHalignment(btAdd, HPos.RIGHT);
//GridPane2
GridPane gridpane = new GridPane();
ColumnConstraints col1 = new ColumnConstraints();
col1.setPercentWidth(20);
ColumnConstraints col2 = new ColumnConstraints();
col2.setPercentWidth(30);
gridpane.getColumnConstraints().addAll(col1,col2,col2,col1);
Label text = new Label("Enter Address");
gridpane.add(text, 0, 0, 4, 1); // (Columna 0, Fila 0)and colspan 4
GridPane.setHalignment(text, HPos.LEFT);
Label direccion = new Label("Direccion");
gridpane.add(direccion, 0, 1, 1, 1); // (Columna 0, Fila 1) andcolspan 1
GridPane.setHalignment(direccion, HPos.RIGHT);
TextField txtDireccion = new TextField();
gridpane.add(txtDireccion, 1, 1, 4, 1); // (Columna 0, Fila 1)and colspan 1
Label direccion2 = new Label("Direccion");
TextField txtDireccion2 = new TextField();
gridpane.add(direccion2, 0, 2, 1, 2); // (Columna 0, Fila 1)and colspan 1
gridpane.add(txtDireccion2, 1, 2, 4, 2); // (Columna 0, Fila 1)and colspan 1

//HBox y VBox
        HBox h2layout = new HBox();
        h2layout.getChildren().add(label4);
        h2layout.getChildren().add(textField);

        HBox hlayout = new HBox();
        hlayout.getChildren().add(bt1);
        hlayout.getChildren().add(bt2);
        hlayout.getChildren().add(bt3);
        // hlayout.getChildren().add(label3);

        VBox vlayout = new VBox();
        vlayout.getChildren().add(gridpane);
        vlayout.getChildren().add(pane);
        vlayout.getChildren().add(hlayout);
        vlayout.getChildren().add(label3);
        vlayout.getChildren().add(table);
        vlayout.getChildren().add(h2layout);
        //como invertir su orden

        Scene scene = new Scene(vlayout, 500, 500);
        stage.setTitle("MyJavaFX");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
