package ProyectoCooperativa.Modelos.Productor;
import ProyectoCooperativa.Modelos.Producto.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class PequeñoProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PequeñoProductor extends Productor
{
    private final int limiteHa=5;  
    private double ha;
    //Maximo 5 productos
    private static List<Producto> productos; 

    public PequeñoProductor() {
        super();
        productos = new ArrayList<>();
    }

    public PequeñoProductor(String id, String nombreApellidos, double ha, List<Producto> productos) {
        super(id, nombreApellidos);
        this.ha = ha;
        this.productos= productos;
    }

    public double getHa() {
        return ha;
    }

    private void setHa(double ha) {
        this.ha = ha;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    private void setProductos(List <Producto> productos) {
        this.productos = productos;
    }


}
