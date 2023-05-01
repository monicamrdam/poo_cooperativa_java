package ProyectoCooperativa.Modelos.Productor;

/**
 * Write a description of class Productor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Productor
{
     protected String id;
    protected String nombreApellidos;
    
    
    public Productor() {
    }

    public Productor(String id, String nombreApellidos) {
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

}
