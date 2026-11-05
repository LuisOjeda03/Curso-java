package aplicación_empleados.servicio;

import aplicación_empleados.dominio.Empleado;

import java.util.List;

public interface IServicioEmpleados {
    void agregarEmpleado(Empleado empleado);
    void listarEmpleados();
    Empleado obtenerEmpleado(int idEmpleado);
    List<Empleado> getEmpleados();
}
