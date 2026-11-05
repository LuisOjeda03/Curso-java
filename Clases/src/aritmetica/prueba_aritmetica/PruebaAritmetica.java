package aritmetica.prueba_aritmetica;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("### Creación de objetos de la clase Aritmetica ###");
        System.out.println("-- Aritmetica 1 --");
        var arit1 = new Aritmetica(5,7);
        // arit1.operando1 = 5;
        // arit1.operando2 = 7;
        arit1.setOperando1(10);
        arit1.setOperando2(20);
        arit1.sumar();
        arit1.restar();
        System.out.println("Atributo operando1 : " + arit1.getOperando1());
        System.out.println("-- Aritmetica 2 --");
        var arit2 = new Aritmetica(6,7);
        // arit2.operando1 = 12;
        // arit2.operando2 = 16;
        arit2.sumar();
        arit2.restar();

        // Constructor Vacio
        System.out.println("-- Aritmetica 3 | Constructor vacio --");
        var arit3 = new Aritmetica();
        arit3.sumar();
        System.out.println("-- Aritmetica 4 --");
        // Creamos otro objeto
        var aritmetica4 = new Aritmetica(12,2);
        aritmetica4.sumar();
    }
}
