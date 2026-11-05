package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    /*
        Al ser final la lista, significa que una vez inicializada en un tipo de lista ya no se podrá cambiar,
        sin embargo el contenido que almacena si se podrá cambiar.
     */
    private static final List<Snack> snacks;

    /* -- Bloque static inicializador --
        Como no crearemos objetos de tipo Snacks, sino utilizaremos métodos estáticos no agregaremos
        un constructor, por ello crearemos un método para inicializar los atributos estaticos.
        Es parecido a un constructor, ya que cuando la clase se carga en memoria, se ejecuta el método.
    */
    static{             // Bloque parecido a constructor
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 50));
        snacks.add(new Snack("Coca-cola", 27));
        snacks.add(new Snack("Torta", 90));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }

}