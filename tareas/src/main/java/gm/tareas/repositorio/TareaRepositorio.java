package gm.tareas.repositorio;

import gm.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

// Extiende de JpaRepository<Nombre de la entidad, Tipo de dato de la llave primaria>
public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {
}
