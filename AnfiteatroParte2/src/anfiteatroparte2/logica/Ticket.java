
package anfiteatroparte2.logica;


import java.util.Date;

/**
 *
 * @author benja
 */
public class Ticket {
    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private Date fechaCompra; //Date es para usar fechas, tambien esta LocalDate que es un poco más nuevo.
    private Date fechaValidez;

    //Constructor sin parámetros
    public Ticket() {
    }    
    
    //Contrusctor con parámetros
    public Ticket(int numero, int fila, int asiento, double precio, Date fechaCompra, Date fechaValidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaCompra = fechaCompra;
        this.fechaValidez = fechaValidez;
    }
    
    //Getters:

    public int getNumero() {
        return numero;
    }

    public int getFila() {
        return fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public Date getFechaValidez() {
        return fechaValidez;
    }
    
    //Setters:

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setFechaValidez(Date fechaValidez) {
        this.fechaValidez = fechaValidez;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaCompra=" + fechaCompra + ", fechaValidez=" + fechaValidez + '}';
    }
    
    
    
    
    
    
    
}
