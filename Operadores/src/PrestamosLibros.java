import java.util.Scanner;

public class PrestamosLibros {
    public static void main(String[] args) {
        System.out.println("### Sistema de Prestamos de Libros ###");

        var sc = new Scanner(System.in);
        final var DISTANCIA_PERMITIDA_KM = 3;

        System.out.print("¿Cuentas con credencial de estudiante (true / false)? ");
        var tieneCredencial = sc.nextBoolean();
        System.out.print("¿A cuantos kilometros (km) vives de la biblioteca? ");
        var kmRedonda = sc.nextDouble();

        var prestamoPermitido = tieneCredencial || kmRedonda < DISTANCIA_PERMITIDA_KM;
        System.out.println("¿Prestamo permitido? " + prestamoPermitido);
    }
}
