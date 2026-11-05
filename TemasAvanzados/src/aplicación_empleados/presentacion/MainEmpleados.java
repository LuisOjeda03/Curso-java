package aplicación_empleados.presentacion;

import aplicación_empleados.dominio.Empleado;
import aplicación_empleados.servicio.IServicioEmpleados;
import aplicación_empleados.servicio.ServicioEmpleadosArchivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEmpleados {

    private static Scanner sc = new Scanner(System.in);
    private static IServicioEmpleados servicioEmpleados = new ServicioEmpleadosArchivos();

    public static void main(String[] args) {
        sistemaEmpleados();
    }

    public static void sistemaEmpleados(){
        var salir = false;
        List<Empleado> empleados = new ArrayList<>();
        System.out.println("--- Sistema de Empleados ---");

        servicioEmpleados.listarEmpleados();

        while(!salir){
            try {
                var opcion = mostrarMenu();
                System.out.println("");
                salir = ejecutarOpcion(opcion, empleados);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    private static int mostrarMenu(){
        System.out.print("""
                \nMenú:
                1. Agregar empleado
                2. Listar empleados del sistema
                3. Listar empleados seleccionados
                4. Seleccionar empleado
                5. Salir
                Opción:\s""");
        return Integer.parseInt(sc.nextLine());
    }

    private static boolean ejecutarOpcion(int opcion, List<Empleado> empleados){
        var salir = false;
        switch (opcion) {
            case 1 -> agregarNuevoEmpleado();
            case 2 -> listarEmpleadosSistema();
            case 3 -> listarEmpleadosSeleccionados(empleados);
            case 4 -> seleccionarEmpleado(empleados);
            case 5 -> {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opción invalida.");
        }
        return salir;
    }

    private static void agregarNuevoEmpleado(){
        System.out.print("Nombre: ");
        var nombre = sc.nextLine();
        System.out.print("Apellido: ");
        var apellido = sc.nextLine();
        System.out.print("Puesto: ");
        var puesto = sc.nextLine();

        var empleado = new Empleado(nombre,apellido,puesto);
        servicioEmpleados.agregarEmpleado(empleado);
    }

    private static void listarEmpleadosSistema(){
        servicioEmpleados.listarEmpleados();
    }

    private static void listarEmpleadosSeleccionados(List<Empleado> empleados){
        var cadena = "";
        for (var empleado : empleados){
            cadena += "\t" + empleado + "\n";
        }
        System.out.println("-- Empleados Seleccionados --");
        System.out.println(cadena);
    }

    private static void seleccionarEmpleado(List<Empleado> empleados){
        listarEmpleadosSistema();
        System.out.print("ID del empleado: ");
        var id = Integer.parseInt(sc.nextLine());

        var empleado = servicioEmpleados.obtenerEmpleado(id);
        var empleadoAgregado = empleados.contains(empleado);

        if(empleado == null){
            System.out.println("Empleado no encontrado");
        } else if (empleadoAgregado) {
            System.out.println("El empleado ya ha sido seleccionado anteriormente");
        }
        else {
            empleados.add(empleado);
            System.out.println("Empleado agregado correctamente");
        }
    }
}
