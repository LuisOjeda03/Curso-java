import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("### Sistema de Reserva de Hotel ###");

        var sc = new Scanner(System.in);

        final var PRECIO_CUARTO_DIA = 150.50;
        final var PRECIO_CUARTO_VISTA_MAR_DIA = 190.50;

        System.out.print("Nombre del cliente: ");
        var nombreCliente = sc.nextLine();
        System.out.print("Dias de estadía: ");
        var diasEstadia = sc.nextInt();
        System.out.print("¿Desea vista al mar (true / false)? ");
        var vistaMar = sc.nextBoolean();

        var costoTotal = 0.0;
        String mensaje;

        if(vistaMar){
            costoTotal = diasEstadia * PRECIO_CUARTO_VISTA_MAR_DIA;
            mensaje = "Si";
        } else {
            costoTotal = diasEstadia * PRECIO_CUARTO_DIA;
            mensaje = "No";
        }

        System.out.printf("""
                %n---------- Detalles de la Reservación ----------
                Cliente: %s
                Días de estadía: %d
                Costo total: %.2f
                Habitación con vista al mar: %s
                """, nombreCliente, diasEstadia, costoTotal, mensaje);
    }
}
