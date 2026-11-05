import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var opcion = 0;
        do {
            System.out.print("""
                    ### Sistema de Administración de Cuentas ###
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción:\s""");
            opcion = sc.nextInt();

            switch (opcion){
                case 1 -> System.out.println("Creando tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> System.out.println("Hasta pronto.\n");
                default -> System.out.println("Opción inválida\n");
            }
        }while (opcion != 3);
    }
}
