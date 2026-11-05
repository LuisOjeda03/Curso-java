public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion cadenas (pool de cadenas)

        var cadena1 = "Luis";
        var cadena2 = "Luis";
        var cadena3 = new String("Luis");

        // Comparacion de cadenas (==) comparan la referencia
        System.out.println("cadena1 es igual en referencia a cadena2");
        System.out.println(cadena1 == cadena2);

        // Comparamos cadena1 con cadena3 (referencias)
        System.out.println("cadena1 es igual en referencia a cadena3");
        System.out.println(cadena1 == cadena3);

        // -- Comparacion de contenidos --
        // Para comparar contenidos se utiliza el metodo .equals
        System.out.println("cadena1 es igual en contenido a cadena3");
        System.out.println(cadena1.equals(cadena3));
    }
}