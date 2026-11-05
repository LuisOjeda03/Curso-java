public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        // Una subcadena es obtener una parte de la cadena original
        // Ejemplo:
        // "Hola Mundo"
        // "Hola"   "Mundo" 2 -> subcadenas

        // substring(inicio, fin (sin incluirlo));

        String cadenaOriginal = "Hola mundo";
        System.out.println("cadenaOriginal = " + cadenaOriginal);

        // Subcadena - Hola
        var subcadena1 = cadenaOriginal.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        // Subcadena - Mundo
        var subcadena2 = cadenaOriginal.substring(5);
        System.out.println("subcadena2 = " + subcadena2);
    }
}