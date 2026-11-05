package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try{
            var resultado = Aritmetica.dividir(10,0);
            System.out.println("resultado = " + resultado);
        } catch (Exception e) {
            System.out.println("Error = " + e);     // solo se ejecuta si hay una excepcion
        } finally {
            System.out.println("Hola a todos");     // Siempre se ejecuta
        }
    }
}
