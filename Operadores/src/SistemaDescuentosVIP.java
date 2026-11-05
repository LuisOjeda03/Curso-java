import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("### Sistema Descuentos VIP ###");
        var sc = new Scanner(System.in);

        System.out.print("Articulos comprados el dia de hoy: ");
        var articulosComprados = sc.nextInt();
        System.out.print("¿Cuenta con membresia VIP? (true / false): ");
        var tieneMembresia = sc.nextBoolean();
        var tieneDescuento = (articulosComprados >= 10) && tieneMembresia;
        System.out.println("¿El cliente es apto para descuento? " + tieneDescuento);
    }
}
