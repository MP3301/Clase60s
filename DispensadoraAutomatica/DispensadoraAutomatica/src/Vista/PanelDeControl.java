package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelDeControl extends JPanel {
    
    private final Botonera botonera;
    private final TecladoNumerico teclado;
    private final JTextField visor;
    private final JPanel panel10,panel11,panel12,panel14;
    
    
    public PanelDeControl(){
    
    
            setLayout(new FlowLayout());
            setBackground(Color.red);
            setToolTipText("asdfsadfasdfasdfssdfdfdad");
            
            panel10 = new JPanel(new BorderLayout());
            panel11 = new JPanel(new FlowLayout());
            panel12 = new JPanel(new BorderLayout());
            panel14 = new JPanel(new FlowLayout());
    
            
            visor = new JTextField(4);
            panel14.add(visor);
            String[] nombreBotones = {"Aceptar","Cancelar"};
            botonera = new Botonera(nombreBotones);
            teclado = new TecladoNumerico(10);
            
            panel10.add(panel14, BorderLayout.NORTH);
            panel10.add(teclado, BorderLayout.CENTER);
            panel11.add(panel10);
            
            panel12.add(panel11, BorderLayout.NORTH);
            
            panel12.add(botonera,BorderLayout.CENTER);
            
            add(panel12);
    }
        
    
    }
