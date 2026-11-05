public class FuncionRecursiva {
    // Imprimir los valores del 1 al 5 utilizando una funcion recursiva

    static void impresionRecursiva(int numero){
        if (numero == 1) {
            System.out.print(numero + " ");
        } else {
            impresionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        impresionRecursiva(5);
    }
}
