package co.uniquindio.edu.co.modelo;
import co.uniquindio.edu.co.modelo.enums.TipoEnvio;
import co.uniquindio.edu.co.modelo.factory.EnvioEstandar;
import co.uniquindio.edu.co.modelo.factory.EnvioExpress;
import co.uniquindio.edu.co.servicio.CreacionEnvio;
import co.uniquindio.edu.co.servicio.ServiciosEmpresa;

import java.time.LocalDate;
import java.util.ArrayList;

public class EmpresaEnvios implements ServiciosEmpresa {

    // ArrayList para almacenar envíos
    ArrayList<Envio> envios = new ArrayList<>();

    // ArrayList para almacenar personas
    ArrayList<Persona> personas = new ArrayList<>();

    // ArrayList para almacenar facturas
    ArrayList<Factura> facturas = new ArrayList<>();
    @Override
    public Envio crearOrdenEnvio(Persona remitente, Persona destinatario, ArrayList<Paquete> paquetes, TipoEnvio tipoEnvio) throws Exception {

        CreacionEnvio creacionEnvio;

        if (tipoEnvio == TipoEnvio.ESTANDAR) {
            creacionEnvio = (CreacionEnvio) new EnvioEstandar();
        } else {
            creacionEnvio = (CreacionEnvio) new EnvioExpress();
        }

        Envio envio = creacionEnvio.crearOrdenEnvio(remitente, destinatario, paquetes);
        float valor = creacionEnvio.calcularCostoEnvio(envio);
        Factura factura = creacionEnvio.crearFactura(envio, valor);


        // Agregar el remitente y destinatario a la lista de personas
        envios.add(envio);
        facturas.add(factura);


        return envio;
    }

    @Override
    public ArrayList<Envio> listarTodosEnvios() {
        return null;
    }

    @Override
    public ArrayList<Envio> listarEnvios(LocalDate fecha) {
        return null;
    }

    @Override
    public double calcularPrecio(Envio envio) {
        return 0;
    }

    @Override
    public String generarCodigoEnvio(TipoEnvio tipoEnvio) {
        return null;
    }

    @Override
    public void registrarCambioEstado(Envio envio, String nuevoEstado) {

    }

    @Override
    public void enviarNotificacion(Envio envio, String mensaje) {

    }


}