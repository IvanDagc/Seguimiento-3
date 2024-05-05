package co.uniquindio.edu.co.servicio;
import co.uniquindio.edu.co.modelo.enums.TipoEnvio;
import co.uniquindio.edu.co.modelo.Envio;
import co.uniquindio.edu.co.modelo.Paquete;
import co.uniquindio.edu.co.modelo.Persona;
import java.time.LocalDate;
import java.util.ArrayList;

public interface ServiciosEmpresa {
    Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes, TipoEnvio tipoEnvio) throws Exception;
    ArrayList<Envio> listarTodosEnvios();

    ArrayList<Envio> listarEnvios(LocalDate fecha);

    // Método para calcular el precio de un envío
    double calcularPrecio(Envio envio);

    // Método para generar un código de envío
    String generarCodigoEnvio(TipoEnvio tipoEnvio);

    // Método para registrar un cambio de estado en un envío
    void registrarCambioEstado(Envio envio, String nuevoEstado);

    // Método para enviar una notificación sobre el estado de un envío
    void enviarNotificacion(Envio envio, String mensaje);

    // Definir todos los demás métodos para el proyecto

}


