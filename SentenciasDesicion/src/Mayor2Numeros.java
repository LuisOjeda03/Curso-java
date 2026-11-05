import java.util.Scanner;

public class Mayor2Numeros {
    public static void main(String[] args) {
        System.out.println("### El mayor de 2 Números ###");

        var sc = new Scanner(System.in);

        System.out.print("Número 1: ");
        var numero1 = sc.nextDouble();

        System.out.print("Número 2: ");
        var numero2 = sc.nextDouble();

        if(numero1 > numero2) System.out.println("El mayor es el número " + numero1);
        else if(numero2 > numero1) System.out.println("El mayor es el número " + numero2);
        else System.out.println("Ambos números son iguales");
    }
}
