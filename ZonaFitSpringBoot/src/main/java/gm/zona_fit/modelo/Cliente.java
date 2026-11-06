package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity             // Vamos a utilizar JPA con la implementación de Hibernate
@Data               // Con esta anotación de lombok, se genera de manera automatica cada get y set
@NoArgsConstructor  // Constructor vacio
@AllArgsConstructor // Constructor con todos los argumentos
@ToString
@EqualsAndHashCode
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; // Ahora es un objeto, por lo que puede ser null, al ser null, es mas facil para JPA

    private String nombre;
    private String apellido;
    private Integer membresia;
}