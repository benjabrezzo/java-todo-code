
package anfiteatroparte2;

import anfiteatroparte2.logica.Ticket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author benja
 */
public class AnfiteatroParte2 {

    
    public static void main(String[] args) {
        
        List<Ticket> listaTickets = new ArrayList<Ticket>();
        
        Ticket ticket1 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket2 = new Ticket(12, 2, 3, 1500, new Date(), new Date());
        Ticket ticket3 = new Ticket();
        
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(3200);
        ticket3.setFechaCompra(new Date());
        ticket3.setFechaValidez(new Date());
        
        listaTickets.add(ticket1);
        listaTickets.add(ticket2);
        listaTickets.add(ticket3);
        
        //Suma de precios:
        
        double suma = 0;
        
        for(Ticket tick : listaTickets){
            suma += tick.getPrecio();
        }
        
        System.out.println("La suma de precios es de: "+suma);
        
        //pedir fila al usuario
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la fila de la que desea ver tickets: ");
        int fila = read.nextInt();
        boolean bandera = false;
        
        
        for(Ticket tick : listaTickets){
            if(tick.getFila() == fila){
                System.out.println(tick.toString());
                bandera = true;
            }
        }
        
        if(!bandera){
            System.out.println("No se encontraron datos de la fila en cuestión.");
        }
    }
    
}
