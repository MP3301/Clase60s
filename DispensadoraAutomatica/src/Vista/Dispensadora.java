package Vista;

import Entorno.Constantes;
import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author HAlvarez
 */
public class Dispensadora extends JFrame implements Constantes{
    PanelDeControl panelDeControl;
    ListaDeProductos productos;

    public Dispensadora(){
        setLayout(new BorderLayout());
        setSize(400,400);
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
