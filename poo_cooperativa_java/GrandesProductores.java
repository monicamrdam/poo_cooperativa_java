import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class PequeñosProductores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GrandesProductores extends Productores
{
    private final int limiteHa=5;  
    private double ha;
    //No existe límite
    private static List<Producto> productos = new ArrayList<Producto>();  

    public GrandesProductores() {
        super();
    }

    public GrandesProductores(String id, String nombreApellidos, double ha) {
        super(id, nombreApellidos);
        this.ha = ha;
    }

    public double getHa() {
        return ha;
    }

    private void setHa(double ha) {
        this.ha = ha;
    }

    
    
    
    
  private void BuscarProductor() {
        System.out.println("Buscar Productor");
    }

}
