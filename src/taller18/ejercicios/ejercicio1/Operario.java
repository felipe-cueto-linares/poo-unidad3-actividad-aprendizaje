package taller18.ejercicios.ejercicio1;

public class Operario implements Mantenimiento {
    @Override
    public void reparar() {
        System.out.println("El operario repara la tuberia");
    }

    @Override
    public void limpiar() {
        System.out.println("El operario limpia el taller");
    }
}