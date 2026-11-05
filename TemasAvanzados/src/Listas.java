import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // <> los pico-parentesis se utilizan para indicar el tipo de dato
        List<String> miLista = new ArrayList<>();
        miLista.add("Hola");
        miLista.add("Adios");

        for (Object elemento: miLista){
            System.out.println(elemento);
        }

        // Funciones lambda (Función anonima de un codigo muy compacto)
        miLista.forEach( elemento -> {
            System.out.println("elemento = " + elemento);
        });

        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Luis", "Mario", "Beto");
        System.out.println("\nLista de nombres:");
        nombres.forEach(System.out::println);
    }
}