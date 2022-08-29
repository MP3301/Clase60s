package Vista;

import Entorno.Constantes;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author HAlvarez
 */
public class PanelDeControl extends JPanel implements Constantes{
    private final Botonera botonera;
    private final TecladoNumerico teclado;
    private final JTextField visor;
    private final JPanel panel0, panel1, panel2;

    public PanelDeControl() {
        
        setLayout(new FlowLayout());
        setBackground(Color.LIGHT_GRAY);
        setToolTipText("Introduce la cantidad de dinero");
        
        panel0 = new JPanel(new BorderLayout());
        panel1 = new JPanel(new FlowLayout());
        panel2 = new JPanel(new BorderLayout());

        visor = new JTextField();
        String [] nombreBotones = {"Aceptar", "Cancelar"};
        botonera = new Botonera(nombreBotones);
        teclado = new TecladoNumerico(10);
        
        panel0.add(visor, BorderLayout.NORTH);
        panel0.add(teclado, BorderLayout.CENTER);
        
        panel1.add(panel0);
        
        panel2.add(panel1, BorderLayout.NORTH);
        panel2.add(botonera, BorderLayout.CENTER);
        
        add(panel2);
    }
}