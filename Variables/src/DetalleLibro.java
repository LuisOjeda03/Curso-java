public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de Libro
        String tituloLibro = "La Odisea";
        int anioPublicacion = 750;
        boolean libroDisponible = true;
        double precio = 499.99;

        System.out.println("Titulo del libro: " + tituloLibro);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Disponible: " + libroDisponible);
        System.out.println("Precio: " + precio);

        // Modificar el titulo de libro
        tituloLibro = "La Odisea - Homero";
        System.out.println(tituloLibro);
    }
}
