package Coooperativa;
import java.util.List;


/**
 * Write a description of class ProductorFederado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductorFederado  {
    private String nombreProductoFederado;
    private List<PequeñoProductor> listaPequeñosProductores;

    public ProductorFederado(String nombreProductoFederado, List<PequeñoProductor> listaPequeñosProductores) {
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

