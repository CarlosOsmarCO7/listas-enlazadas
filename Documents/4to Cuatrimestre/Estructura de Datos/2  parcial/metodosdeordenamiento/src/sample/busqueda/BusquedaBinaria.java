package sample.busqueda;

/**
 * Created by UchihaMadara on 15/10/2017 0015.
 */
public class BusquedaBinaria {

     public int BinariaIterativo(int [] numeros, int valor){
        int max = numeros.length-1, min = 0, m = 0;
        while(min <= max){
            m = (min + max) /2;
            if(numeros[m] == valor){
                System.out.println(valor + " encontrado en la posicion: ["+ m +"]");
                return m;
            }
            if (valor < numeros[m]){
                max = m - 1;
            }else{
                min = m - 1;
            }
        }
         System.out.println(valor + " no ha sido encontrado");
         return -1;
     }
}
