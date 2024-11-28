import java.util.ArrayList;

public class Notificaciones {
    private ArrayList<CanalNotificacion> canalesNotificacion;

    public Notificaciones() {
        this.canalesNotificacion = new ArrayList<>();
    }

    public void agregarCanalNotificacion(CanalNotificacion canalNotificacion) {
        canalesNotificacion.add(canalNotificacion);
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canalesNotificacion) {
            canal.enviarNotificacion();
        }
    }

    public void personalizarMensajes() {
        for (CanalNotificacion canal : canalesNotificacion) {
            if (canal instanceof Personalizable) {
                ((Personalizable) canal).personalizarMensaje();
            }
        }
    }

    public void mostrarInformacion() {
        for (CanalNotificacion canal : canalesNotificacion) {
            System.out.println("Usuario: " + canal.getUsuario());
            System.out.println("Mensaje: " + canal.getMensaje());
            if (canal instanceof CorreoElectronico) {
                CorreoElectronico correo = (CorreoElectronico) canal;
                System.out.println("Dirección de correo: " + correo.direccionCorreo);
            } else if (canal instanceof MensajeTexto) {
                MensajeTexto mensajeTexto = (MensajeTexto) canal;
                System.out.println("Número de teléfono: " + mensajeTexto.numeroTelefono);
            }
            System.out.println();
        }
    }
}

