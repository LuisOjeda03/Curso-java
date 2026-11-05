import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        final var USUARIO = "luis@gmail.com";
        final var CONTRASENA = "123456!";

        // Usuario
        System.out.print("Ingrese su usuario: ");
        var usuarioIngresado = sc.nextLine();

        System.out.print("Ingrese su contraseña: ");
        var contrasenaIngresada = sc.nextLine();

        var credencialesCorrectas = (usuarioIngresado.equals(USUARIO)) && (contrasenaIngresada.equals(CONTRASENA));
        System.out.println("Credenciales correctas: " + credencialesCorrectas);
    }
}
