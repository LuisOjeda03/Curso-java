import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        var entero = sc.nextInt();

        // Revisamos si está dentro del rango (entre 1 y 10)
        var estaDentroRango = entero >= 1 && entero <= 10;
        System.out.println("¿Se encuentra entre 1 - 10? " + estaDentroRango);

        // Revisar la logica inversa, si el dato está fuera de rango
        var estaFueraRango = !(entero >= 1 && entero <= 10); // Se invierte la condicion
        System.out.println("¿Esta fuera de rango entre 1 - 10? " +estaFueraRango);
    }
}
