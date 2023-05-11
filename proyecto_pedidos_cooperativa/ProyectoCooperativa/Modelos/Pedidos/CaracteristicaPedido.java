package ProyectoCooperativa.Modelos.Pedidos;

/**
 * Write a description of class CaracteristicaPedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaracteristicaPedido
{
    private static Double cantidadPedida;
    private static String nombreProducto;

    public CaracteristicaPedido(Double cantidadPedida,String nombreProducto)
    {
        this.cantidadPedida = cantidadPedida;
        this.nombreProducto=nombreProducto;
    }

    public Double getcantidadPedida(){
        return cantidadPedida;
    }

    public String getnombreProducto(){
        return nombreProducto;
    }

    @Override
    public String toString(){
        return "Cantidad pedida: " + this.cantidadPedida+" / "+ " Nombre del producto: "+this.nombreProducto;
    }
}
