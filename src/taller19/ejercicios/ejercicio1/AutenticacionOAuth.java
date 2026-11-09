package taller19.ejercicios.ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando con OAuth a " + usuario);
        return clave.startsWith("token-");
    }
}