/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author SALA I
 */
public class Principal {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Dara", 22);
        Persona persona2 = new Persona("Sofia", 22);

        System.out.printf("%s\n", persona1.obtenerNombre());
        System.out.printf("%s\n", persona2.obtenerNombre());
        
        ArrayList<Persona> miLista = new ArrayList<>();
        miLista.add(persona1);
         miLista.add(persona2);
        double promedio = persona1.promedioEdades(miLista);
        System.out.printf("%.2f\n", promedio);
        
    }
}
