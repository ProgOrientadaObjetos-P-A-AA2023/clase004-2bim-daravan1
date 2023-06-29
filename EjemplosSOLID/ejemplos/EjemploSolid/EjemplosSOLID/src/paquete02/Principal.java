/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        Ciudad ciudad1 = new Ciudad("Loja");
        Ciudad ciudad2 = new Ciudad("Quito");
        Persona persona1 = new Persona("Dara", 22, ciudad1);
        Persona persona2 = new Persona("Sofia", 25, ciudad2);

        lista.add(persona1);
        lista.add(persona2);

        OperacionesEstudiantes op1 = new OperacionesEstudiantes();

        op1.establecerEstudiante(lista);
        op1.establecerPromedioEdades();
        op1.establecerListaCiudades();
        System.out.printf("Promedio de edades: %.2f\n"
                + "Edad minima: %d\n"
                + "Edad maxima: %d\n"
                + "Lista ciudades: %s\n",
                op1.obtenerPromedioEdades(),
                op1.obtenerEdadMinima(),
                op1.obtenerEdadMaxima(),
                op1.obtenerListaCiudades());

    }
}
