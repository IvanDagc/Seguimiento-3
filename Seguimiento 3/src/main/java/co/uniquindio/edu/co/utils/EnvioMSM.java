package co.uniquindio.edu.co.utils;

public class EnvioMSM {
    private String mensaje, numero;

    //Constructor
    public EnvioMSM(String mensaje, String numero) {
        this.mensaje = mensaje;
        this.numero = numero;
    }


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
