package Controlador;

import Modelo.Caja;
import Modelo.CestaDeProducto;
import Modelo.DenominacionDeMoneda;
import Modelo.Producto;
import Vista.ListaDeProductos;
import Vista.PanelDeControl;
import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 * Elaborado durante el desarrollo del curso
 * Master en Java (Ago2022)
 *
 * @author H Alvarez
 */
public class Dispensadora extends JFrame {

    PanelDeControl panelDeControl;
    ListaDeProductos productos;

    public Dispensadora() {
        setLayout(new BorderLayout());
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelDeControl = new PanelDeControl();
        productos = new ListaDeProductos();
        add(panelDeControl, BorderLayout.EAST);
        add(productos, BorderLayout.CENTER);
        pack();
        setVisible(true);

    }

    public static void main(String[] args) {

        new Dispensadora();
    }
}
