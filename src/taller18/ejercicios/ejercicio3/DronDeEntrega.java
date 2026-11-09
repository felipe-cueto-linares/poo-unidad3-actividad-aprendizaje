package taller18.ejercicios.ejercicio3;

public class DronDeEntrega implements TransporteMercancias {
    @Override
    public void cargarMercancia(double kilos) {
        System.out.println("El dron de entrega transporta " + kilos + " kg de mercancia");
    }
}