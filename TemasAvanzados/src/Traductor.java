public interface Traductor {
    // publicos y abstractos
    void traducir();

    // Métodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor");
    }
}

class Ingles implements Traductor {
    // Implementando
    @Override
    public void traducir(){
        System.out.println("Traduciendo a inglés...");
    }
}

class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Traduciendo a francés...");
    }

    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando tradución en frances...");
    }
}

class PruebaTraductor {
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}