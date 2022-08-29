package Modelo;

import Entorno.Constantes;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Elaborado durante el desarrollo del curso Master en Java (Ago2022)
 * @author H Alvarez
 */
public class Caja implements Constantes{
     
    private String idCaja;
    private final TreeMap<Integer, DenominacionDeMoneda> denominacion;

    public Caja(String idCaja) {
        setIdCaja(idCaja);
        denominacion = new TreeMap();
    }

    public final TreeMap<Integer, DenominacionDeMoneda> getDenominacion(){
        return denominacion;
    }

    public final void agregarDenominacion(DenominacionDeMoneda denominacion){
        int clave = denominacion.getValorDeLaDenominacion();
        if (this.denominacion.get(clave) == null)
            this.denominacion.put(clave, denominacion);
        else
            mensajeError("La denominacion de la moneda ya existe");
    }
                                    
    public final void quitarDenominacion(DenominacionDeMoneda denominacion){
        if (denominacion.getCantidad() == 0)
            if(this.denominacion.remove(denominacion.getValorDeLaDenominacion(),
                denominacion));
            else
                mensajeError("La denominacion de la moneda no existe");
        else
           mensajeError("Error: La denominacion tiene existencia"); 
    }

    public final String getIdCaja(){
        return idCaja;
    }

    public final void setIdCaja(String idCaja){
        this.idCaja = idCaja;
    }
    
    public final int cantidadDeDinero(){
        Collection coleccion = denominacion.values();
        Iterator itr = coleccion.iterator();
        DenominacionDeMoneda denom;
        int monto = CERO;
        int valor, cant;
        
        while(itr.hasNext()){
            denom = (DenominacionDeMoneda)itr.next();
            valor = denom.getValorDeLaDenominacion();
            cant  = denom.getCantidad();
            monto = monto + cant * valor;
        }
        return monto;
    } 
    
    public void entregarVuelto(ArrayList<DenominacionDeMoneda> vuelto){
        DenominacionDeMoneda deno;
        DenominacionDeMoneda denoX;
        Iterator iter;
        iter = vuelto.iterator();
        int clave, cantidad;
        while (iter.hasNext()){
            deno = (DenominacionDeMoneda)iter.next();
            clave = deno.getValorDeLaDenominacion();
            cantidad = deno.getCantidad();
            denoX = denominacion.get(clave);
            denoX.disminuirCantidad(cantidad);
        }
    }
    
    public ArrayList<DenominacionDeMoneda>
                                          vueltoAEntregar(int cantidadDevolver){
        ArrayList<DenominacionDeMoneda> vuelto = null;
        if (cantidadDevolver >= CERO){
            
            vuelto = new ArrayList();
            int cantidadVuelto, valor, cantMonedas;
            DenominacionDeMoneda monedas;
            DenominacionDeMoneda monedasAux;
            Set set;
            set = denominacion.descendingKeySet();
            Iterator iter;
            iter = set.iterator();
            while (iter.hasNext()){
                monedas     = denominacion.get((Integer)iter.next());
                cantMonedas = monedas.getCantidad();
                valor       = monedas.getValorDeLaDenominacion();
                
                if (cantidadDevolver >= valor && cantMonedas > CERO){
                    cantidadVuelto = cantidadDevolver / valor;
                    
                    if (cantidadVuelto >= cantMonedas){
                        cantidadDevolver = cantidadDevolver - cantMonedas *
                                                              valor;
                        cantidadVuelto = cantMonedas;
                    }
                    else
                        cantidadDevolver = cantidadDevolver - cantidadVuelto *
                                                              valor;
                    
                    monedasAux = new DenominacionDeMoneda(1, "Ficticia");
                    monedasAux.setDescripcion(monedas.getDescripcion());
                    monedasAux.setValorDeLaDenominacion(valor);
                    monedasAux.aumentarCantidad(cantidadVuelto);
                    vuelto.add(monedasAux);
                }
            }
            if (cantidadDevolver != CERO)
                vuelto = null;
        }
        else {
            System.out.println("Error, cantidad a devolver debe ser positiva.");
        }
        return vuelto;
    }
   
    private void mensajeError(String mensaje){
        System.out.println(mensaje);
    }
    
    @Override
    public String toString() {
        return "Caja{" + "idCaja=" + idCaja + ", denominacion=" + denominacion +
               '}';
    }
    
}
