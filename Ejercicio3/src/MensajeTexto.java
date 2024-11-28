public class MensajeTexto extends CanalNotificacion implements Personalizable {
    public String numeroTelefono;

    public MensajeTexto(String usuario, String mensaje, String numeroTelefono) {
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando mensaje de texto a: " + numeroTelefono);
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Mensaje de texto enviado con éxito.");
    }

    @Override
    public void personalizarMensaje() {
        System.out.println("Personalizando mensaje de texto...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje personalizado: " + mensaje);
    }
}

