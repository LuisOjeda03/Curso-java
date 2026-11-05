package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("### Creación de Objetos de tipo Persona ###");
        System.out.println("Contador personas: " + Persona.getContadorPersonas());
        var persona1 = new Persona("Luis", "Ojeda"); // la palabra reservada new reserva espacio de memoria para el tipo de objeto
        System.out.println("-- Persona 1 --");

        System.out.println(persona1); // Automaticamente se llama al metodo toString
        System.out.println("Contador personas: " + Persona.getContadorPersonas());

        var persona2 = new Persona("Dalia", "Vanessa");
        System.out.println("-- Persona 2 --");
        System.out.println(persona2);
        System.out.println("Contador personas: " + Persona.getContadorPersonas());
    }
}
