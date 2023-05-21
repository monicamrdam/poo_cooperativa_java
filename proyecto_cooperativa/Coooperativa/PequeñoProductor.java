package Coooperativa;
import java.util.List;


/**
 * Write a description of class PequeñoProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PequeñoProductor extends Productor {
    private String nif;

    public PequeñoProductor( String telefonoProductor, String nombreProductor,String nif, List<Producto> productosVende) {
        super(telefonoProductor, nombreProductor, productosVende);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}

