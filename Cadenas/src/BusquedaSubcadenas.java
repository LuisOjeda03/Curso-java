public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // indexOf - Devuelve el indice de la primera aparicion de la subcadena
        var cadena1 = "Hola Mundo";
        
        // subcadena de Hola
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf - devuelve el indice de la ultima aparicion de la subcadena
        // subcadena de Mundo
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // subcadena no encontradaq
        var indice3 = cadena1.indexOf("z");
        System.out.println("indice3 = " + indice3);

        // Ejemplo con oso
        var cadenaEjemplo = "oso";
        var primerIndice = cadenaEjemplo.indexOf("o");
        System.out.println("primerIndice = " + primerIndice); // regresa 0
        var ultimoIndice = cadenaEjemplo.lastIndexOf("o");
        System.out.println("ultimoIndice = " + ultimoIndice); // regresa 2
    }
}
