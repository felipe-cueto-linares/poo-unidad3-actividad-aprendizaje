package taller19.ejercicios.ejercicio2;

public class GestorArchivos {
    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo(String nombre, String contenido) {
        almacenamiento.guardar(nombre, contenido);
    }

    public void mostrarArchivo(String nombre) {
        System.out.println("Contenido de " + nombre + ": " + almacenamiento.recuperar(nombre));
    }
}