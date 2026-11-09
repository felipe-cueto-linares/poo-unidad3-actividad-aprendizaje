package taller18.ejercicios.ejercicio2;

public class CuentaAhorros implements Transferencia, Retiro {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de " + monto + " desde cuenta de ahorros");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de " + monto + " desde cuenta de ahorros");
    }
}