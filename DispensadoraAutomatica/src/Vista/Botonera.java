package Vista;

import Entorno.Constantes;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HAlvarez
 */
public class Botonera extends JPanel implements Constantes{
    private JButton [] botones;
    
    public Botonera(String [] nombres){
        int cantidadDeBotones = nombres.length;
        setLayout(new FlowLayout());
        if (cantidadDeBotones > CERO){
            botones = new JButton[nombres.length];
            for (int i = CERO; i < cantidadDeBotones; i++){
                botones [i] = new JButton(nombres[i]);
                add(botones[i]);
            }
        }
    }  
}