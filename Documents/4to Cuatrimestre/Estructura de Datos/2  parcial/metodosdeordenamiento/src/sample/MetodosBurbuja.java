package sample;

/**
 * Created by UchihaMadara on 15/10/2017 0015.
 */
public class MetodosBurbuja {

    public void burbuja(int [] A){
        int i, j, aux;
        for(i=0;i<A.length-1;i++)
            for(j=0;j<A.length-i-1;j++)
                if(A[j+1]<A[j]){
                    aux=A[j+1];
                    A[j+1]=A[j];
                    A[j]=aux;
                }
    }
}
