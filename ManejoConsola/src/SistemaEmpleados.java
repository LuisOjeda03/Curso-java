import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        // Entrada de datos
        var sc = new Scanner(System.in);

        System.out.println("### Sistema de Empleados ###");

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = sc.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(sc.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(sc.nextLine());

        // Es jefe de departamento
        System.out.print("¿Es jefe de departamento (true / false)? ");
        var esJefeDepartamento = Boolean.parseBoolean(sc.nextLine());

        // Impresion de valores introducidos
        System.out.println("\nDatos del empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado); // %n - separador de linea en printf
        System.out.println("\t¿Es jefe de departamento? " + esJefeDepartamento);
    }
}