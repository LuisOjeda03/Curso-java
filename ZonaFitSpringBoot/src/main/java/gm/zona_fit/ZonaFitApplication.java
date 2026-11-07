package gm.zona_fit;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.util.Scanner;


@SpringBootApplication
public class ZonaFitApplication implements CommandLineRunner {

	// Inyectar una dependencia
	@Autowired
	private IClienteServicio clienteServicio;

	// Logs
	private static final Logger logger = LoggerFactory.getLogger(ZonaFitApplication.class);

	// Scanner
	private static Scanner sc = new Scanner(System.in);

	// Salto de linea
	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Iniciando la aplicacion");
		// Levantar la fabrica de Spring
		SpringApplication.run(ZonaFitApplication.class, args);
		logger.info("Aplicacion finalizada");
	}

	// Los métodos ya no son estaticos
	@Override
	public void run(String... args) throws Exception {
		zonaFitApp();
	}

	private void zonaFitApp(){
		logger.info("### Aplicación Zona Fit - Gym ###");
		var salir = false;
		while(!salir){
			var opcion = mostrarMenu();
			salir = selecionarOpcion(opcion);
		}
	}

	private int mostrarMenu(){
		logger.info("""
				\n -- Menú --
				1. Listar clientes
				2. Buscar cliente
				3. Agregar cliente
				3. Modificar cliente
				4. Eliminar cliente
				5. Salir
				Opción:\s""");
		return Integer.parseInt(sc.nextLine());
	}

	private boolean selecionarOpcion(int opcion){
		switch (opcion){
			case 1 -> {
				var clientes = clienteServicio.listarClientes();
				clientes.forEach(cliente -> logger.info(cliente.toString()));
			}
			case 2 -> {
				logger.info("### Buscar cliente por ID ###");
				logger.info("ID del cliente a buscar: ");
				var idCliente = Integer.parseInt(sc.nextLine());
				Cliente cliente = clienteServicio.buscarClientePorId(idCliente);

				if(cliente != null)
					logger.info("Cliente encontrado: " + cliente);
				else
					logger.info("Cliente NO encontrado");
			}
			case 3 -> {
				modificarGuardarCliente(null);
				logger.info("Cliente registrado exitosamente");
			}
			case 4 -> {
				logger.info("ID del cliente: ");
				var idCliente = Integer.parseInt(sc.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);

				if(cliente.getId() == null){
					logger.info("Cliente no encontrado");
				} else {
					modificarGuardarCliente(cliente.getId());
					logger.info("Cliente modificado exitosamente");
				}
			}
			case 5 -> {
				logger.info("ID del cliente: ");
				var idCliente = Integer.parseInt(sc.nextLine());
				var cliente = clienteServicio.buscarClientePorId(idCliente);

				if(cliente.getId() == null){
					logger.info("Cliente no encontrado");
				} else {
					clienteServicio.eliminarCliente(cliente);
					logger.info("Cliente eliminado exitosamente");
				}
			}
			case 6 -> {
				logger.info("Hasta luego!");
				return true;
			}

			default -> logger.info("Opción invalida");
		}
		return false;
	}

	private void modificarGuardarCliente(Integer idCliente){
		logger.info("Nombre: ");
		var nombre = sc.nextLine();
		logger.info("Apellido: ");
		var apellido = sc.nextLine();
		logger.info("Membresia: ");
		var membresia = Integer.parseInt(sc.nextLine());

		var clienteNuevo = new Cliente(idCliente, nombre, apellido, membresia);
		clienteServicio.guardarCliente(clienteNuevo);
	}
}