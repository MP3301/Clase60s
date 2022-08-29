package Vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class TecladoNumerico extends JPanel{
    private JButton [] botones;

    public TecladoNumerico(int cantidadBotones) {
        
        setLayout(new GridLayout(0, 3));
        String caption;
        int modulo;
        
        if (cantidadBotones > 0) {
            modulo = cantidadBotones % 3;
            
            if(modulo != 0){
            modulo = 3 - modulo;
            cantidadBotones += modulo;
            
            
            }
            
            botones = new JButton[cantidadBotones];
            
            for (int i = 0; i < cantidadBotones; i++) {
                if (i < 10 && i < (cantidadBotones - modulo)) {
                    caption = String.valueOf(i);
                } else {
                caption = "-";}
                botones[i] = new JButton(caption);
                    add(botones[i]);
                }
            }
            
        }
        
    }
    