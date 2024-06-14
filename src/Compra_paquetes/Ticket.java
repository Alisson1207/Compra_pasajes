package Compra_paquetes;

public class Ticket {
    int numeroticket;
    String asiento;
    String ruta;
    String nombrepasajero;
    String tiposervicio;
    Double precio;

    //Constructores

    public Ticket() {
    }

    public Ticket(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio) {
        this.numeroticket = numeroticket;
        this.asiento = asiento;
        this.ruta = ruta;
        this.nombrepasajero = nombrepasajero;
        this.tiposervicio = tiposervicio;
        this.precio = precio;
    }

    public int getNumeroticket() {
        return numeroticket;
    }

    public void setNumeroticket(int numeroticket) {
        this.numeroticket = numeroticket;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombrepasajero() {
        return nombrepasajero;
    }

    public void setNombrepasajero(String nombrepasajero) {
        this.nombrepasajero = nombrepasajero;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
