package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Ana", 30);
        Empleado e = new Empleado("Carlos", 28, "Ventas");

        p.mostrarDetalles();
        System.out.println("---");
        e.mostrarDetalles();
    }
}