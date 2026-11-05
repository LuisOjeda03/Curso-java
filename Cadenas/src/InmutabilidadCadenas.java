public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutabilidad cadenas
        var cadena1 = "Hola a todos!";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = cadena1;

        cadena1 = "Adios!";
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
