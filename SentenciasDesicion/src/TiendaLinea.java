import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("### Tienda en Linea ###");

        var sc = new Scanner(System.in);

        System.out.print("Monto de la compra: $");
        var montoCompra = sc.nextDouble();
        System.out.print("¿Es miembro activo? (true / false) ");
        var esMiembro = sc.nextBoolean();

        double montoDescuento = 0.0;
        double montoFinal = 0.0;

        if(montoCompra > 1000 && esMiembro){
            montoDescuento = montoCompra * 0.10;
            montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 10%%
                    Monto de la compra:  $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: $%.2f
                    """, montoCompra, montoDescuento, montoFinal);
        } else if (esMiembro) {
            montoDescuento = montoCompra * 0.05;
            montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 5%%
                    Monto de la compra:  $%.2f
                    Monto del descuento: $%.2f
                    Monto final de la compra con descuento: %.2f
                    """, montoCompra, montoDescuento, montoFinal);
        } else {
            System.out.printf("""
                    \nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra: %.2f
                    """, montoCompra);
        }

    }
}
