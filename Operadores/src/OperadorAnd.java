public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("### Operador And ###");
        boolean a = false, b = false;
        // and (Regresa verdadero si ambos valores son verdadero)
        System.out.println("false && false = " + (a && b));
        a = true;
        System.out.println("true && false = " + (a && b));
        a = false;
        b = true;
        System.out.println("false && true = " + (a && b));
        a = true;
        System.out.println("true && true = " + (a && b));
    }
}
