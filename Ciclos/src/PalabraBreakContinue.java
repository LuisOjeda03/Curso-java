public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("### Palabras Break y Continue ###");

        // Ejemplo break, imprimir solo el primer numero par
        for (var i = 1; i < 20; i++){
            if(i%2 == 0) {
                System.out.println(i);
                System.out.println("Saliendo del ciclo...");
                break;
            }
        }
        System.out.println("");
        // Ejemplo con continue. Imprimir solo numeros pares, ignorar impares
        for (var i = 1; i < 20; i++){
            if(i % 2 != 0) continue;
            System.out.print(i + " ");
        }
    }
}
