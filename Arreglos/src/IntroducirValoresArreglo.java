import java.util.Scanner;

public class IntroducirValoresArreglo {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        // Declarar el arreglo
        System.out.print("Tamaño del arreglo: ");
        var tamanoArreglo = sc.nextInt();
        int[] arreglo = new int[tamanoArreglo]; // Creamos de manera dinámica el arreglo

        // Solicitar los valores del arreglo
        for (var i = 0; i < arreglo.length; i++){
            System.out.print("Valor de la posición ["+i+"]: ");
            arreglo[i] = sc.nextInt();
        }
        // Imprimir el arreglo
        for (var i = 0; i < arreglo.length; i++){
            System.out.println("arreglo["+i+"] = " +arreglo[i]);
        }
    }
}