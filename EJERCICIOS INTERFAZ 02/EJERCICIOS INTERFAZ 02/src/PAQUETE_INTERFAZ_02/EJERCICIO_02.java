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
public class EJERCICIO_02 extends JFrame
{
    public JButton BTN_MUSICA,BTN_VIDEO,BTN_INTERNET,BTN_JAVADHC,BTN_INFO;
    public JToolBar CAJA_HERRAMIENTA_01,CAJA_HERRAMIENTA_02;
    public ImageIcon IMG_MUSICA,IMG_VIDEO,IMG_INTERNET,IMG_JAVADHC,IMG_INFO;

    public EJERCICIO_02() 
    {
        super("MI MENU CON JFRAME...");
        this.setSize(600,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.IMG_VIDEO = new ImageIcon("IMAGENES/VIDEO.PNG");
        this.IMG_MUSICA = new ImageIcon("IMAGENES/MUSICA.PNG");
        this.IMG_INTERNET = new ImageIcon("IMAGENES/INTERNET.PNG");
        this.IMG_JAVADHC = new ImageIcon("IMAGENES/JAVADHC.PNG");
        this.IMG_INFO = new ImageIcon("IMAGENES/INFO.PNG");

        this.BTN_VIDEO = new JButton("VIDEO",this.IMG_VIDEO);
        this.BTN_MUSICA = new JButton("MUSICA",this.IMG_MUSICA);
        this.BTN_INTERNET = new JButton("INTERNET",this.IMG_INTERNET);
        this.BTN_JAVADHC = new JButton("JAVADHC",this.IMG_JAVADHC);
        this.BTN_INFO = new JButton("http://javadhc.blogspot.com/",this.IMG_INFO);

        this.CAJA_HERRAMIENTA_01 = new JToolBar();
        this.CAJA_HERRAMIENTA_01.add(this.BTN_VIDEO);
        this.CAJA_HERRAMIENTA_01.add(this.BTN_MUSICA);
        this.CAJA_HERRAMIENTA_01.add(this.BTN_INTERNET);

        this.CAJA_HERRAMIENTA_02 = new JToolBar();
        this.CAJA_HERRAMIENTA_02.add(this.BTN_JAVADHC);
        this.CAJA_HERRAMIENTA_02.add(this.BTN_INFO);

        BorderLayout DISTRIBUIDOR = new BorderLayout();
        this.setLayout(DISTRIBUIDOR);

        this.add(this.CAJA_HERRAMIENTA_01,BorderLayout.NORTH);
        this.add(this.CAJA_HERRAMIENTA_02,BorderLayout.SOUTH);
    }
    public static void main(String[] ARGUMENTOS)
    {
        EJERCICIO_02 MI_INTERFAZ = new EJERCICIO_02();
        MI_INTERFAZ.setVisible(true);
    }
}
