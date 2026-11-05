import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("### Casa de los espejos ###");

        var sc = new Scanner(System.in);
        System.out.println("¿Cuál es tu edad? ");
        var edad = sc.nextInt();

        System.out.println("¿Te aterra la oscuridad (true / false)? ");
        var terrorOscuridad = sc.nextBoolean();

        // Verificacion
        if(edad >= 10 && !terrorOscuridad) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
    }
}
