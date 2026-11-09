package taller19.ejercicios.ejercicio3;

public class Main {
    public static void main(String[] args) {
        GestorReportes gestorPdf = new GestorReportes(new ReportePDF());
        gestorPdf.crearReporte("Ventas del mes");

        GestorReportes gestorExcel = new GestorReportes(new ReporteExcel());
        gestorExcel.crearReporte("Inventario");
    }
}