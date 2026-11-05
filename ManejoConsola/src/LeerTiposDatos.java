import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        var sc = new Scanner(System.in);

        // NOTA: los metodos nextInt, nextDouble... generan un salto de linea
        //       por lo tanto, si queremos leer un nextLine, se saltará automaticamente

        // Leer un tipo int
        System.out.print("Ingresa tu edad: ");
        var edad = sc.nextInt();
        System.out.println("edad = " + edad);

        // Leer un tipo double
        System.out.print("Ingresa tu altura (mts): ");
        var altura = sc.nextDouble();
        System.out.println("altura = " + altura);
        // Consumir el caracter de salto de linea
        sc.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = sc.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos (casting)
        System.out.print("Proporciona un valor entero: ");
        //var enteroString = sc.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(sc.nextLine());
        System.out.println("entero = " + entero);

        // Tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(sc.nextLine());
        System.out.println("flotante = " + flotante);
    }
}
