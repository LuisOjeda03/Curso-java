import java.util.Scanner;

public class EstacionAnioSwitchMejorado {
    public static void main(String[] args) {
        System.out.println("### Estación del año con switch mejorado ###");

        var sc = new Scanner(System.in);

        System.out.print("Número del mes: ");
        var numeroMes = sc.nextInt();

        // Se puede asignar a una variable, sin embargo no es obligatorio
        var estacion = switch(numeroMes){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Mes no existente";
        };

        System.out.println(estacion);
    }
}
