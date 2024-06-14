//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import Ruta;
import Pasajero;
import Normal;
import Vip;
import Ticket;
public class Main {

    public static void main(String[] args) {
        // Instanciar al menos 5 objetos con valores nulos y setear atributos con valores quemados
        Ruta ruta1 = new Ruta();
        ruta1.setOrigen("Quito");
        ruta1.setDestino("Guayaquil");
        ruta1.setPrecioBase(20.0);

        Ruta ruta2 = new Ruta();
        ruta2.setOrigen("Quito");
        ruta2.setDestino("Tulcán");
        // Precio base quedará nulo por defecto

        Pasajero pasajero1 = new Pasajero();
        pasajero1.setId(1);
        pasajero1.setNombre("Juan Pérez");
        pasajero1.setDocumento("1234567890");

        Pasajero pasajero2 = new Pasajero();
        pasajero2.setId(2);
        pasajero2.setNombre("María López");
        pasajero2.setDocumento("0987654321");

        Normal ticketNormal1 = new Normal();
        ticketNormal1.setRuta(ruta1);
        ticketNormal1.setPasajero(pasajero1);
        ticketNormal1.setSeleccionAsiento("Ventana");
        ticketNormal1.setEspacioMaleta(1);
        ticketNormal1.setMaletaAdicional(false);

        Vip ticketVIP1 = new Vip();
        ticketVIP1.setRuta(ruta2);
        ticketVIP1.setPasajero(pasajero2);
        ticketVIP1.setSeleccionAsiento("Pasillo");
        ticketVIP1.setEspacioMaleta(2);
        ticketVIP1.setMaletaAdicional(true);

        // Mostrar información de los objetos con valores nulos y seteados
        System.out.println("Información de objetos con valores nulos y seteados:");
        System.out.println("--------------------------------------------------");
        System.out.println("Ruta 1: " + ruta1);
        System.out.println("Ruta 2: " + ruta2);
        System.out.println("Pasajero 1: " + pasajero1);
        System.out.println("Pasajero 2: " + pasajero2);
        System.out.println("Ticket Normal 1: " + ticketNormal1);
        System.out.println("Ticket VIP 1: " + ticketVIP1);

        // Instanciar al menos 5 objetos con valores iniciales
        Ruta ruta3 = new Ruta("Quito", "Puyo", 15.0);
        Ruta ruta4 = new Ruta("Quito", "Riobamba", 17.5);

        Pasajero pasajero3 = new Pasajero(3, "Pedro Ramírez", "1357924680");
        Pasajero pasajero4 = new Pasajero(4, "Ana Gómez", "2468013579");

        Normal ticketNormal2 = new Normal(ruta3, pasajero3, "Adelante", 1, true, "Normal");
        Vip ticketVIP2 = new Vip(ruta4, pasajero4, "Ventana", 2, false, "VIP", 0.3);

        // Mostrar información de los objetos con valores iniciales
        System.out.println("\nInformación de objetos con valores iniciales:");
        System.out.println("--------------------------------------------");
        System.out.println("Ruta 3: " + ruta3);
        System.out.println("Ruta 4: " + ruta4);
        System.out.println("Pasajero 3: " + pasajero3);
        System.out.println("Pasajero 4: " + pasajero4);
        System.out.println("Ticket Normal 2: " + ticketNormal2);
        System.out.println("Ticket VIP 2: " + ticketVIP2);
    }
}