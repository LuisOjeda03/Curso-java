public class NumerosParesWhile {
    public static void main(String[] args) {
        System.out.println("### Números pares utilizando el ciclo while ###");
        var contador = 0;

        while (contador <= 20){
            if(contador % 2 == 0)
                System.out.println(contador);
            contador++;
        }
    }
}
