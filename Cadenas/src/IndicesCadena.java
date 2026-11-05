public class IndicesCadena {
    public static void main(String[] args) {
        // Manejo de indices en una cadena
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Recuperar el primer caracter
        var caracter1 = cadena1.charAt(0);
        System.out.println("caracter1 = " + caracter1);

        // Recuperar el ultimo caracter
        var caracter2 = cadena1.charAt(9);
        System.out.println("caracter2 = " + caracter2);

        // Recuperar de manera dinamica
        var longitudCadena = cadena1.length();
        var caracterDinamico = cadena1.charAt(longitudCadena - 1);
        System.out.println("caracterDinamico = " + caracterDinamico);

        // Imprimir el caracter M
        var caracterM = cadena1.charAt(5);
        System.out.println("caracterM = " + caracterM);
    }
}
