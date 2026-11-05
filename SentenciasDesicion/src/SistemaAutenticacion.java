import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("### Sistema de Autenticación ###");

        final var USUARIO_VALIDO = "luis0320";
        final var PASSWORD_VALIDA = "12345!!";

        var sc = new Scanner(System.in);

        System.out.print("Usuario: ");
        var usuario = sc.nextLine().strip();

        System.out.print("Password: ");
        var password = sc.nextLine().strip();

        if(usuario.equals(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDA)){
            System.out.println("Bienvenido al sistema!");
        } else if (!usuario.equals(USUARIO_VALIDO) && password.equals(PASSWORD_VALIDA)){
            System.out.println("Usuario inválido");
        } else if (usuario.equals(USUARIO_VALIDO) && !password.equals(PASSWORD_VALIDA)) {
            System.out.println("Password inválida");
        } else {
            System.out.println("Usuario y password inválidos");
        }

    }
}
