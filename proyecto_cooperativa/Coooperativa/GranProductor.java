package Coooperativa;
import java.util.List;


/**
 * Write a description of class GranProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GranProductor extends Productor {
    private String cif;

    public GranProductor(String telefonoProductor, String nombreProductor,String cif,  List<Producto> productosVende) {
        super(telefonoProductor, nombreProductor, productosVende);
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }
}
