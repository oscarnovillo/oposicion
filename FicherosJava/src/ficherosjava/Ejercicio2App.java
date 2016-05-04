/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosjava;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Ejercicio2App {
 
    public static void main(String[] args) {
 
        String ruta=JOptionPane.showInputDialog("Introduce la ruta del fichero");
        String texto=JOptionPane.showInputDialog("Introduce el texto que quieras escribir en el fichero");
        escribirFichero(ruta, texto);
        
        mostrarFicheroMay(ruta);
 
    }
 
    public static void escribirFichero(String nomFich, String texto){
        try(FileWriter fw=new FileWriter(nomFich);){
 
            //Escribimos el texto en el fichero
            fw.write(texto);
 
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
    }
 
    public static void mostrarFicheroMay(String nomFich){
        try(FileReader fr=new FileReader (nomFich)){
 
            int valor=fr.read();
 
            while(valor!=-1){
 
                //Solo cambiara el caracter si es una minuscula o una mayuscula
                char caracter=(char)valor;
                if(caracter>=97 && caracter<=122){
                    caracter-=32;
                }else if(caracter>=65 && caracter<=90){
                    caracter+=32;
                }
                caracter = Character.toUpperCase((char)valor);
                if (Character.isUpperCase((char)valor))
                    caracter = Character.toLowerCase((char)valor);
                    
                System.out.print(caracter);
                valor=fr.read();
            }
 
        }catch(IOException e){
            System.out.println("Problema con la E/S "+e);
        }
    }
 
}