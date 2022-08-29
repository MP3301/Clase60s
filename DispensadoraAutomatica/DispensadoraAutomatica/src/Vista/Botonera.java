package Vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Botonera extends JPanel{
    
private JButton [] botones;

public Botonera (String [] nombres){

    int cantidadDeBotones = nombres.length;
    
    setLayout(new FlowLayout());
    
    if (cantidadDeBotones >  0){
    
        botones = new JButton[nombres.length];
        
        for (int i = 0; i < cantidadDeBotones; i++) {
            botones[i] = new JButton(nombres[i]);
            add(botones[i]);
        }
        
        
    }
}
    
}
