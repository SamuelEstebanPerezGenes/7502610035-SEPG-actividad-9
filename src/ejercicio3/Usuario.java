package ejercicio3;

public class Usuario {
    private String contrasena;   // privado
    protected String nombre;     // protegido

    public Usuario(String nombre, String contrasena) {
        this.nombre = nombre;
        this.contrasena = contrasena;
    }

    public boolean validarContrasena(String intento) {
        return contrasena.equals(intento);
    }
}