package co.uniquindio.edu.co.servicio;
import co.uniquindio.edu.co.modelo.Envio;
import co.uniquindio.edu.co.modelo.Paquete;
import co.uniquindio.edu.co.modelo.Persona;
import java.time.LocalDate;
import java.util.ArrayList;

public interface ServiciosEmpresa {
    <Envio> Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes, TipoEnvio tipoEnvio) throws Exception;

    ArrayList<Envio> listarTodosEnvios();

    ArrayList<Envio> listarEnvios(LocalDate fecha);

    // Definir todos los demás métodos para el proyecto
}


