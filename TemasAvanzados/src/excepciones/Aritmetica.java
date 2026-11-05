package excepciones;

public class Aritmetica {
    public static int dividir(int numerador, int denominador){
        if (denominador == 0)
            throw new RuntimeException("División entre Cero");
        return numerador / denominador;
    }
}
