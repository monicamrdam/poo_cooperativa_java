package ProyectoCooperativa.Modelos.Productor;


/**
 * Write a description of class ListaProductoresFederados here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ListaProductoresFederados extends Productor
{
    private double haProductofederado;
    
    public ListaProductoresFederados() {
        super();
    }

    public ListaProductoresFederados(String id, String nombreApellidos, double haProductofederado) {
        super(id, nombreApellidos);
        this.haProductofederado = haProductofederado;
    }
    
    
}

