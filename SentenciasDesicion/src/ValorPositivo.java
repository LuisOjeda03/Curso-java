import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("### Valor Positivo ###");
        var sc = new Scanner(System.in);

        System.out.print("Proporciona un numero entero: ");
        var numero = sc.nextInt();

        if(numero > 0){
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }
    }
}
