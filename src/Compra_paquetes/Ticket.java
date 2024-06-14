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

    // Métodos
    public abstract double calcularCosto();

    // Getters y Setters
    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double calcularPrecio() {
        return ruta.getPrecio();
    }
// Método para imprimir los datos del ticket
    public void imprimirDatos() {
        System.out.println("Datos del ticket:");
        System.out.println("Ruta: " + ruta.getRuta() + " - " + ruta.getDestino());
        System.out.println("Pasajero: " + pasajero.getPasajero() + " (" + pasajero.getDocumento() + ")");
        System.out.println("Precio Base: $" + calcularPrecio());
    }
}
}
