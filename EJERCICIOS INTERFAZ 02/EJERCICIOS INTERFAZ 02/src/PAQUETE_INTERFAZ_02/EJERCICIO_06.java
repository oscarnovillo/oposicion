/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE_INTERFAZ_02;

/**
 *
 * @author Administrador
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EJERCICIO_06 extends JFrame implements ActionListener
{
    public JButton VERDE,AMARILLO,ROJO;
    public JPanel COLOR_PANEL;

    public EJERCICIO_06() 
    {
        super("COLORES... JAVADHC");
        this.setSize(400,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.VERDE = new JButton("VERDE");
        this.VERDE.setBackground(Color.GREEN);
        this.VERDE.addActionListener(this);
        this.AMARILLO = new JButton("AMARILLO");
        this.AMARILLO.setBackground(Color.YELLOW);
        this.AMARILLO.addActionListener(this);
        this.ROJO = new JButton("ROJO");
        this.ROJO.setBackground(Color.RED);
        this.ROJO.addActionListener(this);

        this.COLOR_PANEL = new JPanel();
        this.COLOR_PANEL.setPreferredSize(new Dimension(300,300));
        this.COLOR_PANEL.setBackground(Color.BLACK);

        FlowLayout DISTRIBUIDOR_FRAME = new FlowLayout();
        this.setLayout(DISTRIBUIDOR_FRAME);
        
        this.add(this.VERDE);
        this.add(this.AMARILLO);
        this.add(this.ROJO);
        this.add(this.COLOR_PANEL);
    }
    public void actionPerformed(ActionEvent EVENTO)
    {
        Object BOTON_SELECCIONADO = EVENTO.getSource();

        if(BOTON_SELECCIONADO == this.VERDE)
        {
            this.COLOR_PANEL.setBackground(Color.GREEN);
        }
        else if(BOTON_SELECCIONADO == this.AMARILLO)
        {
            this.COLOR_PANEL.setBackground(Color.YELLOW);
        }
        else if(BOTON_SELECCIONADO == this.ROJO)
        {
            this.COLOR_PANEL.setBackground(Color.RED);
        }
    }
 
    public static void main(String[] ARGUMENTOS)
    {
        EJERCICIO_06 MI_INTERFAZ = new EJERCICIO_06();
        MI_INTERFAZ.setResizable(false);
        MI_INTERFAZ.setVisible(true);
    }
}
