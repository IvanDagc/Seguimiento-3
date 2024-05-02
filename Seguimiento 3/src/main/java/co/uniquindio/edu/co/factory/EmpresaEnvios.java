package co.uniquindio.edu.co.factory;
import co.uniquindio.edu.co.modelo.Envio;
import co.uniquindio.edu.co.modelo.Factura;
import co.uniquindio.edu.co.modelo.Paquete;
import co.uniquindio.edu.co.modelo.Persona;
import co.uniquindio.edu.co.servicio.CreacionEnvio;
import java.util.ArrayList;

public class EmpresaEnvios {

    @Override
    public Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes, TipoEnvio tipoEnvio) throws Exception {


        CreacionEnvio creacionEnvio;


        if(tipoEnvio == TipoEnvio.ESTANDAR) {
            creacionEnvio = new EnvioEstandar();
        }else{
            creacionEnvio = new EnvioExpress();
        }


        Envio envio = creacionEnvio.crearOrdenEnvio(remitente, destinatario, paquetes);
        float valor = creacionEnvio.calcularCostoEnvio(envio);
        Factura factura = creacionEnvio.crearFactura(envio, valor);


        // Agregar el remitente y destinatario a la lista de personas
        envios.add(envio);
        facturas.add(factura);


        return envio;
    }


}
