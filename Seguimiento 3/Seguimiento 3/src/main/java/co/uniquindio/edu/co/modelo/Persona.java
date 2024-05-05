package co.uniquindio.edu.co.modelo;
import lombok.*;
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor

public class Persona {

    private String nombre;
    private String cedula;
    private String ciudad;
    private String direccion;
    private String telefono;
    private String correo;

}
