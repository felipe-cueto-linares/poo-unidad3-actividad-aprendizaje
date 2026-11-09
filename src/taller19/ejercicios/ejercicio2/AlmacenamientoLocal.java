package taller19.ejercicios.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento {
    private Map<String, String> archivos = new HashMap<>();

    @Override
    public void guardar(String nombre, String contenido) {
        System.out.println("Guardando " + nombre + " en el disco local");
        archivos.put(nombre, contenido);
    }

    @Override
    public String recuperar(String nombre) {
        return archivos.get(nombre);
    }
}