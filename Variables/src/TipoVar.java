public class TipoVar {
    public static void main(String[] args) {
        System.out.println("### Uso de var en Java ###");

        // Sin el uso de var
        String nombre1 = "Luis";
        System.out.println("nombre1 = " + nombre1);

        // Utilizando var
        var nombre2 = "Luis E.";
        System.out.println("nombre2 = " + nombre2);

        // Definir otras variables utilizando var
        var edad = 30;
        System.out.println("edad = " + edad);

        var sueldo = 35000.50;  // Se infiere como Double
        System.out.println("sueldo = " + sueldo);

        var esCasado = false;
        System.out.println("esCasado = " + esCasado);

        // Se debe definir su valor al momento de declarar la variable
        // var precio; -> Incorrecto
        // var apellido = null; -> Incorrecto, no es inferible
    }
}