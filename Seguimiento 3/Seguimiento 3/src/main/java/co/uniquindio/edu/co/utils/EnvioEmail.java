package co.uniquindio.edu.co.utils;
import co.uniquindio.edu.co.servicio.Notificacion;
import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;
import lombok.*;
@Builder
@ToString
@Setter
@Getter
@AllArgsConstructor

public class EnvioEmail implements Notificacion {
    private String destinatario, asunto, mensaje;

    private Session crearSesion() {
        
        // Se definen las credenciales de la cuenta de correo
        final String username = "juanantonioperezgonzales774@gmail.com";
        final String password = "3105454000*JA";
        
        // Se configuran las propiedades de la conexión
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        
        // Se crea un objeto de tipo Authenticator
        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password.toCharArray());
            }
        };
        
        // Se crea la sesión
        return Session.getInstance(props);
    }

    @Override
    public void enviarNotificacion() {
        
        Session session = crearSesion();
        
        try {
            // Se crea un objeto de tipo Message
            Message message = new MimeMessage(session);
            
            // Se configura el remitente
            message.setFrom(new InternetAddress( "no-reply@email.com" ));
            
            // Se configura el destinatario
            message.setRecipients( Message.RecipientType.TO, InternetAddress.parse(destinatario));
            
            // Se configura el asunto del mensaje
            message.setSubject( asunto );
            
            // Se configura el mensaje a enviar
            message.setText( mensaje );
            
            // Se envía el mensaje
            Transport.send(message);
            
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }


    }

}
