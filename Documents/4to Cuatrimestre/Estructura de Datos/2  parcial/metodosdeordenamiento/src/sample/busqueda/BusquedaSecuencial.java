package sample.busqueda;

import sample.Metodos;

public class BusquedaSecuencial {

    public void Secuencial(int[] numeros, int valor){
        boolean encontrado = false;
        int posicion[] = new int[0];

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] == valor){
                encontrado = true;
                System.out.println(valor + " encontrado en la posicion: ["+i+"]");

            }
        }
        if (!encontrado) {
            System.out.println("Este numero no ha sido encontrado");
        }
    }
}
