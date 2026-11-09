package taller18.ejercicios.ejercicio3;

public class Camion implements Vehiculo {
    @Override
    public void conducir() {
        System.out.println("El camion se conduce por la autopista");
    }

    @Override
    public void cargarMercancia(double kilos) {
        System.out.println("El camion carga " + kilos + " kg de mercancia");
    }
}