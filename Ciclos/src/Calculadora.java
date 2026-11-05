import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        var operacion = 0;
        double valor1 = 0, valor2 = 0, resultado = 0;
        var sc = new Scanner(System.in);
        do {
            System.out.printf("""
                    ### Calculadora en Java ###
                    Operaciones disponibles:
                    1. Suma
                    2. Resta 
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opción:\s""");
            operacion = sc.nextInt();

            if(operacion>= 1 && operacion<=4) {
                System.out.print("\nValor 1: ");
                valor1 = sc.nextDouble();
                System.out.print("Valor 2: ");
                valor2 = sc.nextDouble();
            }

            switch (operacion) {
                case 1 -> {
                    resultado = valor1 + valor2;
                    System.out.printf("Resultado suma: %.2f%n%n", resultado);
                }
                case 2 -> {
                    resultado = valor1 - valor2;
                    System.out.printf("Resultado resta: %.2f%n%n", resultado);
                }
                case 3 -> {
                    resultado = valor1 * valor2;
                    System.out.printf("Resultado multiplicación: %.2f%n%n", resultado);
                }
                case 4 -> {
                    if(valor2 != 0) {
                        resultado = valor1 / valor2;
                        System.out.printf("Valor división: ", resultado);
                    } else {
                        System.out.printf("No es posible dividir entre 0%n%n");
                    }
                }
                case 5 -> System.out.println("Hasta luego!");
                default -> System.out.printf("Operacion invalida%n%n");
            }
        } while (operacion != 5);
    }
}
