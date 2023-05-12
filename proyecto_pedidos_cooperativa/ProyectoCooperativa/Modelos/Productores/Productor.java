package ProyectoCooperativa.Modelos.Productores;

/**
 * Write a description of class Productor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Productor
{

    private String nombre;
    private String telefono;

    public Productor(String nombre, String telefono)
    {
        this.nombre=nombre;      
        this.telefono = telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    @Override
    public String toString(){
        return "Nombre: "  + this.nombre +" / "+ "Telefono: " + this.telefono;
    }

    public abstract void limiteHa(Integer limiteHa);

}
