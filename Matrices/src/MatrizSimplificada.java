public class MatrizSimplificada {
    public static void main(String[] args) {
        // Declaración y asignación
        var matriz = new int[][]{
                {100,200,300},
                {400,500,600}
        };

        // Recorrer una matriz
        for (var i = 0; i < matriz.length; i++){
            for (var j = 0; j < matriz[i].length; j++) {
                System.out.println("matriz["+i+"]["+j+"] = " + matriz[i][j]);
            }
        }
    }
}
