package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("### Sistema de Ventas ###");

        var producto1 = new Producto("Blusa", 30.00);
        var producto2 = new Producto("Zapatos", 50.00);

        // Primera orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        System.out.println(orden1);

        // Segunda orden
        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Playera", 100));
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
