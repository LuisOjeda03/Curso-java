import java.util.Scanner;

public class CalculoAreaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("### Calculo Área y Perímetro de un Rectángulo ###");

        var sc = new Scanner(System.in);
        System.out.print("Base del rectangulo: ");
        var base = sc.nextDouble();
        System.out.print("Altura del rectangulo: ");
        var altura = sc.nextDouble();

        var area = base * altura;
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                Area: %.2f
                Perimetro: %.2f
                """, area, perimetro);
    }
}
