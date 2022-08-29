package Pruebas;

import Modelo.DenominacionDeMoneda;

/**
 *
 * @author HAlvarez
 */
public class CantidadDinero {
    // Arreglo de diez elementos que contiene objetos DenominacionDeMoneda
    
    
    public static int cuantoDineroHay(DenominacionDeMoneda [] dinero){
       int monto = 0, valor, cantidad;
       
        // length devuelve la cantidad de elementos de un arreglo
        for (int i=0; i< dinero.length; i++){
            valor       = dinero[i].getValorDeLaDenominacion();
            cantidad    = dinero[i].getCantidad();
            monto = monto + cantidad * valor;
        }
       return monto;
    }
    
    public static void main(String[] args) {
        DenominacionDeMoneda [] dinero = new DenominacionDeMoneda[4];
        
        dinero[0] = new DenominacionDeMoneda(1, "Un Bs.");
        dinero[0].aumentarCantidad(10);
        
        dinero[1] = new DenominacionDeMoneda(5, "Cinco Bs.");
        dinero[1].aumentarCantidad(5);
        
        dinero[2] = new DenominacionDeMoneda(10, "Diez Bs.");
        dinero[2].aumentarCantidad(4);
        
        dinero[3] = new DenominacionDeMoneda(20, "Veinte Bs.");
        dinero[3].aumentarCantidad(8);
        
        System.out.println("Hay " + cuantoDineroHay(dinero));
    }
}
