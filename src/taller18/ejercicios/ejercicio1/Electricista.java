package taller18.ejercicios.ejercicio1;

public class Electricista implements Reparacion {
    @Override
    public void reparar() {
        System.out.println("El electricista repara el cableado");
    }
}