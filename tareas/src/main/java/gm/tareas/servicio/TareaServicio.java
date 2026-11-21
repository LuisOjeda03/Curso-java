package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;
import gm.tareas.repositorio.TareaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// Se agrega la anotación de service para que pueda ser un componente de Spring,
// de esa manera puede participar en la fabrica de Spring
@Service
public class TareaServicio implements ITareaServicio {

    @Autowired
    private TareaRepositorio tareaRepositorio;

    @Override
    public List<Tarea> listarTareas() {
        return this.tareaRepositorio.findAll();
    }

    @Override
    public Tarea buscarTareaPorId(Integer idTarea) {
        // .orElse significa que, en caso de no encontrar el objeto, regresa un nulo
        return this.tareaRepositorio.findById(idTarea).orElse(null);
    }

    @Override
    public void guardarTarea(Tarea tarea) {
        this.tareaRepositorio.save(tarea);
    }

    @Override
    public void eliminarTarea(Tarea tarea) {
        this.tareaRepositorio.delete(tarea);
    }
}