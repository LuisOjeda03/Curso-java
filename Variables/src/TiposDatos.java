public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en Java

        // --- Enteros ---
        byte tipoByte = -128;       // Rango de valor permitido -128 a 127
                                    // 8 Bits (1 byte)
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32000;    // 16 Bits (2 bytes)
        System.out.println("tipoShort = " + tipoShort);

        int tipoInt = 2000000000;   // 32 Bits (4 bytes)
        System.out.println("tipoInt = " + tipoInt);

        long tipoLong = 9223372036854775807L; // 64 Bits (8 bytes)
                                              // Colocar L para indicar que es Long
        System.out.println("tipoLong = " + tipoLong);


        // --- De punto flotante ---
        float tipoFloat = 82.11F;   // 32 Bits (4 bytes)
                                    // Colocar F para indicar que es un Float
        System.out.println("tipoFloat = " + tipoFloat);

        double tipoDouble = 11.22;  // 64 Bits (4 bytes)
        System.out.println("tipoDouble = " + tipoDouble);

        System.out.println();

        // --- Caracter ---
        char tipoChar = 'A'; // Caracteres del juego Unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;       // En unicode y ascii, 65 corresponde a la letra A
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 936;
        System.out.println("tipoChar = " + tipoChar);

        System.out.println();

        // --- Boolean ---
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        System.out.println();

        // --- Tipos Object (Referencia) ---
        String tipoString = null;
        System.out.println("nombre = " + tipoString);
        tipoString = "¡HOLA!";
        System.out.println("tipoString = " + tipoString);

    }
}
