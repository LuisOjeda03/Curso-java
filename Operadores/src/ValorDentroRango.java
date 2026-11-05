import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("### Valor Dentro Rango ###");

        var sc = new Scanner(System.in);

        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;
        // Solicitar un valor entre 0 y 5
        System.out.print("Proporciona un valor entre 0 y 5: ");
        var numero = sc.nextInt();
        // Verificar si el numero esta dentro del rango
        var estaDentroRango = numero >= MINIMO && numero <= MAXIMO;
        System.out.printf("¿El número %d está entre %d y %d? %b", numero, MINIMO, MAXIMO, estaDentroRango);
    }
}