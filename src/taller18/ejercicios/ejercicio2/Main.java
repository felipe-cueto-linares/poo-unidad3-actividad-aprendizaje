package taller18.ejercicios.ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaAhorros ahorros = new CuentaAhorros();
        Retiro cajero = new CajeroAutomatico();
        OperacionBancaria corriente = new CuentaCorriente();

        ahorros.transferir(50000);
        ahorros.retirar(20000);
        cajero.retirar(100000);
        corriente.transferir(200000);
        corriente.pagarFactura(80000);
    }
}