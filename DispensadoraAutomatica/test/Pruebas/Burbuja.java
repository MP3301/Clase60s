package Pruebas;

import java.util.Arrays;
/**
 *
 * @author H Alvarez
 */
public class Burbuja {
    int[] arreglo;
    
    public Burbuja(){
        arreglo = new int[10];
        arreglo[0] = 10;
        arreglo[1] = 6;
        arreglo[2] = 2;
        arreglo[3] = 4;
        arreglo[4] = 5;
        arreglo[5] = 3;
        arreglo[6] = 8;
        arreglo[7] = 8;
        arreglo[8] = 6;
        arreglo[9] = 0;
        burbuja();
    }
    
    final void burbuja(){
        int aux;
        for (int i=0; i<arreglo.length;i++){
            for (int j=i+1; j<arreglo.length;j++){
                if (arreglo[i] > arreglo[j]){
                    aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(arreglo));   
    }
    
    public static void main(String[] args) {
        new Burbuja();
    }
}
