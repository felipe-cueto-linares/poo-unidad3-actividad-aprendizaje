package taller19.ejercicios.ejercicio2;

public interface Almacenamiento {
    void guardar(String nombre, String contenido);

    String recuperar(String nombre);
}