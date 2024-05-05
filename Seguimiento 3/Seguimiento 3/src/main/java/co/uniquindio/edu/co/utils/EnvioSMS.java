package co.uniquindio.edu.co.utils;
import co.uniquindio.edu.co.servicio.Notificacion;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.*;

@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor

public record EnvioSMS(String mensaje, String numero) implements Notificacion {
    public void crearConexion() {
        Twilio.init(
                "ACf7b8700ed5330c3c922cff8e5972f621",
                "598b6ccda46e492725960440bfb51980"
        );
    }
    @Override
    public void enviarNotificacion() {
        crearConexion();
        Message.creator(
                        new PhoneNumber(numero),
                        new PhoneNumber("+12563882092"),
                        mensaje)
                .create();
    }
}
