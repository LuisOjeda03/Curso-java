public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas de nombres de variables

        // Es peferible que el nombre de las variables respeten la notacion de CamelCase
        String nombreCompleto = "Luis Enrique Ojeda López";
        System.out.println("nombreCompleto = " + nombreCompleto);

        String NombreCompleto = "Luis Ojeda"; // Variable distinta - No aplica buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);

        // String nombre-cliente = "Luis"; - Incorrecto
        // String nombre_cliente = "Luis"; - Correcto ; No aplica buenas practicas

        String _apellido = "Ojeda"; // Correcto ; Aceptable
        String $apellido = "Ojeda"; // Correcto ; Aceptable

        int totpz = 10; // Correcto ; No aplica buenas practicas
        int totalPiezas; // Correcto ; Buenas practicas

        boolean casado = true; // Correcto ; Mejorable
        boolean esCasado = true; // Correcto ; Buenas practicas

        boolean isCasado = true; // Correcto ; Combinar idiomas depende del proyecto

        boolean tieneSaldo = true; // Correcto ; Buenas practicas
        boolean hasSaldo = true; // Correcto ; Depende de las reglas del proyecto desarrollado
    }
}