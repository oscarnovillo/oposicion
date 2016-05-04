/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosjava;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Ejercicio4App {

    public static void main(String[] args) {

        //Pedimos las rutas
        String origen = JOptionPane.showInputDialog("Escribe la ruta del origen");
        String destino = JOptionPane.showInputDialog("Escribe la ruta del destino");

        copiaFicheros(origen, destino);

    }

    public static void copiaFicheros(String origen, String destino) {

        FileOutputStream fos = null;
        try {
            FileInputStream fis = new FileInputStream(origen);
            fos = new FileOutputStream(destino);
            //Creamos un array de bytes con el tamaño del fichero de origen
            byte byteA[] = new byte[fis.available()];

            //Copia todos los bytes del fichero al array
            fis.read(byteA);

            //Escribe todos los bytes en el fichero de destino
            fos.write(byteA);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio3App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
