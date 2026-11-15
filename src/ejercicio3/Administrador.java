package ejercicio3;

public class Administrador extends Usuario {

    public Administrador(String nombre, String contrasena) {
        super(nombre, contrasena);
    }

    public void mostrar() {
        // Válido: 'nombre' es protected
        System.out.println("Administrador: " + super.nombre);

        // Válido: se accede a la contraseña mediante un método público
        System.out.println("Contraseña correcta: " + validarContrasena("1234"));

        // --- Descomenta para ver el error de compilación ---
        // System.out.println(super.contrasena);
        // Error: 'contrasena' has private access in 'Usuario'
    }
}