package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.MetodosOrdenamiento.MtBurbuja;
import sample.busqueda.BusquedaBinaria;
import sample.busqueda.BusquedaSecuencial;
import sample.model.MetodosModel;
import sun.nio.cs.ext.MacThai;

import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.ResourceBundle;

public class Metodos implements Initializable{

    //Definimos el nombre de los controladores que usaremos en el sample.fxml
    @FXML Button Btngenerar, buscarbtn;
    @FXML TextField cantidad, buscartxt;
    @FXML ListView<Integer> list, List1;
    @FXML ComboBox CmbOrdenar, cmbBusqueda;

    //Declaramos una variable de tipo Int
    int Buscartxt = 0;
    //Se establecen los tipos de ordenamiento
    Random random = new Random();
    //Se establecen los tipos de ordenamiento
    BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
    MtBurbuja mtBurbuja = new MtBurbuja();

    public int rango = 0;
    public int numeroBuscar = 0;

    public int[] Valores = new int[0];

    //Se inicializa el metodo
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        //Realizamos el evento de nuestro boton para seleccionar el tipo de ordenamiento de nuestro combo box
        this.CmbOrdenar.getItems().addAll("Metodo burbuja","Metodo Quick", "Metodo Merge");


        this.CmbOrdenar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                //load module content into main window container
                ObservableList<Integer> items1 =FXCollections.observableArrayList();
                for (int i = 0; i < rango; i++){
                    int v [] = mtBurbuja.burbuja(Valores);
                    items1.addAll(v[i]);
                    list.setItems(items1);

                }

            }
        });

        this.Btngenerar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                rango = Integer.parseInt(cantidad.getText());
                Valores = new int[rango];

                ObservableList<Integer> items = FXCollections.observableArrayList();

                for (int i = 0; i < rango; i++) {
                    int randomInteger = random.nextInt(200);
                    Valores[i] = randomInteger;
                    list.getItems().addAll(Valores[i]);

                }
                for (int i =  rango - 1; i > -1; i--) {
                    List1.getItems().addAll(Valores[i]);
                }
                list.setOrientation(Orientation.HORIZONTAL);
                List1.setOrientation(Orientation.HORIZONTAL);
                System.out.println("pseudo random int in a range : " + Arrays.toString(Valores));
            }
        });


        this.buscarbtn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                numeroBuscar = Integer.parseInt(buscartxt.getText());
                BusquedaSecuencial busquedaSecuencial = new BusquedaSecuencial();
                BusquedaBinaria busquedaBinaria = new BusquedaBinaria();

                ObservableList<Integer> items2 =FXCollections.observableArrayList();
                busquedaSecuencial.Secuencial(Valores, numeroBuscar);
                busquedaBinaria.BinariaIterativo(Valores, numeroBuscar);

            }
        });

    }
}
