import java.util.Scanner;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Notificaciones notificaciones = new Notificaciones();

        while (true) {
            System.out.println("Seleccione el canal de notificación:");
            System.out.println("1. Correo Electrónico");
            System.out.println("2. Mensaje de Texto");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 3) {
                break;
            }

            System.out.print("Ingrese el usuario: ");
            String usuario = scanner.nextLine();
            System.out.print("Ingrese el mensaje: ");
            String mensaje = scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese la dirección de correo: ");
                String direccionCorreo = scanner.nextLine();

                CorreoElectronico correoElectronico = new CorreoElectronico(usuario, mensaje, direccionCorreo);
                notificaciones.agregarCanalNotificacion(correoElectronico);
            } else if (opcion == 2) {
                System.out.print("Ingrese el número de teléfono: ");
                String numeroTelefono = scanner.nextLine();

                MensajeTexto mensajeTexto = new MensajeTexto(usuario, mensaje, numeroTelefono);
                notificaciones.agregarCanalNotificacion(mensajeTexto);
            }
        }

        System.out.println("Información de canales de notificación:");
        notificaciones.mostrarInformacion();

        System.out.println("Personalizando mensajes:");
        notificaciones.personalizarMensajes();

        System.out.println("Enviando notificaciones:");
        notificaciones.enviarNotificaciones();

        scanner.close();
    }
}

