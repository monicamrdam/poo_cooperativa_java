package ProyectoCooperativa.Modelos.Clientes;

/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Cliente
{
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono)
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
        return "Nombre: "  + this.nombre +" "+ "Telefono: " + this.telefono;
    }
    public abstract void cantidadAdquirida(Double cantidad);

}
