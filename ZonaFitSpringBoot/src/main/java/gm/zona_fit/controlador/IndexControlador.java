package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data // Generar los get y set de los atributos (lombok)
@ViewScoped // App de una sola pagina, gestiona el tiempo de vida del bean mientras el usuario se encuentre en la pag.
public class IndexControlador {

    @Autowired
    IClienteServicio clienteServicio;

    private List<Cliente> clientes;
    private static final Logger logger = // Bitacora de la app
            LoggerFactory.getLogger(IndexControlador.class);

    @PostConstruct // Se llama despues de instanciar un objeto
    public void init(){
        cargarDatos();
    }

    public void cargarDatos(){
        this.clientes = this.clienteServicio.listarClientes();
        this.clientes.forEach(cliente -> logger.info(cliente.toString()));
    }
}
