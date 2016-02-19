/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE_INTERFAZ_01;

/**
 *
 *  DUDAS SOBRE ESTE CODIGO, shamirdhc31@gmail.com
 */

//-- IMPORTAMOS LIBRERIAS QUE UTILIZAREMOS

import javax.swing.*;
import java.awt.*;

public class EJERCICIO_02 extends JFrame
{
    //-- DECLARAMOS LA VARIABLE BIENVENIDA

    public JLabel BIENVENIDA;

    //-- LE AGREGAMOS TODO A LA VENTANA MEDIANTE EL CONSTRUCTOR

    public EJERCICIO_02()
    {
        //-- CONFIGURAMOS LA VENTANA

        super("MI INTERFAZ CON JFRMAE..."); //-- LE PONEMOS UN TITULO
        this.setSize(600,400); //-- LE DAMOS UN TAMAÑO A LA VENTANA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-- HACEMOS QUE LA VENTANA SE CIERRE POR DEFAULT

        //-- LE AGREGAMOS UN DISTRIBUIDOR DE COMPONENTES

        FlowLayout DISTRIBUCION = new FlowLayout();
        this.setLayout(DISTRIBUCION);

        //-- AGREGAMOS TEXTO A NUESTRA VENTANA

        this.BIENVENIDA = new JLabel("ESTO ES UN EJEMPLO DE TEXTO CON JLABEL");
        this.add(this.BIENVENIDA);
    }

    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_02 MI_INTERFAZ = new EJERCICIO_02();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}
