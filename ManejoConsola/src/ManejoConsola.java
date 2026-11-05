import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        // Introducir valores por consola
        var scanner = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Escribe un numero: ");
        var numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Escribe tu nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
    }
}
