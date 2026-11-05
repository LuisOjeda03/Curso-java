import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("### Promedio de Calificaciones ###");
        System.out.print("Calificaciones a agregar: ");
        var cantidadCalificaciones = sc.nextInt();

        var calificacionesArreglo = new int[cantidadCalificaciones];
        for (var i = 0; i < calificacionesArreglo.length; i++){
            System.out.print("Calificacion["+i+"] = ");
            calificacionesArreglo[i] = sc.nextInt();
        }
        var promedio = 0.0;
        for (var i = 0; i < calificacionesArreglo.length; i++){
            promedio += calificacionesArreglo[i];
        }
        promedio /= calificacionesArreglo.length;

        System.out.println("Promedio de las calificaciones: " +promedio);
    }
}
