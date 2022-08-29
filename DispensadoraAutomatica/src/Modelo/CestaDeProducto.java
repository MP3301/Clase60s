package Modelo;

import Entorno.Constantes;
import java.util.TreeMap;

/**
 * Elaborado durante el desarrollo del curso Master en Java (Ago2022)
 * @author H Alvarez
 */

public class CestaDeProducto implements Constantes{
    
    private final TreeMap<String, Producto> cestaDeProductos;

    public CestaDeProducto() {
        cestaDeProductos = new TreeMap();
    }
    
    public final TreeMap<String, Producto> getCestaDeProductos(){
        return cestaDeProductos;
    }
    
    public final void agregarProducto(Producto producto){
        String clave = producto.getIdDelProducto();
        if (cestaDeProductos.get(clave) == null)
            cestaDeProductos.put(clave, producto);
        else
            mensajeError("Producto ya existe en la cesta");
    }
    
    public final void quitarProducto(Producto producto){
        String clave = producto.getIdDelProducto();
        int existe;
        if (cestaDeProductos.get(clave) != null){
           existe =
              ((Producto)cestaDeProductos.get(clave)).getCantidadEnExistencia();
            if (existe == CERO)
                cestaDeProductos.remove(clave, producto);
            else
                mensajeError("Producto con existencia; No puede eliminarse");
        }
        else
            mensajeError("Producto no existe en la cesta");
    }
    
    public final Producto consultarProducto(String clave){
        Producto producto = null;
        if (cestaDeProductos.get(clave) != null){
            producto = (Producto)cestaDeProductos.get(clave);
        }
        return producto;
    }
    
    private void mensajeError(String mensaje){
        System.out.println(mensaje);
    }

    @Override
    public String toString() {
        return "CestaDeProducto{" + "cestaDeProductos=" + cestaDeProductos + '}';
    }
    
}
