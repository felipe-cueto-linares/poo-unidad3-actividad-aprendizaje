package taller18.ejercicios.ejercicio2;

public class CuentaCorriente implements OperacionBancaria {
    @Override
    public void transferir(double monto) {
        System.out.println("Transferencia de " + monto + " desde cuenta corriente");
    }

    @Override
    public void retirar(double monto) {
        System.out.println("Retiro de " + monto + " desde cuenta corriente");
    }

    @Override
    public void pagarFactura(double monto) {
        System.out.println("Pago de factura por " + monto + " desde cuenta corriente");
    }
}