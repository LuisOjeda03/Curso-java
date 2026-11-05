import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("### Generación de Tickets de Venta ###");
        var sc = new Scanner(System.in);

        final var PORCENTAJE_IMPUESTOS = 0.16;

        System.out.print("Precio leche: ");
        var precioLeche = sc.nextDouble();

        System.out.print("Precio pan: ");
        var precioPan = sc.nextDouble();

        System.out.print("Precio lechuga: ");
        var precioLechuga = sc.nextDouble();

        System.out.print("Precio platanos: ");
        var precioPlatanos = sc.nextDouble();

        System.out.print("¿Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = sc.nextInt();

        // Calculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar el descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        // Subtotal con descuento
        var subtotalDescuento = subtotal - descuento;

        // Cálculo con impuestos (16%)
        var impuesto = subtotalDescuento * PORCENTAJE_IMPUESTOS;

        var costoTotalCompra = subtotalDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                Subtotal: $%.2f
                Descuento: $%.2f (%d)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
