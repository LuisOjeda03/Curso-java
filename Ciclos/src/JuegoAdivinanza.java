import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var random = new Random();
        var numeroAleatorio = random.nextInt(100) + 1;
        var intentosAdivinanza = 0;
        var numeroIntento = 0;

        final var INTENTOS_PERMITIDOS = 10;

        System.out.println("### Juego de Adivinanzas ###");
        System.out.println("----------------------------");
        System.out.println("Adivina el número en el menor número de intentos posibles");
        System.out.println("Rango: 1 - 100");
        System.out.println("Intentos permitidos: " + INTENTOS_PERMITIDOS);
        System.out.println("");

        while (numeroIntento != numeroAleatorio && intentosAdivinanza < INTENTOS_PERMITIDOS){
            System.out.print("Introduce tu intento: ");
            numeroIntento = sc.nextInt();

            if (numeroIntento > numeroAleatorio) {
                System.out.println("Tu intento es mayor");
            } else if (numeroIntento < numeroAleatorio) {
                System.out.println("Tu intento es menor");
            }

            intentosAdivinanza++;
        }

        System.out.println("");
        if(numeroIntento == numeroAleatorio) {
            System.out.println("FELICIDADES!");
            System.out.println("Adivinaste el número " + numeroAleatorio);
        } else {
            System.out.println("Lastima!");
            System.out.println("El número era: " + numeroAleatorio);
        }
        System.out.println("Intentos: " + intentosAdivinanza);
    }
}