package ProyectoCooperativa.Modelos.Productor;
import ProyectoCooperativa.Modelos.Producto.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class GranProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GranProductor extends Productor

{
    private final int limiteHa=5;  
    private double ha;
    //No existe límite
    private static List<Producto> productos = new ArrayList<Producto>();  

    public GranProductor() {
        super();
    }

    public GranProductor(String id, String nombreApellidos, double ha) {
        super(id, nombreApellidos);
        this.ha = ha;
    }

    public double getHa() {
        return ha;
    }

    private void setHa(double ha) {
        this.ha = ha;
    }

}
