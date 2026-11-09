package taller19.ejercicios.ejercicio3;

public class ReporteExcel implements GeneradorReporte {
    @Override
    public void generar(String titulo) {
        System.out.println("Generando el reporte " + titulo + " en formato Excel");
    }
}