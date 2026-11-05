public class Variables {
    public static void main(String[] args) {
        // Variables
        int edad = 22;
        double precio = 499.99;
        boolean disponible = true;
        char genero;         // Solamente declaracion

        genero = 'M'; // M - Masculino | F - Femenino

        // Acceder a las variables
        System.out.println(edad);
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        // Modificar el valor
        precio = 10;
        System.out.println("");
        System.out.println("Valor de Precio modificado: ");
        System.out.println(precio);
    }
}