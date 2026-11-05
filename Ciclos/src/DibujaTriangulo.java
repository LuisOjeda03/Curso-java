import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("### Dibuja un Triangulo ###");
        var sc = new Scanner(System.in);
        System.out.print("Número de filas: ");
        var filas = sc.nextInt();

        for (var i = 1; i <= filas; i++){
            var espaciosBlanco = " ".repeat(filas - i);
            var asteriscos = "*".repeat(2 * i - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
