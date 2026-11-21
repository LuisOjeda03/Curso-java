package gm.tareas.servicio;

import gm.tareas.modelo.Tarea;

import java.util.List;

public interface ITareaServicio {
    public List<Tarea> listarTareas();

    public Tarea buscarTareaPorId(Integer idTarea);

    // Metodo utilizado para guardar y actualizar tarea
    public void guardarTarea(Tarea tarea);

    public void eliminarTarea(Tarea tarea);
}
