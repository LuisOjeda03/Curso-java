import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("### Dias de la semana ###");
        var sc = new Scanner(System.in);

        System.out.print("Número de la semana: ");
        var diaIntroducido = sc.nextInt();

        var diaSemana = "";
        switch(diaIntroducido){
            case 1:
                diaSemana = "lunes";
                break;
            case 2:
                diaSemana = "martes";
                break;
            case 3:
                diaSemana = "miercoles";
                break;
            case 4:
                diaSemana = "jueves";
                break;
            case 5:
                diaSemana = "viernes";
                break;
            case 6:
                diaSemana = "sabado";
                break;
            case 7:
                diaSemana = "domingo";
                break;
            default:
                diaSemana = "Dia no valido";
        }
        System.out.println("El día de hoy es " + diaSemana);
    }
}