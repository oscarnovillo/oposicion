/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosjava;

import javax.swing.JOptionPane;
import java.io.*;
 
public class Ejercicio6App {
 
    public static void main(String[] args) {
 
        final String RUTA="vehiculos.ddr";
 
        String matricula=JOptionPane.showInputDialog("Introduce la matricula");
        String marca=JOptionPane.showInputDialog("Introduce la marca");
        String texto=JOptionPane.showInputDialog("Introduce el tamaño del deposito");
        double tamañoDeposito=Double.parseDouble(texto);
        String modelo=JOptionPane.showInputDialog("Introduce el modelo");
 
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(RUTA,true));
                DataInputStream dis=new DataInputStream(new FileInputStream(RUTA))){
 
            introduceDatos(dos, matricula, marca, tamañoDeposito, modelo);
 
            muestraDatos(dis);
        }catch(EOFException e){
 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
 
    }
 
    public static void introduceDatos(DataOutputStream dos,
                                        String matricula,
                                        String marca,
                                        double tamañoDeposito,
                                        String modelo) throws IOException{
 
        dos.writeUTF(matricula);
        dos.writeUTF(marca);
        dos.writeDouble(tamañoDeposito);
        dos.writeUTF(modelo);
 
    }
 
    public static void muestraDatos(DataInputStream dis) throws IOException {
 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, "El vehiculo tiene una matricula "+dis.readUTF()+
            ", su marca es "+dis.readUTF()+", el tamaño del deposito es de "+dis.readDouble()+" " +
            "litros y su modelo es "+dis.readUTF());
        }
    }
 
}
