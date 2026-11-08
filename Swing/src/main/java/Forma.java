import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma(){
        inicializarForma();

        // Action listener (Cuando se presiona el enter)
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });
        // Key listener (Cuando se escribe)
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cuando cerremos la ventana, se terminará la aplicación
        setSize(600,400); // Ancho - Alto en px
        setLocationRelativeTo(null); // Centrar la ventana
    }

    private void replicarTexto(){
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    public static void main(String[] args) {
        // FlatLightLaf
        FlatDarculaLaf.setup(); // Cambiar el look and feel a modo oscuro
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
