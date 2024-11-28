public class PayPal extends MetodoPago implements Cancelable {
    public String correoElectronico;

    public PayPal(String titular, String numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Pago realizado con éxito.");
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con PayPal...");
        System.out.println("Titular: " + titular);
        System.out.println("Correo electrónico: " + correoElectronico);
        System.out.println("Pago cancelado con éxito.");
    }
}

