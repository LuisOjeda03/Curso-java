import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarButton;

    public LoginForm(){
        inicializarForma();
        enviarButton.addActionListener(e -> validar());
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null); // Centrar ventana
    }

    private void validar(){
        // Leer los valores del campo de texto
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());

        if(usuario.equals("root") && password.equals("admin"))
            mostrarMensaje("Bienvenido!");
        else
            mostrarMensaje("Usuario o contraseña incorrectos");
    }

    private void mostrarMensaje(String mensaje){
        // Se pasa this, ya que debemos de indicar la ventana
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Look and feel a modo oscuro
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
