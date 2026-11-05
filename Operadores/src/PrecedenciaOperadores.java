public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Precedencia de operadores en Java
        // 1. Parentesis y corchetes
        // 2. Operadores unarios -, --, ++;
        // 3. Operadores aritmeticos *, /
        // 4. Operadores aritmeticos +, -
        // 5. Relacionales <, <=, >, >=
        // 6. Equilavencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
        var a = 12 / 3 + 2 * 3 - 1;
        System.out.println("a = " + a);
    }
}
