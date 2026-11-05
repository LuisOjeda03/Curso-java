public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodo de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        var longitudCadena1 = cadena1.length();
        System.out.println("longitudCadena1 = " + longitudCadena1);

         // Reemplazar caracteres
        var nuevacadena = cadena1.replace('o','a');
        System.out.println("nuevacadena = " + nuevacadena);

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        // Convertir a minusculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        // Eliminar espacios al inicio y al final
        var cadena2 = " Luis Enrique   ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());
    }
}
