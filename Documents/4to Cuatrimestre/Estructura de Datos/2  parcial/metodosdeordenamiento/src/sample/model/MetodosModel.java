package sample.model;

import javafx.beans.property.SimpleIntegerProperty;
import sample.Metodos;

public class MetodosModel {

    public Integer Numeros;
    Metodos variables = new Metodos();

    public MetodosModel(int i) {
        this.Numeros = i;
    }



    public Integer getNumeros() {
        return Numeros;
    }
    public void setNumeros(Integer numeros) {
        Numeros = numeros;
    }
}
