package taller19.ejercicios.ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicio;

    public GestorAutenticacion(ServicioAutenticacion servicio) {
        this.servicio = servicio;
    }

    public void iniciarSesion(String usuario, String clave) {
        if (servicio.autenticar(usuario, clave)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}