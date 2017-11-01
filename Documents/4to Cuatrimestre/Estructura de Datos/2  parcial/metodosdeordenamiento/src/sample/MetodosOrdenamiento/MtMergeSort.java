package sample.MetodosOrdenamiento;

import java.util.Arrays;

/**
 * Created by UchihaMadara on 16/10/2017 0016.
 */
public class MtMergeSort {

    public static void main(String args[]){
        int vec[]={45,17,23,67,21};
        System.out.println("Vector original");
        imprimirVector(vec);
        System.out.println("\nVector ordenado");
        ordenacionMergeSort(vec);
        imprimirVector(vec);
    }

    public static void ordenacionMergeSort(int vec[]){
        if(vec.length<=1) return;
        int mitad= vec.length/2;
        int izq[]= Arrays.copyOfRange(vec, 0, mitad);
        int der[]=Arrays.copyOfRange(vec, mitad, vec.length);
        ordenacionMergeSort(izq);
        ordenacionMergeSort(der);
        combinarVector(vec, izq, der);
    }

    public static void combinarVector(int v[], int izq[],int der[]){
        int i=0;
        int j=0;
        for(int k=0;k<v.length;k++){
            if(i>=izq.length){
                v[k]=der[j];
                j++;
                continue;
            }
            if(j>=der.length){
                v[k]=izq[i];
                i++;
                continue;
            }
            if(izq[i]<der[j]){
                v[k]=izq[i];
                i++;
            }else{
                v[k]=der[j];
                j++;
            }
        }
    }

    public static void imprimirVector(int vec[]){
        for(int i=0;i<vec.length;i++){
            System.out.print(vec[i]+" ");
        }
    }

}

