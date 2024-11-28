public class CorreoElectronico extends CanalNotificacion implements Personalizable {
    public String direccionCorreo;

    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo) {
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion() {
        System.out.println("Enviando correo electrónico a: " + direccionCorreo);
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con éxito.");
    }

    @Override
    public void personalizarMensaje() {
        System.out.println("Personalizando mensaje de correo electrónico...");
        System.out.println("Usuario: " + usuario);
        System.out.println("Mensaje personalizado: " + mensaje);
    }
}

