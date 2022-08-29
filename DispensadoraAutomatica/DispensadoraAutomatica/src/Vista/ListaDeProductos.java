package Vista;

import Modelo.CestaDeProducto;
import Modelo.Producto;
import java.awt.FlowLayout;
import java.util.TreeMap;
import javax.swing.BorderFactory;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ListaDeProductos extends JPanel {
    
    private final JList<String> listaDeProductos;
    private final CestaDeProducto cesta;
    private final TreeMap<String, Producto> productos;
public ListaDeProductos(){

    setLayout(new FlowLayout());
    setBorder(BorderFactory.createTitledBorder("Lista de productos"));
    setToolTipText("Selecciona el producto");
    cesta = new CestaDeProducto();
    productos = cesta.getCestaDeProductos();
    
    String [] estos = {"**SELECCION**","COTUFAS","GALLETA"};
    
    listaDeProductos = new JList(estos);
    
    JScrollPane listaDesplegable = new JScrollPane(listaDeProductos);
    add(listaDesplegable);
}
    
}
