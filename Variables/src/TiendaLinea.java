public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("### Tienda en Línea ###");

        String nombreProducto = "Laptop";
        double precioProducto = 4999.99;
        int cantidadDisponible = 10;
        boolean estaDisponible = true;

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);

        nombreProducto = "Cuaderno";
        precioProducto = 50.49;
        cantidadDisponible = 0;
        estaDisponible = false;

        System.out.println();

        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precioProducto = " + precioProducto);
        System.out.println("cantidadDisponible = " + cantidadDisponible);
        System.out.println("estaDisponible = " + estaDisponible);
    }
}