package gm.zona_fit.gui;

import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

@Component
public class ZonaFitForm extends JFrame {
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;

    // Inyección de dependencias desde el constructor
    // Se realizó de esta manera, ya que cuando se crea el objeto de Form, es necesario tener información de los clientes
    // de la otra manera, tendríamos que tener otra implementación para poder cargar los clientes al momento de abrir la ventana.
    @Autowired
    public ZonaFitForm(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForm();
    }

    private void iniciarForm(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null); // Centrar la ventana
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        // Método especial que se ejecuta antes del constructor
        //                                       cantidad de datos, cantidad de columnas
        this.tablaModeloClientes = new DefaultTableModel(0, 4);
        String[] cabeceros = {"Id", "Nombre", "Apellido", "Membresia"};
        this.tablaModeloClientes.setColumnIdentifiers(cabeceros);
        this.clientesTabla = new JTable(tablaModeloClientes);
    }
}
