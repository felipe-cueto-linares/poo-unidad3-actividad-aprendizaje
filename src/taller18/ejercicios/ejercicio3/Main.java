package taller18.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        Conduccion automovil = new Automovil();
        TransporteMercancias dron = new DronDeEntrega();
        Vehiculo camion = new Camion();

        automovil.conducir();
        dron.cargarMercancia(2);
        camion.conducir();
        camion.cargarMercancia(5000);
    }
}