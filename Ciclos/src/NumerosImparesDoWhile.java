public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        System.out.println("### Números impares 0 - 20 con do-while ###");

        var contador = 0;
        System.out.println("Números impares");
        do {
            if(contador % 2 != 0) System.out.print(contador + " ");
            contador++;
        } while (contador<=20);
    }
}
