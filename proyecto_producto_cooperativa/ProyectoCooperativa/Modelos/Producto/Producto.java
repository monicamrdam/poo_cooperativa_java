package ProyectoCooperativa.Modelos.Producto;


/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto
{
     private int idProducto;
    private String nombreProducto;
    private double numHectareasProducto;
    //centimos por kg
    private double precioProductoSinIVa;
    //en el que se indica cuántas toneladas se obtienen por hectárea de producto 
    // por ejemplo 2,5 toneladas de algodón por cada hectárea
    private double rendimientoPorHa;

    public Producto(){

    }

    public Producto(int idProducto, String nombreProducto, double numHectareasProducto,double precioProductoSinIVa,double rendimientoPorHa){
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.numHectareasProducto = numHectareasProducto;
        this.precioProductoSinIVa = precioProductoSinIVa;
        this.rendimientoPorHa = rendimientoPorHa;
    }

    public int getIdProducto() {
        return idProducto;
    }

    private void setId(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    private void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getNumHectareasProducto() {
        return numHectareasProducto;
    }

    private void setNumHectareasProducto(double numHectareasProducto) {
        this.numHectareasProducto = numHectareasProducto;
    }

    public double getPrecioProductoSinIVa() {
        return precioProductoSinIVa;
    }

    private void setPrecioProductoSinIVa(double precioProductoSinIVa) {
        this.precioProductoSinIVa = precioProductoSinIVa;
    }

    public double getRendimientoPorHa() {
        return rendimientoPorHa;
    }

    private void setRendimientoPorHa(double rendimientoPorHa) {
        this.rendimientoPorHa = rendimientoPorHa;
    }

    
     @Override
    public String toString() {
        return "Id producto: " + this.idProducto + " Nombre producto: "+ this.nombreProducto + " Numero Hectareas Producto "+ this.numHectareasProducto  + " Precio Producto Sin Iva: "+ this.precioProductoSinIVa + " Rendimiento por Hectarea: "+ this.rendimientoPorHa;
    }
}
