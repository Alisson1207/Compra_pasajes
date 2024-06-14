package Compra_paquetes;

public class Pasajero extends Ticket{
    String nombre;

    public Pasajero() {
    }

    public Pasajero(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio, String nombre) {
        super(numeroticket, asiento, ruta, nombrepasajero, tiposervicio, precio);
        this.nombre = nombre;
    }
    
    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo de Servicio: " + tiposervicio);
        System.out.println("Espacio de Maleta: " + espaciomaleta);
        System.out.println("Maleta Adicional: " + (maletaadicional ? "Sí" : "No"));
    }
}
