public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz 2x3
        // 2 Renglones x 3 Columnas
        // int[][] matriz = new int[2][3];

        final var RENGLONES = 2;
        final var COLUMNAS = 3;

        var matriz = new int[RENGLONES][COLUMNAS];
        // Modificar los valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;

        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Acedemos a los valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
        System.out.println("");
        System.out.println("---------------------------------");

        // Recorrer una matriz
        for (var i = 0; i < RENGLONES; i++){
            for (var j = 0; j < COLUMNAS; j++) {
                System.out.println("matriz["+i+"]["+j+"] = " + matriz[i][j]);
            }
        }
    }
}