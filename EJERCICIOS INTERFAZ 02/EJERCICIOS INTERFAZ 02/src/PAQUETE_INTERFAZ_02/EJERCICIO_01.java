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
public class EJERCICIO_01 extends JFrame
{
    public JMenu MENU_ARCHIVO,MENU_JAVA;
    public JMenuItem ITEM_ABRIR,ITEM_GUARDAR,ITEM_CERRAR,ITEM_JAVADHC;
    public JMenuBar MENU_BAR;

    public EJERCICIO_01()
    {
        super("MI MENU CON JFRAME...");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.ITEM_ABRIR = new JMenuItem("ABRIR");
        this.ITEM_GUARDAR = new JMenuItem("GUARDAR");
        this.ITEM_CERRAR = new JMenuItem("CERRAR");
        this.ITEM_JAVADHC = new JMenuItem("JAVADHC");

        this.MENU_ARCHIVO = new JMenu("ARCHIVO");
        this.MENU_ARCHIVO.add(this.ITEM_ABRIR);
        this.MENU_ARCHIVO.add(this.ITEM_GUARDAR);
        this.MENU_ARCHIVO.addSeparator();
        this.MENU_ARCHIVO.add(this.ITEM_CERRAR);

        this.MENU_JAVA = new JMenu("JAVA");
        this.MENU_JAVA.add(this.ITEM_JAVADHC);

        this.MENU_BAR = new JMenuBar();
        this.MENU_BAR.add(this.MENU_ARCHIVO);
        this.MENU_BAR.add(this.MENU_JAVA);

        this.setJMenuBar(this.MENU_BAR);
    }

    public static void main(String[] ARGS)
    {
        //-- HACEMOS QUE SE INICIALIZE NUESTRA VENTANA JFRAME

        EJERCICIO_01 MI_INTERFAZ = new EJERCICIO_01();

        //-- HACEMOS QUE NUESTRA VENTANA SE VISIBLE

        MI_INTERFAZ.setVisible(true);
    }
}
