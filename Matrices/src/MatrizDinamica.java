import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        int renglones, columnas;
        // Definir la matriz
        System.out.print("Renglones de la matriz: ");
        renglones = sc.nextInt();
        System.out.print("Columnas de la matriz: ");
        columnas = sc.nextInt();
        var matriz = new int[renglones][columnas];

        System.out.println("");
        // Solicitar los valores
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.print("Valor["+ren+"]["+col+"] = ");
                matriz[ren][col] = sc.nextInt();
            }
        }
        // Iterar los valores de la matriz
        for (var ren = 0; ren < renglones; ren++){
            for (var col = 0; col < columnas; col++){
                System.out.println("Valor["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }
    }
}
