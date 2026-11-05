package animales;

public class Animal {
    protected void comer(){
        System.out.println("Comiendo...");
    }

    protected void dormir(){
        System.out.println("zZzZzZ...");
    }

    protected void hacerSonido(){
        System.out.println("El animal hace un sonido");
    }
}

class Perro extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace WOOF!");
    }

    @Override
    public void dormir(){
        System.out.println("Duermo 12 horas...");
        System.out.println("Metodo de la clase padre: ");
        super.dormir();
    }
}

class Gato extends Animal {
    @Override
    protected void hacerSonido(){
        System.out.println("El gato hace MEOW!");
    }
}

class PruebaAnimal {

    // Metodo polimorfico
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        System.out.println("### Ejemplo de herencia ###");
        // Objeto de la clase padre (Animal)
        // var animal = new Animal();
        // var animal = new Perro();
        var animal = new Gato();
        imprimirSonido(animal);
    }
}