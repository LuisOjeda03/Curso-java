import java.util.Scanner;

public class DiaSemanaSwitchMejorado {
    public static void main(String[] args) {
        System.out.println("### Días de la semana con switch mejorado ###");

        var sc = new Scanner(System.in);

        System.out.print("Número del dia de la semana: ");
        var numeroDia = sc.nextInt();

        // Se puede asignar a una variable, sin embargo no es obligatorio
        var diaSemana = switch(numeroDia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia no existente";
        };

        System.out.println(diaSemana);
    }
}
