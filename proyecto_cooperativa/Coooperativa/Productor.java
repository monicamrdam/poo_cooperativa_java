package Coooperativa;
import java.util.List;


/**
 * Write a description of class Productor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Productor {
    private String telefonoProductor;
    private String nombreProductor;
    private List<Producto> productosVende;

    public Productor(String telefonoProductor, String nombreProductor, List<Producto> productosVende) {
        this.telefonoProductor = telefonoProductor;
        this.nombreProductor = nombreProductor;
        this.productosVende = productosVende;
    }

    public String getTelefonoProductor() {
        return telefonoProductor;
    }

    public String getNombreProductor() {
        return nombreProductor;
    }

    public List<Producto> getProductosVende() {
        return productosVende;
    }
}
