package Modelo;

import Entorno.Constantes;

/**
 * Elaborado durante el desarrollo del curso Master en Java
 * @author H Alvarez
 */
public class Producto implements Constantes{
    
    private String idDelProducto;
    private String descripcion;
    private int    cantidadEnExistencia;
    private double precio;
    private final  UnidadDeMedida unidadDeMedida;

    public Producto(){
        setIdDelProducto(String.valueOf(CERO));
        setDescripcion ("Sin descripcion");
        setCantidadEnExistencia(CERO);
        setPrecio(CERO);
        unidadDeMedida = new UnidadDeMedida();
    }

    public final String getIdDelProducto(){
        return idDelProducto;
    }

    public final void setIdDelProducto(String idDelProducto) {
        this.idDelProducto = idDelProducto;
    }

    public final String getDescripcion(){
        return descripcion;
    }

    public final void setDescripcion(String descripcion){
        if (descripcion.length() >= 4)
            this.descripcion = descripcion;
        else
            System.out.println("Descripcion del producto incorrecta, es corta");
    }

    public final int getCantidadEnExistencia(){
        return cantidadEnExistencia;
    }

    private void setCantidadEnExistencia(int cantidadEnExistencia){
        if (cantidadEnExistencia >= CERO)
            this.cantidadEnExistencia = cantidadEnExistencia;
        else
            System.out.println("Cantidad en existencia incorrecta, debe ser " +
                               "un valor positivo");
    }
        
    public final void aumentarCantidad(int cantidad){
        if (cantidad >= CERO)
            setCantidadEnExistencia(getCantidadEnExistencia() + cantidad);
        else
            mensajeError("Monto del aumento de la cantidad en existencia " +
                         "debe ser un valor positivo");
    }
    
    public final void disminuirCantidad(int cantidad){
        
        if (cantidad >= CERO){
            int saldo = getCantidadEnExistencia() - cantidad;
            if (saldo >= CERO)
                setCantidadEnExistencia(saldo);
            else
                mensajeError("Cantidad a disminuir la existencia del producto" +
                             " es mayor que la cantidad en existencia");
        }  
        else
            mensajeError("Cantidad a disminuir la existencia del producto" +
                         "debe ser un valor positivo");
    }

    public final double getPrecio(){
        return precio;
    }

    private void setPrecio(double precio){
        if (precio >= CERO)
            this.precio = precio;
        else
            mensajeError("Precio del producto incorrecto, debe ser un valor " +
                         "positivo");
    }

    public final UnidadDeMedida getUnidadDeMedida(){
        return unidadDeMedida;
    }

    public final void setUnidadDeMedida(String id, String descripcion){
        if (descripcion.length() >= 3){
            unidadDeMedida.setIdUnidadMedida(id);
            unidadDeMedida.setDescripcion(descripcion);
        }
        else
            mensajeError("Descripcion de la unidad de medida incorrecta, " +
                         "es muy corta");
    }
    
    public final void aumentarPrecioPorcentual(double porcentaje){
        if (porcentaje >= CERO && porcentaje <= 100)
            setPrecio(getPrecio() + getPrecio() * porcentaje / 100);
        else
            mensajeError("Porcentaje de aumento del precio incorrecto, " +
                         "debe ser un valor positivo entre 0 y 100");
    }
    
    public final void disminuirPrecioPorcentual(double porcentaje){
        if (porcentaje >= CERO && porcentaje <= 100)
            setPrecio(getPrecio() - getPrecio() * porcentaje / 100);
        else
            mensajeError("Porcentaje de disminucion del precio incorrecto, " +
                         "debe ser un valor positivo entre 0 y 100");
    }
    
    public final void aumentarPrecio(double monto){
        if (monto >= CERO)
            setPrecio(getPrecio() + monto);
        else
            mensajeError("Monto del aumento del precio incorrecto, debe ser un"+
                         " valor positivo");
    }
    
    public final void disminuirPrecio(double monto){
        if (monto >= CERO){
            double saldo = getPrecio() - monto;
            if (saldo >= CERO)
                setPrecio(saldo);
            else
                mensajeError("Cantidad a disminuir el precio del producto" +
                             " es mayor que el precio actual");
        }
        else
            mensajeError("Monto del decremento del precio incorrecto, debe ser"+
                         " un valor positivo");
    }
    
    private void mensajeError(String mensaje){
        System.out.println(mensaje);
    }
    
    @Override
    public String toString(){
        return "Producto{" + "idDelProducto=" + idDelProducto + 
               ", descripcion=" + descripcion + ", cantidadEnExistencia=" +
               cantidadEnExistencia + ", precio=" + precio +
               ", unidadDeMedida=" + unidadDeMedida.toString() + '}';
    }
}