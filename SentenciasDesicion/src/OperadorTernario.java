public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("### Operador Ternario ###");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println(resultado);

        // Calcular si es mayor de edad
        var edad = 22;
        resultado = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Tienes " + edad + " años, eres " +resultado);

        // Valor positivo, negativo o 0 (Operador ternario anidado)
        numero = 0;
        resultado = (numero > 0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El número " + numero + " es " +  resultado);
    }
}
