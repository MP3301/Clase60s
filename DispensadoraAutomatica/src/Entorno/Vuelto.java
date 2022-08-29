package Entorno;

import Modelo.DenominacionDeMoneda;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author HAlvarez
 */
public class Vuelto implements Constantes{

    public static ArrayList vueltoEntregar(int cantidadDevolver,
                           TreeMap<Integer, DenominacionDeMoneda> denominacion){
        ArrayList vuelto;
        vuelto = new ArrayList();
        int cantidadVuelto, valor, cantMonedas;
        DenominacionDeMoneda monedas;
        monedas = new DenominacionDeMoneda(1, "Ficticia");
        Set set;
        set = denominacion.descendingKeySet();
        Iterator iter;
        iter = set.iterator();
        while (iter.hasNext()){
            monedas     = denominacion.get((Integer)iter.next());
            valor       = monedas.getValorDeLaDenominacion();
            cantMonedas = monedas.getCantidad();
            monedas.disminuirCantidad(cantMonedas);
            if (cantidadDevolver >= valor){
                cantidadVuelto = cantidadDevolver / valor;
                if (cantidadVuelto >= cantMonedas){
                    cantidadDevolver = cantidadDevolver - cantMonedas * valor;
                    cantidadVuelto = cantMonedas;
                }
                else
                    cantidadDevolver = cantidadDevolver -cantidadVuelto * valor;
                
                monedas.setDescripcion(monedas.getDescripcion());
                monedas.setValorDeLaDenominacion(valor);
                monedas.aumentarCantidad(cantidadVuelto);
                vuelto.add(monedas);
            }
        }
        if (cantidadDevolver == CERO)
            return vuelto;
        else return null;
    }
}
