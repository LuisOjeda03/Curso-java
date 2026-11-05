package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe.");
            } else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Se guarda el archivo en el disco
                System.out.println("Se ha creado el archivo " +nombreArchivo);
                throw new IOException();
            }
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
