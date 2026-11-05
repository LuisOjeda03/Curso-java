public class AcumuladorSuma {
    public static void main(String[] args) {
        System.out.println("### Ejercicio de Acumulador de Suma ###");

        final var MAXIMO = 5;
        var suma = 0;

        for (var i = 1; i <= MAXIMO; i++){
            System.out.println("(suma + numero) -> " + suma + " + " + i);
            suma += i;
            System.out.println("Suma acumulada: " + suma + "\n");
        }
        System.out.println("Resultado de la suma acumulativa: " + suma);
    }
}