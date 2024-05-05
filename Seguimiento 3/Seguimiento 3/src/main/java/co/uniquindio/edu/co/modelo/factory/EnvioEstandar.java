package co.uniquindio.edu.co.modelo.factory;

import co.uniquindio.edu.co.modelo.Envio;
import co.uniquindio.edu.co.modelo.Factura;
import co.uniquindio.edu.co.modelo.Paquete;
import co.uniquindio.edu.co.modelo.Persona;
import co.uniquindio.edu.co.servicio.CreacionEnvio;

import java.util.ArrayList;

public class EnvioEstandar implements CreacionEnvio {
    @Override
    public Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes) {
        return null;
    }

    @Override
    public Factura crearFactura(Envio envio, float subtotal) {
        return null;
    }

    @Override
    public float calcularCostoEnvio(Envio envio) {
        return 0;
    }
}
