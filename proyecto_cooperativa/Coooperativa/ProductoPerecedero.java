package Coooperativa;


/**
 * Write a description of class productoPerecedero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoPerecedero extends Producto
{
   private static double costeFinal;
    public ProductoPerecedero (String idProducto, String nombreProducto, int extensionHA, double rendimientoPorHa,
    double valorReferenciaSinIVA, boolean esPerecedero)
    {
        super(idProducto,nombreProducto, extensionHA, rendimientoPorHa,valorReferenciaSinIVA,esPerecedero);
    }

    @Override
    public double calcularCoste(double km, double kg){
        return costeFinal;
    }
    
}
