public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadenas
        var cadenaOriginal = "Hola Mundo";
        System.out.println("cadena original = " + cadenaOriginal);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadenaOriginal.replace("Mundo", "a todos!");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar la cadena "Hola" por "Adios"
        nuevaCadena = nuevaCadena.replace("Hola", "Saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}