package gm.tareas.presentacion;

import gm.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemasTareasFx extends Application {

    private ConfigurableApplicationContext applicationContext;

//    public static void main(String[] args) {
//
//    }

    @Override
    public void init(){
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    // Inicializar la app de JavaFX
    @Override
    public void start(Stage stage) throws Exception {
        // Cargar el archivo fxml
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Scene escena = new Scene(loader.load());
        stage.setScene(escena);
        stage.show();
    }

    // Cuando se cierra la ventana se ejecuta el metodo
    public void stop(){
        applicationContext.close();
        Platform.exit();
    }
}
