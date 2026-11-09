package taller19.ejercicios.ejercicio1;

public class Main {
    public static void main(String[] args) {
        GestorAutenticacion gestorLocal = new GestorAutenticacion(new AutenticacionLocal());
        gestorLocal.iniciarSesion("felipe", "1234");
        gestorLocal.iniciarSesion("felipe", "0000");

        GestorAutenticacion gestorOAuth = new GestorAutenticacion(new AutenticacionOAuth());
        gestorOAuth.iniciarSesion("felipe", "token-abc");
    }
}