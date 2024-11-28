import java.util.Scanner;

public class SistemaDePagos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pagos pagos = new Pagos();

        while (true) {
            System.out.println("Seleccione el método de pago:");
            System.out.println("1. Tarjeta de Crédito");
            System.out.println("2. PayPal");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 3) {
                break;
            }

            System.out.print("Ingrese el titular: ");
            String titular = scanner.nextLine();
            System.out.print("Ingrese el número: ");
            String numero = scanner.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese la fecha de expiración (MM/YY): ");
                String fechaExpiracion = scanner.nextLine();
                System.out.print("Ingrese el código de seguridad: ");
                String codigoSeguridad = scanner.nextLine();

                TarjetaCredito tarjetaCredito = new TarjetaCredito(titular, numero, fechaExpiracion, codigoSeguridad);
                pagos.agregarMetodoPago(tarjetaCredito);
            } else if (opcion == 2) {
                System.out.print("Ingrese el correo electrónico: ");
                String correoElectronico = scanner.nextLine();

                PayPal payPal = new PayPal(titular, numero, correoElectronico);
                pagos.agregarMetodoPago(payPal);
            }
        }

        System.out.println("Información de métodos de pago:");
        pagos.mostrarInformacion();

        System.out.println("Realizando pagos:");
        pagos.realizarPagos();

        System.out.println("Cancelando pagos:");
        pagos.cancelarPagos();

        scanner.close();
    }
}


