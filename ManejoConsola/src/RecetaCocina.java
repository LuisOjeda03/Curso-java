import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var sb = new StringBuilder();

        System.out.println("### Recetas de Cocina ###");
        System.out.print("Nombre de la receta: ");
        var nombreReceta = sc.nextLine();
        System.out.print("Ingredientes principales: ");
        var ingredientesReceta = sc.nextLine();
        System.out.print("Tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(sc.nextLine());
        System.out.print("Dificultad (Facil, Media, Alta): ");
        var dificultadReceta = sc.nextLine();

        sb.append("\nReceta de "+nombreReceta+":\n");
        sb.append("\tIngredientes principales: "+ingredientesReceta+"\n");
        sb.append("\tTiempo de preparación: "+ tiempoPreparacion+"\n");
        sb.append("\tDificultad: "+dificultadReceta+"\n");

        System.out.println(sb);
    }
}
