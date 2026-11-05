package aplicación_empleados.servicio;

import aplicación_empleados.dominio.Empleado;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioEmpleadosArchivos implements IServicioEmpleados {
    private final String NOMBRE_ARCHIVO = "empleados.txt";
    private List<Empleado> empleados = new ArrayList<>();

    public ServicioEmpleadosArchivos(){
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;

        try {
            existe = archivo.exists();
            if(existe) {
                // Recuperar los empleados
                this.empleados = obtenerEmpleados();
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se ha creado el archivo " + this.NOMBRE_ARCHIVO);
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }

        if(!existe)
            cargarEmpleadosEjemplo();

    }

    private List<Empleado> obtenerEmpleados(){
        var empleadosRecuperados = new ArrayList<Empleado>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            lineas.forEach(linea -> {
                String[] lineaEmpleado = linea.split(",");
                var nombre = lineaEmpleado[1];
                var apellido = lineaEmpleado[2];
                var puesto = lineaEmpleado[3];
                var empleado = new Empleado(nombre,apellido,puesto);
                empleadosRecuperados.add(empleado);
            });
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("empleados: " + empleadosRecuperados);
        return empleadosRecuperados;
    }

    private void cargarEmpleadosEjemplo(){
        agregarEmpleado(new Empleado("Luis","Ojeda","Ing. Sistemas"));
        agregarEmpleado(new Empleado("Dalia","Alarcon","Médico"));
    }

    @Override
    public void agregarEmpleado(Empleado empleado) {
        // Agregar a la lista
        this.empleados.add(empleado);
        // Agregar al archivo
        agregarEmpleadoArchivo(empleado);
    }

    private void agregarEmpleadoArchivo(Empleado empleado){
        var archivo = new File(NOMBRE_ARCHIVO);

        try {
            var anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(empleado.escribirEmpleadoFormato());
            salida.close();
        } catch (Exception e){
            System.out.println("Ha ocurrido un error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void listarEmpleados() {
        System.out.println("Empleados dentro del sistema: ");
        String cadena = "";
        for (var empleado : this.empleados) {
            cadena += "\t" +empleado + "\n";
        }
        System.out.println(cadena);
    }

    @Override
    public Empleado obtenerEmpleado(int idEmpleado){
        for (var empleado: empleados){
            if(empleado.getIdEmpleado() == idEmpleado) return empleado;
        }
        return null;
    }

    @Override
    public List<Empleado> getEmpleados() {
        return this.empleados;
    }
}
