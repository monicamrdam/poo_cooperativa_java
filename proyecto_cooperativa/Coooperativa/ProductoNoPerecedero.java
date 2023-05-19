package Coooperativa;

/**
 * Write a description of class productoNoPerecedero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoNoPerecedero extends Producto
{
    private static double costeFinal;
    public ProductoNoPerecedero (String idProducto, String nombreProducto, int extensionHA, double rendimientoPorHa,
    double valorReferenciaSinIVA, boolean esPerecedero)
    {
        super(idProducto,nombreProducto, extensionHA, rendimientoPorHa,valorReferenciaSinIVA,esPerecedero);
    }

    @Override
    public double calcularCoste(double km, double kg){
        return costeFinal;
    }

}
