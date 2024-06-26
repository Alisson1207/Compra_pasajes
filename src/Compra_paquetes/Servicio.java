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


    @Override
    public void imprimirDatos() {
        super.imprimirDatos();
        System.out.println("Tipo de Servicio: " + tiposervicio);
        System.out.println("Espacio de Maleta: " + espaciomaleta);
        System.out.println("Maleta Adicional: " + (maletaadicional ? "Sí" : "No"));
    }

    
    @Override
    public double calcularPrecio() {
        double precioBase = super.calcularPrecio();
        double costoAdicionalMaleta = espaciomaleta > 1 ? 10.0 : 0.0; // Ejemplo adicional de costo por maleta
        return precioBase + precioadicional;
    }
}

