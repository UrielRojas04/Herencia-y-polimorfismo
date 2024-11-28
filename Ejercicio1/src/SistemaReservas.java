public class SistemaReservas {
    public static void main(String[] args) {
        Reservas reservas = new Reservas();

        VueloRegular vueloRegular1 = new VueloRegular("VR001", "Madrid", "Barcelona", "2023-11-01", 150, 100.0);
        VueloRegular vueloRegular2 = new VueloRegular("VR002", "Barcelona", "Valencia", "2023-11-02", 100, 120.0);
        VueloCharter vueloCharter1 = new VueloCharter("VC001", "Madrid", "Paris", "2023-11-03", 5000.0);

        reservas.agregarVuelo(vueloRegular1);
        reservas.agregarVuelo(vueloRegular2);
        reservas.agregarVuelo(vueloCharter1);

        System.out.println("Información de vuelos antes de aplicar promociones:");
        reservas.mostrarInformacion();

        reservas.aplicarPromociones();

        System.out.println("Información de vuelos después de aplicar promociones:");
        reservas.mostrarInformacion();

        System.out.println("Precio total de las reservas: " + reservas.calcularPrecioTotal());
    }
}

