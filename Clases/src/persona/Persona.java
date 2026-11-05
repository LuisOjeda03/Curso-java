package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idPersona; // Atributo de solo lectura
    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo estatico y asignar el ID
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return  "Id: " + this.idPersona +
                " | Nombre: " + this.nombre +
                " | Apellido: " + this.apellido +
                " | " + super.toString();
    }

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public int getidPersona() {
        return idPersona;
    }
}