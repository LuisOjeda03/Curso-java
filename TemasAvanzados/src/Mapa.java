import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        //           llave   |  valor
        persona.put("nombre", "Diego");
        persona.put("apellido", "Flores");
        persona.put("edad", "31 años");
        persona.put("edad", "31 años"); // No se permite duplicado
        System.out.println("Valores del mapa: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35 años"); // Modificar el valor de la llave existente
        persona.remove("apellido");     // Se elimina la clave - valor
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos (llave, valor)");
        persona.forEach((k, v) -> {
            System.out.println("Llave: " + k + " | Valor: " + v);
        });
    }
}
