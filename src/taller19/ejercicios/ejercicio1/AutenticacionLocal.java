package taller19.ejercicios.ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion {
    @Override
    public boolean autenticar(String usuario, String clave) {
        System.out.println("Autenticando localmente a " + usuario);
        return clave.equals("1234");
    }
}