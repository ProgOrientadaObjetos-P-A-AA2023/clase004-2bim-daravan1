/*
S — Single responsibility principle 
    Principio de responsabilidad única
 */
package paquete02;


import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private int edad;
    private Ciudad cuidad;
    
    public Persona(String n, int e, Ciudad c){
        nombre = n;
        edad = e;
        cuidad = c;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    public void establecerCiudad(Ciudad n){
        cuidad = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerEdad(){
        return edad;
    }
    public Ciudad obtenerCiudad(){
        return cuidad;
    }
    
}
