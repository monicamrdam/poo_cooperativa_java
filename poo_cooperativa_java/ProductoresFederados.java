import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class PequeñosProductores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoresFederados extends Productores
{
    private final int limiteHa=5;  
    //Solo pueden tener un producto federado
    private String productoFederado;
    //Su tamaño esta definido por la suma de las ha de sus productores
    private List<ListaProductoresFederados> listaProductores = new ArrayList<ListaProductoresFederados>();
    
    
    
    public ProductoresFederados() {
        super();
    }

    public ProductoresFederados(String id, String nombreApellidos, String productoFederado) {
        super(id, nombreApellidos);
        this.productoFederado = productoFederado;
    }

    public String getProductorFederado() {
        return productoFederado;
    }

    private void setProductorFederado(String productoFederado) {
        this.productoFederado = productoFederado;
    }

    
    
    
    
   private void BuscarProductor() {
        System.out.println("Buscar Productor");
    }

}
