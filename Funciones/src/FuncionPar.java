import java.util.Scanner;

public class FuncionPar {

    // Funcion para saber si un numero es par
    static boolean esPar(int numero){
        if (numero % 2 == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("### Verificar si un número es par ###");
        System.out.print("Proporciona un número: ");
        var numero = sc.nextInt();
        System.out.println("¿El número " + numero + " es par? " + esPar(numero));
    }
}