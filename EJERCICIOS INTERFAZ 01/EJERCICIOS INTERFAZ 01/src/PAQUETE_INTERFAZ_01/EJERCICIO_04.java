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

public class EJERCICIO_04  extends JFrame
{
    //-- DECLARAMOS VARIABLES SWING QUE UTILIZAREMOS

    public JButton BOTON_VERDE,BOTON_AMARILLO,BOTON_ROJO;

    public EJERCICIO_04() 
    {
        //-- CONFIGURAMOS LA VENTANA

        super("BOTONES CON COLORES");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //-- LE AGREGAMOS UN DISTRIBUIDOR DE COMPONENTES

        FlowLayout DISTRIBUCION = new FlowLayout();
        this.setLayout(DISTRIBUCION);

        //-- AGREGAMOS TODOS LOS COMPONENTES

        this.BOTON_VERDE = new JButton("VERDE");
        this.BOTON_VERDE.setBackground(Color.GREEN);
        this.add(this.BOTON_VERDE);
        
        this.BOTON_AMARILLO = new JButton("AMARILLO");
        this.BOTON_AMARILLO.setBackground(Color.YELLOW);
        this.add(this.BOTON_AMARILLO);
        
        BOTON_ROJO = new JButton("ROJO");
        BOTON_ROJO.setBackground(Color.RED);
        this.add(this.BOTON_ROJO);                 
    }
    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_04 MI_INTERFAZ = new EJERCICIO_04();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}
