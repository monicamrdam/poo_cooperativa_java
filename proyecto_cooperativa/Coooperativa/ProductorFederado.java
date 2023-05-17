package Coooperativa;
import java.util.List;


/**
 * Write a description of class ProductorFederado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductorFederado extends Productor {
    private String nombreProductoFederado;
    private List<PequeñoProductor> listaPequeñosProductores;

    public ProductorFederado(String nombreProductoFederado, List<PequeñoProductor> listaPequeñosProductores,
                             String telefonoProductor, String nombreProductor, List<Producto> productosVende) {
        super(telefonoProductor, nombreProductor, productosVende);
        this.nombreProductoFederado = nombreProductoFederado;
        this.listaPequeñosProductores = listaPequeñosProductores;
    }

    public String getNombreProductoFederado() {
        return nombreProductoFederado;
    }

    public List<PequeñoProductor> getListaPequeñosProductores() {
        return listaPequeñosProductores;
    }
}

