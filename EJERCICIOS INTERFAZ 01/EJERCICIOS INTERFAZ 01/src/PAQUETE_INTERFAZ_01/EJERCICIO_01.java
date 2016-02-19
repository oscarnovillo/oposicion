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

public class EJERCICIO_01 extends JFrame
{
    //-- LE AGREGAMOS TODO A LA VENTANA MEDIANTE EL CONSTRUCTOR

    public EJERCICIO_01()
    {
        //-- CONFIGURAMOS LA VENTANA

        super("MI INTERFAZ CON JFRAME..."); //-- LE PONEMOS UN TITULO
        this.setSize(600,400); //-- LE DAMOS UN TAMAÑO A LA VENTANA
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //-- HACEMOS QUE LA VENTANA SE CIERRE POR DEFAULT
    }

    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_01 MI_INTERFAZ = new EJERCICIO_01();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}
