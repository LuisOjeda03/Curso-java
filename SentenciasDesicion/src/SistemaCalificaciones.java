import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("### Sistema de calificaciones ###");

        var sc = new Scanner(System.in);

        System.out.print("Ingrese la calificación: ");
        var calificacionNumerica = sc.nextDouble();

        var calificacionLetra = "";
        if (calificacionNumerica >= 9 && calificacionNumerica <= 10) calificacionLetra = "A";
        else if (calificacionNumerica >= 8 && calificacionNumerica < 9 ) calificacionLetra = "B";
        else if (calificacionNumerica >= 7 && calificacionNumerica < 8) calificacionLetra = "C";
        else if (calificacionNumerica >= 6 && calificacionNumerica < 7) calificacionLetra = "D";
        else if (calificacionNumerica >= 0 && calificacionNumerica < 6) calificacionLetra = "F";
        else calificacionLetra = "Valor Desconocido";

        System.out.printf("Calificación %.1f es equivalente a %s", calificacionNumerica, calificacionLetra);
    }
}
