package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Pez pez = new Pez("Salmón", "dulce");
        pez.mostrarEspecie();

        System.out.println("--- Como Animal (polimorfismo) ---");
        Animal animal = new Pez("Atún", "salada");
        animal.mostrarEspecie();
    }
}