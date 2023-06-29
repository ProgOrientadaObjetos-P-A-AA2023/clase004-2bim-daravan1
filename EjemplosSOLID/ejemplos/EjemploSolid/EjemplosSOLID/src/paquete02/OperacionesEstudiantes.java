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
public class OperacionesEstudiantes {

    private ArrayList<Persona> estudiantes;
    private double promedioEdades;
    private int edadminima;
    private int edadmaxima;
    private String listaCiudadesEstudiantes = "";

    public void establecerEstudiante(ArrayList<Persona> lista) {
        estudiantes = lista;
    }

    public ArrayList<Persona> obtenerEstudiante() {
        return estudiantes;
    }

    public void establecerListaCiudades() {
        for (int i = 0; i < estudiantes.size(); i++) {
            listaCiudadesEstudiantes = String.format("%s Ciudad %d: %s, ",
                    listaCiudadesEstudiantes, i + 1, estudiantes.get(i).obtenerCiudad().obtenerNombre());
        }
    }

    public String obtenerListaCiudades() {
        return listaCiudadesEstudiantes;
    }

    public void establecerPromedioEdades() {
        double suma = 0;
        for (Persona e : obtenerEstudiante()) {
            suma = suma + e.obtenerEdad();
        }
        promedioEdades = suma / obtenerEstudiante().size();
    }

    public int obtenerEdadMinima() {
        edadminima = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            if (edadminima > estudiantes.get(i).obtenerEdad()) {
                edadminima = estudiantes.get(i).obtenerEdad();

            }
        }
        return edadminima;
    }

    public int obtenerEdadMaxima() {
        edadmaxima = estudiantes.get(0).obtenerEdad();
        for (int i = 0; i < obtenerEstudiante().size(); i++) {
            if (edadmaxima < estudiantes.get(i).obtenerEdad()) {
                edadmaxima = estudiantes.get(i).obtenerEdad();

            }
        }
        return edadmaxima;
    }

    public double obtenerPromedioEdades() {

        return promedioEdades;
    }

}
