package Compra_paquetes;

public class Ruta extends Ticket{
    String origen;
    String destino;
    Double preciobase;

    public Ruta() {
    }

    public Ruta(Double preciobase, String destino, String origen) {
        this.preciobase = preciobase;
        this.destino = destino;
        this.origen = origen;
    }

    public Ruta(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio, Double preciobase, String destino, String origen) {
        super(numeroticket, asiento, ruta, nombrepasajero, tiposervicio, precio);
        this.preciobase = preciobase;
        this.destino = destino;
        this.origen = origen;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getPreciobase() {
        return preciobase;
    }

    public void setPreciobase(Double preciobase) {
        this.preciobase = preciobase;
    }
}
