public class ClaseAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

// Clase abstracta Figura Geometrica

abstract class FiguraGeometrica { // No se puede instanciar
    public abstract void dibujar();
}

class Rectangulo extends FiguraGeometrica {

    // Implementación (no sobre escritura por que es la primera vez que se implementa)
    @Override
    public void dibujar(){
        System.out.println("""
                --------------------------
                |      RECTANGULO        |
                |                        |
                --------------------------""");
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("""
                   ******
                 *        *
                *  CIRCULO  *
                 *        *
                   ******
                """);
    }
}