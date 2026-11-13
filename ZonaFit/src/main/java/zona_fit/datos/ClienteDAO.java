package zona_fit.datos;

import zona_fit.conexion.Conexion;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static zona_fit.conexion.Conexion.getConexion;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps; // Permite preparar la sentencia SQL que se ejecutará en la base de datos
        ResultSet rs;
        Connection con = getConexion();
        var sql = "SELECT id, nombre, apellido, membresia FROM cliente ORDER BY id";
        try {
            // Preparar la sentencia SQL con el objeto de tipo Connection
            ps = con.prepareStatement(sql);
            // Ejecutar la sentencia SQL
            rs = ps.executeQuery();
            // Iterar los resultados
            while (rs.next()) {
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente); // Agregar a la lista
            }
        } catch (SQLException e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        var con = getConexion();
        var sql = "SELECT id, nombre, apellido, membresia FROM cliente WHERE id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            rs = ps.executeQuery();
            if (rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Error al recuperar cliente por id: " + e.getMessage());
        }
        finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexion: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        String sql = "INSERT INTO cliente (nombre, apellido, membresia) " +
                "values (?, ?, ?)"; // ? - Significa que se sustituirán los valores
        try (Connection con = getConexion()) {  // try-with-resources
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al agregar un cliente en la base de datos: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        var sql = "UPDATE cliente SET nombre = ?, apellido = ?, membresia = ? " +
                "WHERE id = ?";
        try (Connection con = getConexion()){
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.setInt(4, cliente.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar el cliente: " + e.getMessage());
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;

        try(Connection con = getConexion()) {
            var sql = "DELETE FROM cliente WHERE id = ?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
            return true;
        } catch (SQLException e ) {
            System.out.println("Error al eliminar el cliente: " + e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        // Listar clientes
        IClienteDAO clientesDAO = new ClienteDAO();
        var clientes = clientesDAO.listarClientes();
        //clientes.forEach(System.out::println);

        // buscar por ID
//        var cliente1 = new Cliente(1);
//        System.out.println("Cliente antes de la busqueda: " + cliente1);
//        var encontrado = clientesDAO.buscarClientePorId(cliente1);
//        if(encontrado)
//            System.out.println("Cliente encontrado: " + cliente1);
//        else
//            System.out.println("No se encontró el cliente con el id: " + cliente1.getId());

        // Agregar un nuevo cliente
//        var nuevoCliente = new Cliente("Enrique", "López", 300);
//        var agregado = clientesDAO.agregarCliente(nuevoCliente);
//
//        if(agregado)
//            System.out.println("Cliente agregado correctamente: " + nuevoCliente);
//        else
//            System.out.println("No se agregó el cliente " + nuevoCliente);

        // Modificar cliente
//        var modificarCliente = new Cliente(4, "Kike", "Lopez", 300);
//        var modificado = clientesDAO.modificarCliente(modificarCliente);
//
//        if(modificado)
//            System.out.println("Cliente modificado correctamente: " + modificarCliente);
//        else
//            System.out.println("No se pudo modificar el cliente: " + modificarCliente);

        // Eliminar cliente
        var eliminarCliente = new Cliente(4); // Solamente el id
        var eliminado = clientesDAO.eliminarCliente(eliminarCliente);

        if (eliminado)
            System.out.println("Se ha eliminado el cliente correctamente: " + eliminarCliente);
        else
            System.out.println("No se ha podido eliminar el cliente: " + eliminarCliente);

        // Listar clientes
        System.out.println("### Listar clientes ###");

        clientes = clientesDAO.listarClientes();
        clientes.forEach(System.out::println);
    }
}
