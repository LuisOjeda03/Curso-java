package gm.zona_fit.controlador;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.IClienteServicio;
import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import lombok.Data;
import org.primefaces.PrimeFaces;
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
    private Cliente clienteSeleccionado;
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

    public void agregarCliente(){
        this.clienteSeleccionado = new Cliente();
    }

    public void guardarCliente(){
        logger.info("Cliente a guardar: " + this.clienteSeleccionado);
        // Agregar
        if(this.clienteSeleccionado.getId()==null) {
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            this.clientes.add(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage("Cliente agregado"));
        }
        // Modificar (update)
        else {
            this.clienteServicio.guardarCliente(this.clienteSeleccionado);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente actualizado"));
        }
        // Ocultar la ventana modal
        PrimeFaces.current().executeScript("PF('ventanaModalCliente').hide()");
        // Actualizar la tabla usando AJAX
        PrimeFaces.current().ajax().update("forma-clientes:mensajes",
                "forma-clientes:clientes-tabla");
        // Reset del objeto cliente seleccionado
        this.clienteSeleccionado = null;
    }

    public void eliminarCliente(){
        logger.info("Cliente a eliminar: " + this.clienteSeleccionado);
        this.clienteServicio.eliminarCliente(this.clienteSeleccionado);
        // Eliminar el registro de la lista de clientes
        this.clientes.remove(this.clienteSeleccionado);
        // Reset del cliente seleccionado
        this.clienteSeleccionado = null;
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Cliente eliminado"));
        PrimeFaces.current().ajax().update("forma-clientes:mensajes", "forma-clientes:clientes-tabla");
    }
}
