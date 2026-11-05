package aplicación_empleados.dominio;

import java.io.Serializable;
import java.util.Objects;

public class Empleado implements Serializable {
    private static int contadorEmpleados = 0;

    private int idEmpleado;
    private String nombre;
    private String apellido;
    private String puesto;

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleados;
    }

    public Empleado(String nombre, String apellido, String puesto){
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
    }

    public String escribirEmpleadoFormato(){
        return this.idEmpleado + "," + this.nombre + "," + this.apellido + "," + this.puesto;
    }

    public static int getContadorEmpleados() {
        return contadorEmpleados;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return idEmpleado == empleado.idEmpleado && Objects.equals(nombre, empleado.nombre) && Objects.equals(apellido, empleado.apellido) && Objects.equals(puesto, empleado.puesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEmpleado, nombre, apellido, puesto);
    }
}
