package taller18.ejercicios.ejercicio2;

public class CajeroAutomatico implements Retiro {
    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de " + monto + " en cajero automatico");
    }
}