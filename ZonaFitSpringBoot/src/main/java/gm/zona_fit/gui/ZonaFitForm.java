package gm.zona_fit.gui;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@Component
public class ZonaFitForm extends JFrame {
    private JPanel panelPrincipal;
    private JTable clientesTabla;
    private JTextField nombreTexto;
    private JTextField apellidoTexto;
    private JTextField membresiaTexto;
    private JButton guardarButton;
    private JButton eliminarButton;
    private JButton limpiarButton;
    IClienteServicio clienteServicio;
    private DefaultTableModel tablaModeloClientes;
    private Integer idCliente;

    // Inyección de dependencias desde el constructor
    // Se realizó de esta manera, ya que cuando se crea el objeto de Form, es necesario tener información de los clientes
    // de la otra manera, tendríamos que tener otra implementación para poder cargar los clientes al momento de abrir la ventana.
    @Autowired
    public ZonaFitForm(ClienteServicio clienteServicio){
        this.clienteServicio = clienteServicio;
        iniciarForm();
        guardarButton.addActionListener(e -> guardarCliente());
        clientesTabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                cargarClienteSeleccionado();
            }
        });
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

        // Cargar el listado de los clientes
        listarClientes();
    }

    private void listarClientes(){
        this.tablaModeloClientes.setRowCount(0); // El conteo de los registros empieza en 0
        var clientes = this.clienteServicio.listarClientes();
        clientes.forEach(cliente -> {
            // Crear un renglon (Un objeto)
            Object[] renglonCliente = {
                    cliente.getId(),
                    cliente.getNombre(),
                    cliente.getApellido(),
                    cliente.getMembresia()
            };
            // Agregar el renglon creado a la tabla
            this.tablaModeloClientes.addRow(renglonCliente);
        });
    }

    private void guardarCliente(){
        if (nombreTexto.getText().equals("")){
            mostrarMensaje("Nombre requerido");
            nombreTexto.requestFocusInWindow();
            return;
        }
        if (apellidoTexto.getText().equals("")){
            mostrarMensaje("Apellido requerido");
            membresiaTexto.requestFocusInWindow();
            return;
        }
        if (membresiaTexto.getText().equals("")){
            mostrarMensaje("Membresia requerida");
            membresiaTexto.requestFocusInWindow();
            return;
        }
        // Recuperar los valores del formulario
        var nombre = nombreTexto.getText().strip();
        var apellido = apellidoTexto.getText().strip();
        var membresia = Integer.parseInt(membresiaTexto.getText().strip());
        // Crear el objeto de cliente
        var cliente = new Cliente(this.idCliente, nombre, apellido, membresia);

        // Insertar el nuevo cliente | actualizar cliente
        this.clienteServicio.guardarCliente(cliente);

        if(this.idCliente == null){
            mostrarMensaje("Cliente agregado correctamente");
        } else {
            mostrarMensaje("Cliente actualizado correctamente");
        }

        limpiarFormulario();
        listarClientes();
    }

    private void cargarClienteSeleccionado(){
        var renglon = clientesTabla.getSelectedRow();
        // -1 Significa que no se seleccionó ningun registro
        if(renglon != -1) {
            // Recuperar los datos de la tabla
            var id = clientesTabla.getModel().getValueAt(renglon, 0).toString();
            var nombre = clientesTabla.getModel().getValueAt(renglon, 1).toString();
            var apellido = clientesTabla.getModel().getValueAt(renglon, 2).toString();
            var membresia = clientesTabla.getModel().getValueAt(renglon, 3).toString();

            // Asignar los datos al formulario
            this.idCliente = Integer.parseInt(id);
            this.nombreTexto.setText(nombre);
            this.apellidoTexto.setText(apellido);
            this.membresiaTexto.setText(membresia);
        }
    }

    private void limpiarFormulario(){
        this.idCliente = null;
        this.nombreTexto.setText("");
        this.apellidoTexto.setText("");
        this.membresiaTexto.setText("");

        // Deseleccionar el registro de la tabla
        this.clientesTabla.getSelectionModel().clearSelection();
    }

    private void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
    }
}
