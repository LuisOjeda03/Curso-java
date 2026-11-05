public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 con metodo concat = " + cadena3);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);

        var resultado = constructorCadenas.toString();
        System.out.println("constructorCadenas = " + constructorCadenas);

        // StringBuffer - Seguro cuando se trabaja con varios hilos / procesos a la vez
        //              - Es utilizado rara vez
        var stringBuffer = new StringBuilder();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + resultado );

        // join
        resultado = String.join("-", cadena1, cadena2);
        System.out.println("resultado = " + resultado);
    }
}