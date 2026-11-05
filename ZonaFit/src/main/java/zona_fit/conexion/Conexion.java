package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public static Connection getConexion(){
        Connection conexion = null;
        var baseDatos = "zona_fit_db";
        var url = "jdbc:postgresql://localhost:5432/" + baseDatos;
        var usuario = "postgres";
        var password = "postgres";

        try {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error al conectarnos a la base de datos: " + e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        var conexion = Conexion.getConexion();
        if(conexion != null)
            System.out.println("Conexión exitosa: " + conexion );
        else
            System.out.println("Error al conectarse");
    }
}
