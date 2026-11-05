import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("### Sistema de Envios ###");

        var sc = new Scanner(System.in);

        final var COSTO_NACIONAL = 10;
        final var COSTO_INTERNACIONAL = 20;

        System.out.print("Destino del paquete (nacional / internacional): ");
        var destinoPaquete = sc.nextLine().strip().toLowerCase();

        System.out.print("Peso (Kilogramos): ");
        var pesoPaquete = sc.nextDouble();

       Double costoEnvio = switch (destinoPaquete) {
           case "nacional" -> pesoPaquete * COSTO_NACIONAL;
           case "internacional" -> pesoPaquete * COSTO_INTERNACIONAL;
           default -> {
               System.out.println("Destino inválido.");
                yield null;
           }
       };
        if (costoEnvio != null) {
            System.out.printf("El costo del envío del paquete es de: $%.2f", costoEnvio);
        }
    }
}
