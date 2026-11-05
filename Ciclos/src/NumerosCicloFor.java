public class NumerosCicloFor {
    public static void main(String[] args) {
        System.out.println("### Impresión de los Números Par de 0 a 20 con Ciclo For ###");

        for (var contador = 0; contador <= 20; contador++){
            if (contador % 2 == 0) System.out.print(contador + " ");
        }
    }
}
