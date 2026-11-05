import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {

        var opcion = 0;
        var sc = new Scanner(System.in);
        double saldoActual = 1000, montoRetiro, montoDeposito;
        do {
            System.out.print("""
                    ### Sistema de Cajero Automático ###
                    Operaciones disponibles:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Opción:\s""");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> System.out.printf("Tu Saldo actual es de: %.2f%n%n", saldoActual);
                case 2 -> {
                    System.out.print("Monto a retirar: ");
                    montoRetiro = sc.nextDouble();

                    // Comprobación de saldo
                    if(saldoActual >= montoRetiro){
                        System.out.println("Retirando...");
                        saldoActual -= montoRetiro;
                        System.out.printf("Saldo restante: %.2f%n%n", saldoActual);
                    } else {
                        System.out.println("Saldo insuficiente para el retiro%n%n");
                    }
                }
                case 3 -> {
                    System.out.print("Monto a depositar: ");
                    montoDeposito = sc.nextDouble();
                    if(montoDeposito > 0){
                        System.out.println("Depositando...");
                        saldoActual += montoDeposito;
                        System.out.printf("Tu nuevo saldo es de: %.2f%n%n", saldoActual);
                    } else {
                        System.out.println("Cantidad inválida%n%n");
                    }
                }
                case 4 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Operación invalida%n");
            }
        } while(opcion != 4);
    }
}
