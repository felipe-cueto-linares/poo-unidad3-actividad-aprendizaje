package taller19.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        GestorArchivos gestorLocal = new GestorArchivos(new AlmacenamientoLocal());
        gestorLocal.guardarArchivo("notas.txt", "Apuntes de POO");
        gestorLocal.mostrarArchivo("notas.txt");

        GestorArchivos gestorNube = new GestorArchivos(new AlmacenamientoNube());
        gestorNube.guardarArchivo("reporte.txt", "Informe semanal");
        gestorNube.mostrarArchivo("reporte.txt");
    }
}