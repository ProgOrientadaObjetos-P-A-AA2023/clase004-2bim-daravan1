/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Ciudad {

    private String ciudad;

    public Ciudad(String c) {
        ciudad = c;
    }

    public void establecerNombre(String n) {
        ciudad = n;
    }

    public String obtenerNombre() {
        return ciudad;
    }
}
