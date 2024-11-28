import java.util.ArrayList;

public class Pagos {
    private ArrayList<MetodoPago> metodosPago;

    public Pagos() {
        this.metodosPago = new ArrayList<>();
    }

    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }

    public void realizarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            metodoPago.realizarPago();
        }
    }

    public void cancelarPagos() {
        for (MetodoPago metodoPago : metodosPago) {
            if (metodoPago instanceof Cancelable) {
                ((Cancelable) metodoPago).cancelarPago();
            }
        }
    }

    public void mostrarInformacion() {
        for (MetodoPago metodoPago : metodosPago) {
            System.out.println("Titular: " + metodoPago.getTitular());
            System.out.println("Número: " + metodoPago.getNumero());
            if (metodoPago instanceof TarjetaCredito) {
                TarjetaCredito tarjeta = (TarjetaCredito) metodoPago;
                System.out.println("Fecha de expiración: " + tarjeta.fechaExpiracion);
                System.out.println("Código de seguridad: " + tarjeta.codigoSeguridad);
            } else if (metodoPago instanceof PayPal) {
                PayPal paypal = (PayPal) metodoPago;
                System.out.println("Correo electrónico: " + paypal.correoElectronico);
            }
            System.out.println();
        }
    }
}

