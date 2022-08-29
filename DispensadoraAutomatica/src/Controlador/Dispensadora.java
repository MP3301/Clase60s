package Controlador;

import Modelo.Caja;
import Modelo.CestaDeProducto;
import Modelo.DenominacionDeMoneda;
import Modelo.Producto;
import java.util.ArrayList;
/**
 * Elaborado durante el desarrollo del curso Master en Java (Ago2022)
 * @author H Alvarez
 */
public class Dispensadora{
    
    public static void main(String[] args) {
        
        DenominacionDeMoneda denom;
        
        Caja caja = new Caja("2020");
        denom = new DenominacionDeMoneda(1, "Un Bs.");
        denom.aumentarCantidad(3);
        caja.agregarDenominacion(denom);
        denom = new DenominacionDeMoneda(2, "Dos Bs.");
        denom.aumentarCantidad(0);
        caja.agregarDenominacion(denom);
        denom = new DenominacionDeMoneda(10, "Diez Bs.");
        denom.aumentarCantidad(2);
        caja.agregarDenominacion(denom);
        denom = new DenominacionDeMoneda(5, "Cinco Bs.");
        denom.aumentarCantidad(0);
        caja.agregarDenominacion(denom);
        //System.out.println(caja.toString());
        //System.out.println("Total en caja: " + caja.cantidadDeDinero());
        Producto  producto = new Producto();
        //System.out.println(producto.toString());
        producto.aumentarPrecioPorcentual(10);
        //System.out.println(producto.toString());
        producto.setIdDelProducto("Pal02");
        producto.aumentarCantidad(12);
        producto.setDescripcion("Palomitas de maiz 100 Grs");
        producto.setUnidadDeMedida("pqt", "Paquete");
        //System.out.println(producto.toString());
        
        CestaDeProducto cesta = new CestaDeProducto();
        cesta.agregarProducto(producto);
        //System.out.println(cesta.toString());
        String clave = producto.getIdDelProducto();
        producto = cesta.consultarProducto(clave);
        if (producto != null){
            producto.aumentarCantidad(8);
            //System.out.println(cesta.toString());
        }
        producto = new Producto();

        producto.setIdDelProducto("Pal01");
        producto.aumentarCantidad(5);
        producto.setDescripcion("Palomitas de maiz 60 Grs");
        producto.setUnidadDeMedida("pqt", "Paquete");
        cesta.agregarProducto(producto);
        //System.out.println(cesta.toString());
        System.out.println(caja.toString());
        System.out.println(caja.cantidadDeDinero());
        ArrayList vuelto = caja.vueltoAEntregar(25);

        if (vuelto != null) caja.entregarVuelto(vuelto);
        else
            System.out.println("No hay cambio en caja. " +
                               "Imposible entregar vuelto");
        System.out.println(caja.toString());
    }
}
