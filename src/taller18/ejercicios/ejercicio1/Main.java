package taller18.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Reparacion electricista = new Electricista();
        Limpieza conserje = new Conserje();
        Mantenimiento operario = new Operario();

        electricista.reparar();
        conserje.limpiar();
        operario.reparar();
        operario.limpiar();
    }
}