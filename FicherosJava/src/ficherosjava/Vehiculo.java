/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficherosjava;

import java.io.Serializable;
 
/**
 * Clase Vehiculo
 *
 * Contiene informacion de un vehiculo
 *
 * @author DiscoDuroderoer
 * @version 1.0
 */
public class Vehiculo implements Serializable{
 
    //Atributos
 
    /**
     * Matricula del vehiculo
     */
    private String matricula;
 
    /**
     * Marca del vehiculo
     */
    private String marca;
 
    /**
     * Tamaño del deposito del vehiculo
     * No se transfiere en la serializacion
     */
    transient private double tamañoDeposito;
 
    /**
     * Modelo del vehiculo
     */
    private String modelo;
 
    //Métodos
 
    /**
     * Devuelve la matricula
     * @return matricula del vehiculo
     */
    public String getMatricula() {
        return matricula;
    }
 
    /**
     * Devuelve la marca
     * @return marca del vehiculo
     */
    public String getMarca() {
        return marca;
    }
 
    /**
     * Devuelve el tamaño del deposito
     * @return tamalos del deposito del vehiculo
     */
    public double getTamañoDeposito() {
        return tamañoDeposito;
    }
 
    /**
     * Devuelve el modelo
     * @return modelo del vehiculo
     */
    public String getModelo() {
        return modelo;
    }
 
    //Constructor
    /**
     * Constructor con 4 parametros
     * @param matricula
     * @param marca
     * @param tamañoDeposito
     * @param modelo
     */
    public Vehiculo (String matricula, String marca, double tamañoDeposito, String modelo){
        this.matricula=matricula;
        this.tamañoDeposito=tamañoDeposito;
        this.marca=marca;
        this.modelo=modelo;
    }
 
}
