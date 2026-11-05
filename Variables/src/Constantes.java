public class Constantes {
    public static void main(String[] args) {
        System.out.println("### Constantes en Java ###");
        // Para declarar una constante se coloca la palabra reservada final
        final var DIAS_SEMANAS = 7;
        System.out.println("DIAS_SEMANAS = " + DIAS_SEMANAS);

        // DIAS_SEMANAS = 8; Error, no se puede reasignar el valor de una constante
        final var PI = 3.1416;
        System.out.println("PI = " + PI);
        System.out.println("Math.PI = " + Math.PI);

        final var MENSAJE_BIENVENIDA = "Bienvenido!";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);

        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println("SEGUNDOS_POR_MINUTO = " + SEGUNDOS_POR_MINUTO);
    }
}
