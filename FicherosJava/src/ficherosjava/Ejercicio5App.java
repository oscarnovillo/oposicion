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

public class Ejercicio5App {

    public static void main(String[] args) {

        String ruta = JOptionPane.showInputDialog("Escribe la ruta del fichero");
        String numeros = JOptionPane.showInputDialog("Escribe el numero de numeros aleatorios");
        int numNumerosAleatorios = Integer.parseInt(numeros);
        DataOutputStream dos = null;
        //Abrimos el fichero desde el final
        try {
            dos = new DataOutputStream(new FileOutputStream(ruta, true));
            FileInputStream fi = new FileInputStream(ruta);
            DataInputStream dis = new DataInputStream(fi);
            escribeFichero(dos, numNumerosAleatorios);
            leeFichero(dis);

        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Ejercicio3App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void escribeFichero(DataOutputStream dos, int numNumerosAleatorios) throws IOException {

        //Escribimos los numeros
        for (int i = 0; i < numNumerosAleatorios; i++) {
            int numero = generaNumerosAleatorios();
            dos.writeInt(numero);
        }

        //Guardamos los cambios
        dos.flush();

    }

    public static void leeFichero(DataInputStream dis) throws IOException {

        //Leemos los numeros hasta el final del fichero
        //while (in.available()>0) {
        while (true) {
            System.out.println(dis.readInt());
        }
    }

    public static int generaNumerosAleatorios() {
        int numero = (int) Math.floor(Math.random() * 101);
        return numero;
    }

}
