import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("### Estación del Año ###");

        var sc = new Scanner(System.in);

        System.out.print("Número del mes: ");
        var numeroMes = sc.nextInt();

        var estacion = "";
        if((numeroMes>=1 && numeroMes<=2) || numeroMes == 12) estacion = "Invierno";
        else if(numeroMes>=3 && numeroMes<=5) estacion = "Primavera";
        else if (numeroMes>=6 && numeroMes<=8) estacion = "Verano";
        else if (numeroMes>=9 && numeroMes<=11) estacion = "Otoño";
        else estacion = "Estación desconocida";

        System.out.println(estacion);
    }
}
