package co.uniquindio.edu.co.modelo;
import lombok.*;
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor
public class Factura {

    private String codigoEnvio;
    private double subtotal;
    private double total;
}
