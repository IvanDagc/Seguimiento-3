package co.uniquindio.edu.co.servicio;
import co.uniquindio.edu.co.modelo.enums.TipoEnvio;
import co.uniquindio.edu.co.modelo.Envio;
import co.uniquindio.edu.co.modelo.Factura;
import co.uniquindio.edu.co.modelo.Paquete;
import co.uniquindio.edu.co.modelo.Persona;
import java.util.ArrayList;

public interface CreacionEnvio {
    Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes);

    Factura crearFactura(Envio envio, float subtotal);

    float calcularCostoEnvio(Envio envio);

    //Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes, TipoEnvio tipoEnvio) throws Exception;
}


