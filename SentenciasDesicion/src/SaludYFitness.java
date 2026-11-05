import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("### Salud y Fitness ###");

        var sc = new Scanner(System.in);

        // Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04; // Valor aproximado (Kilocalorias)

        // Pedimos los valores al usuario
        System.out.print("Nombre: ");
        var nombreUsuario = sc.nextLine();

        System.out.print("Pasos caminados hoy: ");
        var pasosDiarios = sc.nextInt();

        // Verificar si el usuario alcanzó la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios >= META_PASOS_DIARIO) ? "Felicidades! Lo lograste." : "Lo siento! No alcanzaste el objetivo.";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        System.out.printf("""
                %nUsuario: %s
                Pasos dados el dia de hoy: %d
                Calorias quemadas: %.2f kcal
                Meta alcanzada: %s
                ------------------------------
                Meta de pasos diarios: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);
    }
}
