package taller19.ejercicios.ejercicio3;

public class GestorReportes {
    private GeneradorReporte generador;

    public GestorReportes(GeneradorReporte generador) {
        this.generador = generador;
    }

    public void crearReporte(String titulo) {
        generador.generar(titulo);
    }
}