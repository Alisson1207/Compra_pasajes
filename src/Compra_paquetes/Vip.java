package Compra_paquetes;

public class Vip extends Servicio{
    String servicioadicional;
    Boolean espaciodosmaletas;
    Double precioextra;

    public Vip() {
    }

    public Vip(String servicioadicional, Boolean espaciodosmaletas, Double precioextra) {
        this.servicioadicional = servicioadicional;
        this.espaciodosmaletas = espaciodosmaletas;
        this.precioextra = precioextra;
    }

    public Vip(String seleccionarasiento, int espaciomaleta, Boolean maletaadicional, String servicioadicional, Boolean espaciodosmaletas, Double precioextra) {
        super(seleccionarasiento, espaciomaleta, maletaadicional);
        this.servicioadicional = servicioadicional;
        this.espaciodosmaletas = espaciodosmaletas;
        this.precioextra = precioextra;
    }

    public Vip(int numeroticket, String asiento, String ruta, String nombrepasajero, String tiposervicio, Double precio, String seleccionarasiento, int espaciomaleta, Boolean maletaadicional, String servicioadicional, Boolean espaciodosmaletas, Double precioextra) {
        super(numeroticket, asiento, ruta, nombrepasajero, tiposervicio, precio, seleccionarasiento, espaciomaleta, maletaadicional);
        this.servicioadicional = servicioadicional;
        this.espaciodosmaletas = espaciodosmaletas;
        this.precioextra = precioextra;
    }

    public String getServicioadicional() {
        return servicioadicional;
    }

    public void setServicioadicional(String servicioadicional) {
        this.servicioadicional = servicioadicional;
    }

    public Boolean getEspaciodosmaletas() {
        return espaciodosmaletas;
    }

    public void setEspaciodosmaletas(Boolean espaciodosmaletas) {
        this.espaciodosmaletas = espaciodosmaletas;
    }

    public Double getPrecioextra() {
        return precioextra;
    }

    public void setPrecioextra(Double precioextra) {
        this.precioextra = precioextra;
    }
}
