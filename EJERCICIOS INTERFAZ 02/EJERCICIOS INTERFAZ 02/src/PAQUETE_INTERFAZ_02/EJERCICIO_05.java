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
import java.awt.event.*;

public class EJERCICIO_05 extends JFrame implements ActionListener
{
    JRadioButton SUMAR,RESTAR,MULTIPLICAR,DIVIDIR;
    ButtonGroup OPERACIONES;
    JButton EJECUTAR_OPERACION;
    JLabel LETRA_NUMERO_01,LETRA_NUMERO_02,LETRA_RESULTADO;
    JTextField NUMERO_01,NUMERO_02,RESULTADO;

    public EJERCICIO_05()
    {
        super("SUMA CON 4 OPERACIONES");
        this.setSize(210,210);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.LETRA_NUMERO_01 = new JLabel("NUMERO 01");
        this.LETRA_NUMERO_02 = new JLabel("NUMERO 02");
        this.LETRA_RESULTADO = new JLabel("RESULTADO");

        this.NUMERO_01 = new JTextField(10);
        this.NUMERO_02 = new JTextField(10);
        this.RESULTADO = new JTextField(10);

        this.EJECUTAR_OPERACION = new JButton("EJECUTAR OPERACION");
        this.EJECUTAR_OPERACION.addActionListener(this);

        this.SUMAR = new JRadioButton("SUMAR",true);
        this.RESTAR = new JRadioButton("RESTAR",false);
        this.MULTIPLICAR = new JRadioButton("MULTIPLICAR",false);
        this.DIVIDIR = new JRadioButton("DIVIDIR",false);

        this.OPERACIONES = new ButtonGroup();
        this.OPERACIONES.add(this.SUMAR);
        this.OPERACIONES.add(this.RESTAR);
        this.OPERACIONES.add(this.MULTIPLICAR);
        this.OPERACIONES.add(this.DIVIDIR);

        FlowLayout DISTRIBUIDOR = new FlowLayout();
        this.setLayout(DISTRIBUIDOR);

        this.add(this.LETRA_NUMERO_01);
        this.add(this.NUMERO_01);
        this.add(this.LETRA_NUMERO_02);
        this.add(this.NUMERO_02);

        this.add(this.SUMAR);
        this.add(this.RESTAR);
        this.add(this.MULTIPLICAR);
        this.add(this.DIVIDIR);

        this.add(this.EJECUTAR_OPERACION);

        this.add(this.LETRA_RESULTADO);
        this.add(this.RESULTADO);        
    }
    public void actionPerformed(ActionEvent EVENTO)
    {
        float AUX_NUMERO_01,AUX_NUMERO_02,AUX_RESULTADO;

        try
        {
            AUX_RESULTADO = 0;
            AUX_NUMERO_01 = Float.parseFloat(this.NUMERO_01.getText());
            AUX_NUMERO_02 = Float.parseFloat(this.NUMERO_02.getText());

            if(this.SUMAR.isSelected())
            {
                AUX_RESULTADO = AUX_NUMERO_01 + AUX_NUMERO_02;
            }
            else if(this.RESTAR.isSelected())
            {
                AUX_RESULTADO = AUX_NUMERO_01 - AUX_NUMERO_02;
            }
            else if(this.MULTIPLICAR.isSelected())
            {
                AUX_RESULTADO = AUX_NUMERO_01 * AUX_NUMERO_02;
            }
            else if(this.DIVIDIR.isSelected())
            {
                AUX_RESULTADO = AUX_NUMERO_01 / AUX_NUMERO_02;
            }

            this.RESULTADO.setText(String.valueOf(AUX_RESULTADO));
        }
        catch(Exception E)
        {
            this.RESULTADO.setText("ERROR AL EJECUTAR");
        }
    }
    public static void main(String[] ARGUMENTOS)
    {
        EJERCICIO_05 MI_INTERFAZ = new EJERCICIO_05();
        MI_INTERFAZ.setResizable(false);
        MI_INTERFAZ.setVisible(true);
    }
}

