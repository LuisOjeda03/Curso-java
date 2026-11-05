import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        System.out.println("### Sistema Bancario ###");
        var sc = new Scanner(System.in);

        System.out.print("¿Salir del sistema (true / false)? ");
        var salirSistema = sc.nextBoolean();

        if(!salirSistema) {
            System.out.println("Se continúa la sesión");
        } else {
            System.out.println("Cerrando sesión...");
        }
    }
}
