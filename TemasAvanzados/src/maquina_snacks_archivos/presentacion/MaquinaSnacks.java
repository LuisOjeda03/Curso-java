package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {

    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var sc = new Scanner(System.in);
        // Creamos el objeto para tener el servicio de snacks
        // IServicioSnacks servicioSnacks = new ServicioSnacksLista();
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();
        // Creamos la lista de productos de tipo snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("### Maquina de Snacks ###");
        servicioSnacks.mostrarSnacks(); // mostrar inventario de snacks disponibles
        while(!salir){
            try {
                var opcion = mostrarMenu(sc);
                salir = ejecutarOpciones(opcion, sc, productos, servicioSnacks);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner sc) {
        System.out.print("""
                Menú:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar Nuevo Snack
                4. Inventario de Snacks
                5. Salir
                Elige una opción:\s""");
        // Leemos y retornamos la opción seleccionada
        return Integer.parseInt(sc.nextLine());
    }

    private static boolean ejecutarOpciones(int opcion, Scanner sc, List<Snack> productos, IServicioSnacks servicioSnacks){
        var salir = false;
        switch (opcion) {
            case 1 -> comprarSnack(sc, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(sc, servicioSnacks);
            case 4 -> listarInventarioSnacks(sc, servicioSnacks);
            case 5 -> {
                System.out.println("Hasta pronto!");
                salir = true;
            }
            default -> System.out.println("Opción no valida");
        }
        return salir;
    }

    private static void comprarSnack(Scanner sc, List<Snack> productos, IServicioSnacks servicioSnacks){
        System.out.print("¿Qué snack quieres comprar (ID)? ");
        var idSnack = Integer.parseInt(sc.nextLine());
        // Validar que el snack sea valido
        var snackEncontrado = false;
        for (var snack: servicioSnacks.getSnacks()) {
            if(idSnack == snack.getIdSnack()){
                // Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if(!snackEncontrado){
            System.out.println("ID de snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "### Ticket de Venta ###";
        var total = 0.0;
        for (var producto: productos) {
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal = $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner sc, IServicioSnacks servicioSnacks) {
        System.out.print("Nombre del snack: ");
        var nombre = sc.nextLine();
        System.out.print("Precio del snack: ");
        var precio = Double.parseDouble(sc.nextLine());
        servicioSnacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Snack agregado correctamente");
        servicioSnacks.mostrarSnacks();
    }

    private static void listarInventarioSnacks(Scanner sc, IServicioSnacks servicioSnacks){
        servicioSnacks.mostrarSnacks();
    }
}
