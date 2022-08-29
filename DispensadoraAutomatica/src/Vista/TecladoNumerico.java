package Vista;

import Entorno.Constantes;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author HAlvarez
 */
public class TecladoNumerico extends JPanel implements Constantes{
    private JButton [] botones;

    public TecladoNumerico(int cantidadBotones){
        setLayout (new GridLayout(0,3));
        String caption;
        int modulo;
        
        if (cantidadBotones > CERO){
            modulo = cantidadBotones % 3;
            if (modulo != CERO){
                modulo = 3 - modulo; 
                cantidadBotones += modulo;
            }
            botones = new JButton[cantidadBotones];
            for (int i = CERO; i < cantidadBotones; i++){
                if (i < 10 && i < (cantidadBotones - modulo))
                    caption = String.valueOf(i);
                else
                    caption = "-";
                botones[i] = new JButton(caption);
                add(botones[i]);
            }
        } 
    }
}