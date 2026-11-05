public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("### Operadores Unarios ###");
        int a = 3, b = -2, resultado;
        var c = true;
        // Operador unario +
        resultado = +a;
        System.out.println("resultado +a = " + resultado);
        // Operador unario -
        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        // Operadores unarios de incremento/decremento
        // Pre-incremento
        a = 3;
        resultado = ++a; // Pre-incremento (primero se incrementa el valor)
        System.out.println("resultado = " + resultado);
        // Post-incremento
        a = 3;
        resultado = a++; // Post-incremento (se incrementa despues el valor)
        System.out.println("a (antes de incrementar) = " + resultado);
        System.out.println("a (post-incremento) = " + a);

        // Pre-decremento
        b = -2;
        resultado = --b; // Primero se decrementa el valor
        System.out.println("b con pre-decremento = " + b);

        // Post-decremento
        b = -2;
        resultado = b--; // Se decrementa despues
        System.out.println("b (sin el decremento) = " + resultado);
        System.out.println("b (con el decremento)= " + b);
    }
}
