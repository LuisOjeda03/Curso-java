public class ArgumentosVariables {
    public static void main(String[] args) {
        // imprimirNumeros(1,2,3); // variable arguments (también conocidos como varargs)
        variosParametros("Luis", 10, 20, 30);
    }

    // Regla de los argumentos variables:
    // - Cuando se tiene parametros que no son varargs, se ponen primero
    //   luego van los argumentos variables
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }

    static void imprimirNumeros(int ... numeros) { // ... significa que de manera interna se crea un arreglo
        for (var i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
    }
}
