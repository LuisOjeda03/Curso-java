public class FuncionSumar {
    // Definir funcion de sumar
    static int sumar(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        int arg1 = 1, arg2 = 2;
        var resultado = sumar(arg1, arg2);
        System.out.println("Resultado: " + resultado);
    }
}
