package Pruebas;

import Modelo.DenominacionDeMoneda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author HAlvarez
 */
public class Vuelto {
   
    public static HashMap<Integer,DenominacionDeMoneda>
            vueltoEntregar(int cantidadDevolver,
                           TreeMap<Integer, DenominacionDeMoneda> denominacion){
        HashMap<Integer, DenominacionDeMoneda> vuelto;
        vuelto = null;
        Set set;
        set = denominacion.descendingKeySet();
        Iterator iter;
        iter = set.iterator();
        while (iter.hasNext()){
            
            System.out.println(denominacion.get(iter.next()).toString());
        }
        return vuelto;
    }
}
