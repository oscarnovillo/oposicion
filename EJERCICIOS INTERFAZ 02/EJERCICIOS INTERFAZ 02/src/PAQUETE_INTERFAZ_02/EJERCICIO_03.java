/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE_INTERFAZ_02;

/**
 *
 * @author Administrador
 */
import javax.swing.*;
import java.awt.*;
public class EJERCICIO_03 extends JFrame
{
    public MI_PANEL PANEL_01, PANEL_02;
    public JScrollPane DESLIZADOR;

    public EJERCICIO_03()
    {
        super("CAJAS DE TEXTO CON DESLIZADOR... JAVADHC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String NOMBRE_CAJA_01, NOMBRE_CAJA_02;

        do
        {
            JOptionPane.showMessageDialog(null,"SE VOLVERA A PREGUNTAR SI LOS NOMBRES ESTAN EN BLANCO");
            NOMBRE_CAJA_01 = JOptionPane.showInputDialog(null,"INDIQUE EL NOMBRE DE LA CAJA DE TEXTO 01","NOMBRE DE CAJA",JOptionPane.INFORMATION_MESSAGE);
            NOMBRE_CAJA_02 = JOptionPane.showInputDialog(null,"INDIQUE EL NOMBRE DE LA CAJA DE TEXTO 02","NOMBRE DE CAJA",JOptionPane.INFORMATION_MESSAGE);
        }
        while(NOMBRE_CAJA_01.isEmpty() || NOMBRE_CAJA_02.isEmpty());

        FlowLayout DISTRIBUIDOR = new FlowLayout();
        this.setLayout(DISTRIBUIDOR);

        PANEL_01 = new MI_PANEL(NOMBRE_CAJA_01);
        PANEL_02 = new MI_PANEL(NOMBRE_CAJA_02);

        this.add(PANEL_01);
        this.add(PANEL_02);
    }
    public static void main(String[] ARGUMENTOS)
    {
        EJERCICIO_03 MI_INTERFAZ = new EJERCICIO_03();
        MI_INTERFAZ.pack();
        MI_INTERFAZ.setVisible(true);
    }
}

class MI_PANEL extends JPanel
{
    public JScrollPane DESLIZADOR;
    public JTextArea COMENTARIOS;
    public JTextField NOMBRE_CAJA;

    public MI_PANEL(String NOMBRE)
    {
        super();

        this.NOMBRE_CAJA = new JTextField();
        this.NOMBRE_CAJA.setText("CAJA " + NOMBRE);
        this.NOMBRE_CAJA.setEditable(false);
        this.add(this.NOMBRE_CAJA);

        this.COMENTARIOS = new JTextArea(10,20);
        this.COMENTARIOS.setText("ESCRIBA AQUI SUS COMENTARIOS DE SU CAJA " + NOMBRE);

        this.DESLIZADOR = new JScrollPane(this.COMENTARIOS);
        this.add(this.DESLIZADOR);
    }
}
