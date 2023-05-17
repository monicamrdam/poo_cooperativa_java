package Coooperativa;


/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente {
    private String nombre;
    private String telefono;
    private double cantidadComprada;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.cantidadComprada = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public double getCantidadComprada() {
        return cantidadComprada;
    }

    public void comprarProducto(double cantidad) {
        cantidadComprada += cantidad;
    }
     @Override
    public String toString() {
        return "Cliente: " + nombre + ", Teléfono: " + telefono + ", Cantidad comprada: " + cantidadComprada;
    }
}
