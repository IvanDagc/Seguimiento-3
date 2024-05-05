package co.uniquindio.edu.co.modelo;
import co.uniquindio.edu.co.modelo.factory.RegistroEstado;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Envio {

    private Persona remitente;
    private Persona destinatario;
    private String tipoEnvio;
    private List<Paquete> paquetes;
    private List<RegistroEstado> historialEstados;

    // Método para generar código de envío
    private String generarCodigo(String tipoEnvio) {
        Random rand = new Random();
        String codigoBase = tipoEnvio.equals("nacional express") ? "31" : "21";
        return codigoBase + String.format("%04d", rand.nextInt(10000));
    }


}
