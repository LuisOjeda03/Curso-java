public class OperadorOr {
    public static void main(String[] args) {
        System.out.println("### Operador Or ###");
        boolean a = false, b = false;
        // or || (Regresa verdadero si alguno de los valores es verdadero)
        System.out.println("false || false = " + (a || b));
        a = true;
        System.out.println("true || false = " + (a || b));
        a = false;
        b = true;
        System.out.println("false || true = " + (a || b));
        a = true;
        System.out.println("true || true = " + (a || b));
    }
}
