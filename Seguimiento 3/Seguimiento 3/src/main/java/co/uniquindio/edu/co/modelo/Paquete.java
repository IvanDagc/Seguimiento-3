package co.uniquindio.edu.co.modelo;
import lombok.*;
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
public class Paquete {

    private double peso;
    private String descripcion;
    private double valorDeclarado;
}
