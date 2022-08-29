package Modelo;

import Entorno.Constantes;

/**
 * Elaborado durante el desarrollo del curso Master en Java (Ago2022)
 * @author H Alvarez
 */
public class DenominacionDeMoneda implements Constantes{
    
    private Integer valorDeLaDenominacion;
    private String  descripcion;
    private int     cantidad; 

    public DenominacionDeMoneda(int valorDeLaDenominacion, String descripcion){
        setValorDeLaDenominacion(valorDeLaDenominacion);
        setDescripcion(descripcion);
        setCantidad(CERO);
    }

    public final String getDescripcion(){
        return descripcion;
    }

    public final void setDescripcion(String descripcion){
        if (descripcion.length() >= 3){
            this.descripcion = descripcion;
        }
        else
            mensajeError("Descripcion de la denominacion de la moneda " +
                         "incorrecta, muy corta");
        this.descripcion = descripcion;
    }

    public final Integer getValorDeLaDenominacion(){
        return valorDeLaDenominacion;
    }

    public final void setValorDeLaDenominacion(int valorDeLaDenominacion){
        this.valorDeLaDenominacion = valorDeLaDenominacion;
    }

    public  int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
    public final void aumentarCantidad(int cantidad){
        if (cantidad >= CERO)
            setCantidad(getCantidad() + cantidad);
        else
            mensajeError("Monto del aumento de la cantidad , " +
                         "debe ser un valor positivo");
    }
    
    public final void disminuirCantidad(int cantidad){
        
        if (cantidad >= CERO){
            int saldo = getCantidad() - cantidad;
            if (saldo >= CERO)
                setCantidad(saldo);
            else
                mensajeError("Monto de la disminucion de la cantidad de" +
                             " la denominacion es mayor que" +
                             " la cantidad en existencia");
        }  
        else
            mensajeError("Monto de la disminucion de la cantidad , " +
                         "debe ser un valor positivo");
    }
    
    private void mensajeError(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "DenominacionDeMoneda{" + "valorDeLaDenominacion=" +
               valorDeLaDenominacion + ", descripcion=" + descripcion +
               ", cantidad=" + cantidad + '}';
    }
    
}