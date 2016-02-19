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
public class EJERCICIO_04 extends JFrame implements ActionListener
{
    public JLabel LETRA_NUMERO_01,LETRA_NUMERO_02,LETRA_RESULTADO;
    public JTextField NUMERO_01,NUMERO_02,RESULTADO;
    public JButton SUMAR;

    public EJERCICIO_04()
    {
        super("SUMA DE NUMEROS... JAVADHC");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(210,160);

        this.LETRA_NUMERO_01 = new JLabel("NUMERO 01");
        this.LETRA_NUMERO_02 = new JLabel("NUMERO 02");
        this.LETRA_RESULTADO = new JLabel("RESULTADO");

        this.NUMERO_01 = new JTextField(10);
        this.NUMERO_02 = new JTextField(10);
        this.RESULTADO = new JTextField(10);
        this.RESULTADO.setEditable(false);

        this.SUMAR = new JButton("PULSE PARA SUMAR");
        this.SUMAR.addActionListener(this);

        FlowLayout DISTRIBUIDOR = new FlowLayout();
        this.setLayout(DISTRIBUIDOR);

        this.add(this.LETRA_NUMERO_01);
        this.add(this.NUMERO_01);
        this.add(this.LETRA_NUMERO_02);
        this.add(this.NUMERO_02);
        this.add(this.SUMAR);
        this.add(this.LETRA_RESULTADO);
        this.add(this.RESULTADO);
    }

    public void actionPerformed(ActionEvent EVENTO)
    {
        float AUX_NUMERO_01,AUX_NUMERO_02,AUX_RESULTADO;

        try
        {
            AUX_NUMERO_01 = Float.parseFloat(this.NUMERO_01.getText());
            AUX_NUMERO_02 = Float.parseFloat(this.NUMERO_02.getText());
            AUX_RESULTADO = AUX_NUMERO_01 + AUX_NUMERO_02;

            this.RESULTADO.setText(String.valueOf(AUX_RESULTADO));
        }
        catch(Exception E)
        {
            this.RESULTADO.setText("ERROR AL SUMAR");
        }
    }
    public static void main(String[] ARGUMENTOS)
    {
        EJERCICIO_04 MI_INTERFAZ = new EJERCICIO_04();
        MI_INTERFAZ.setResizable(false);
        MI_INTERFAZ.setVisible(true);
    }
}
