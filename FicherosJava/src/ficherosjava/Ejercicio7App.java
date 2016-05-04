/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosjava;

import javax.swing.JOptionPane;
import java.io.*;
 
public class Ejercicio7App {
 
    public static void main(String[] args) {
 
        File fichero=new File("vehiculosObj.ddr");
 
        String matricula=JOptionPane.showInputDialog("Introduce la matricula");
        String marca=JOptionPane.showInputDialog("Introduce la marca");
        String texto=JOptionPane.showInputDialog("Introduce el tamaño del deposito");
        double tamañoDeposito=Double.parseDouble(texto);
        String modelo=JOptionPane.showInputDialog("Introduce el modelo");
 
        /*
         * No creamos los objetos para manejar objetos,
         * ya que sino siempre existiria el fichero
         */
 
        try{
 
            Vehiculo vehiculo=new Vehiculo(matricula, marca, tamañoDeposito ,modelo);
 
            //Si el fichero existe, usamos nuestra clase de Object y sino usamos la original
            if(fichero.exists()){
                ObjectOutputStream moos=new ObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(vehiculo);
                moos.close();
            }else{
                ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(vehiculo);
                oos.close();
            }
 
            //Creamos despues este objeto para asegurarnos que no de un error, en caso de no existir el fichero
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fichero));
            muestraDatos(ois);
 
        }catch(ClassNotFoundException e){
 
        }catch(EOFException e){
            System.out.println("fin");
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
 
    public static void muestraDatos(ObjectInputStream ois) throws IOException, ClassNotFoundException {
 
        //Cuando se acabe el fichero saltara la excepcion EOFException
        while(true){
            Vehiculo ref=(Vehiculo)ois.readObject();
 
            JOptionPane.showMessageDialog(null, "El vehiculo tiene una matricula "+ref.getMatricula()+
            ", su marca es "+ref.getMarca()+" y su modelo es "+ref.getModelo());
        }
    }
 
}
