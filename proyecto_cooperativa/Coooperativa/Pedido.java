package Coooperativa;

/**
 * Write a description of class Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido {
    private String fecha;
    private Cliente cliente;
    private Producto producto;
    private double ofertaAplicada;
    private Productor productor;

    public Pedido(Productor productor) {
        this.productor = productor;
    }

    public Pedido(String fecha, Cliente cliente, Producto producto, double ofertaAplicada, Productor productor) {
        this.fecha = fecha;
        this.cliente = cliente;
        this.producto = producto;
        this.ofertaAplicada = ofertaAplicada;
        this.productor = productor;
    }

    public String getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public double getOfertaAplicada() {
        return ofertaAplicada;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setOfertaAplicada(double ofertaAplicada) {
        this.ofertaAplicada = ofertaAplicada;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    @Override
    public String toString() {
        if(fecha != null && cliente !=null)
        {
            return "Fecha: " + fecha + "\n" +
            "Cliente: " + cliente + "\n" +
            "Producto: " + producto + "\n" +
            "Oferta aplicada: " + ofertaAplicada + "\n" +
            "Productor: " + productor;
        }
        else
        {
            return "Productor: " + productor ;
        }
    }

}