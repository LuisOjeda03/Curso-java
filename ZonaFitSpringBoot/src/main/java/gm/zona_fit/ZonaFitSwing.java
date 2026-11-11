package gm.zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.gui.ZonaFitForm;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class ZonaFitSwing {
    public static void main(String[] args) {
        // Configuramos el modo oscuro
        FlatDarculaLaf.setup();

        // Instanciar la fabrica de Spring
        ConfigurableApplicationContext contextoSpring =
                new SpringApplicationBuilder(ZonaFitSwing.class)
                        .headless(false) // false ya que es una app de escritorio
                        .web(WebApplicationType.NONE) // Para evitar que se ejecute como una app web
                        .run(args);

        // Crear un objeto de Swing
        SwingUtilities.invokeLater(() -> {
            ZonaFitForm zonaFitForm = contextoSpring.getBean(ZonaFitForm.class);
            zonaFitForm.setVisible(true);
        });
    }
}