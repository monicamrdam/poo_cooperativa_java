import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Productores here.
 * La clase Productores, describe a los productores; que van a ser cualquier actor que proporciona a la 
empresa un determinado producto, y que cobrará por el mismo el precio que se estipule
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productores
{
    protected String id;
    protected String nombreApellidos;
    
    
    public Productores() {
    }

    public Productores(String id, String nombreApellidos) {
        this.id = id;
        this.nombreApellidos = nombreApellidos;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getNombreApellidos() {
        return nombreApellidos;
    }

    private void setNombreApellidos(String nombreApellidos) {
        this.nombreApellidos = nombreApellidos;
    }


    private void BuscarProductor() {
        System.out.println("Buscar Productor");
    }

}
