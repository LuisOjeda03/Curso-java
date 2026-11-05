import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int filas, columnas;
        System.out.println("### Suma de la Diagonal de una Matriz");
        System.out.print("Filas de la matriz: ");
        filas = sc.nextInt();
        System.out.print("Columnas de la matriz: ");
        columnas = sc.nextInt();

        // Declarar la matriz
        var matriz = new int[filas][columnas];

        // Solicitar los datos
        for (var fil = 0; fil < filas; fil++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor matriz["+fil+"]["+col+"] = ");
                matriz[fil][col] = sc.nextInt();
            }
        }

        // Recorrer matriz
        var suma = 0;
        for (var fil = 0; fil < filas; fil++){
            for (var col = 0; col < columnas; col++){
                if (fil == col) suma += matriz[fil][col];
            }
        }

        System.out.println("Suma diagonal = " + suma);
    }
}
