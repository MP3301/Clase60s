
package Vista;

import Modelo.CestaDeProducto;
import Modelo.Producto;
import java.awt.FlowLayout;
import java.util.Collection;
import java.util.TreeMap;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


/**
 *
 * @author HAlvarez
 */
public class ListaDeProductos extends JPanel{
    
    private final JList<String> listaDeProductos;
    private final CestaDeProducto cesta;
    private final TreeMap<String, Producto> productos;

    public ListaDeProductos(){
        setLayout(new FlowLayout());
        setBorder(BorderFactory.createTitledBorder("Lista de Productos"));
        setToolTipText("Selecciona el producto");
        cesta = new CestaDeProducto();
        productos = cesta.getCestaDeProductos();
        
        // Collection coleccion = productos.values();
        // listaDeProductos = new JList(coleccion.toArray());
        String  [] estos =
                        {"*** HAZ UNA SELECCION ***",
                         "Cotufas con sal", "Cotufas acarameladas",
                         "Galletas oreo chocolate", "Galletas oreo vainilla",
                         "Galletas de soda", "CheesTris 100 Grs.",
                         "CheesTris 200 Grs.", "CheesTris 300 Grs.",
                         "CheesTris 500 Grs."
                         };
        listaDeProductos = new JList(estos);
        
        JScrollPane listaDesplegable = new JScrollPane(listaDeProductos);
        add(listaDesplegable);
    }  
}
