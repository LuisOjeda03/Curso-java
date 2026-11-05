import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>(); // TreeSet mantiene el orden de agregación
        conjunto.add("Carlos");
        conjunto.add("Carlos"); // No provocará error. Sin embargo no se duplica
        conjunto.add("Karla");
        conjunto.add("Victoria");

        System.out.println("Elementos del Set (TreeSet): ");
        conjunto.forEach(System.out::println); // :: -> Método de referencia

        // Remover elemento
        conjunto.remove("Karla");
        System.out.println("\nNuevos elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}
