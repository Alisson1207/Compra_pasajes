package Compra_paquetes;

public class Normal extends Servicio {
    public Normal() {
    }

    public Normal(String seleccionarasiento, int espaciomaleta, Boolean maletaadicional) {
        super(seleccionarasiento, espaciomaleta, maletaadicional);
    }

    public Normal(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio, String seleccionarasiento, int espaciomaleta, Boolean maletaadicional) {
        super(numeroticket, asiento, ruta, nombrepasajero, tiposervicio, precio, seleccionarasiento, espaciomaleta, maletaadicional);
    }
}
