public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres especiales en Java

        // '\n' - imprimir un salto de linea
        var cadena1 = "Hola \nMundo!";
        System.out.println("cadena1 = " + cadena1);

        // '\t' - tabulador
        var cadena2 = "\tHola \tMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\'' - Agregar una comilla simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // '\"' - Agrega una comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);

        // '\\' - Coloca una diagonal inversa
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);
    }
}
