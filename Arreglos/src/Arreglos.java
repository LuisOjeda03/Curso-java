public class Arreglos {
    public static void main(String[] args) {
        // Arreglos
        // 1. Declarar un arreglo
        int[] enteros;
        // 2. Inicializar el arreglo
        enteros = new int[3];
        // Declarar e inicializar un arreglo
        int[] numeros = new int[2];

        var numeros2 = new int[2];

        // ----------------------------------
        var enteros2 = new int[5];
        enteros2[0] = 5;
        enteros2[1] = 10;
        enteros2[4] = 40;
        // Leer los elementos de un arreglo
        System.out.println("Valor 1 = " + enteros2[0]);
        System.out.println("Valor 2 = " + enteros2[1]);
        System.out.println("Valor 3 = " + enteros2[2]);
        System.out.println("Valor 4 = " + enteros2[3]);
        System.out.println("Valor 5 = " + enteros2[4]);
        System.out.println("-------------------------");

        int[] enteros3 = {100,200,300,400,500};
        var enterosVar = new int[]{100,200,300,400,500}; // Utilizando var

        System.out.println("Valor 1 = " + enteros3[0]);
        System.out.println("Valor 2 = " + enteros3[1]);
        System.out.println("Valor 3 = " + enteros3[2]);
        System.out.println("Valor 4 = " + enteros3[3]);
        System.out.println("Valor 5 = " + enteros3[4]);

        System.out.println("Imprimir el arreglo: " + enteros3);
        System.out.println("------------------------");
        System.out.println("Longitud del arreglo enteros3: " + enteros3.length);
        // Iterar los elementos del arreglo
        for (var i = 0; i < enteros3.length; i++){
            System.out.println("Indice "+ i + " = "+ enteros3[i]);
        }
    }
}