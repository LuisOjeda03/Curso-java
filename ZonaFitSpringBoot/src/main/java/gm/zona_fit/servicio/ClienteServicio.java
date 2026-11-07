package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio {

    // Inyección de dependencias
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer clienteID) {
        // orElse significa: en caso de no encontrar el ID, regresar el valor de nulo
        Cliente cliente = clienteRepositorio.findById(clienteID).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        // De manera interna:
        // 1. Si el ID es nulo, se hace un save
        // 2. Si el ID NO es nulo, se hace un update
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }
}
