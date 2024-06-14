package Compra_paquetes;

public class Servicio extends Ticket {
    String seleccionarasiento;
    int espaciomaleta;
    Boolean maletaadicional;

    public Servicio() {
    }

    public Servicio(String seleccionarasiento, int espaciomaleta, Boolean maletaadicional) {
        this.seleccionarasiento = seleccionarasiento;
        this.espaciomaleta = espaciomaleta;
        this.maletaadicional = maletaadicional;
    }

    public Servicio(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio, String seleccionarasiento, int espaciomaleta, Boolean maletaadicional) {
        super(numeroticket, asiento, ruta, nombrepasajero, tiposervicio, precio);
        this.seleccionarasiento = seleccionarasiento;
        this.espaciomaleta = espaciomaleta;
        this.maletaadicional = maletaadicional;
    }
}

