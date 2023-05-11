package ProyectoCooperativa;
import ProyectoCooperativa.Modelos.Pedidos.*;
import ProyectoCooperativa.Modelos.Clientes.*;

/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooperativa
{
    private static Cliente c1; 
    private static Cliente c2;
    private static Cliente c3;

    // class DetallesPedido(String fecha, Cliente cliente)
    private static DetallePedido dp1; 
    private static DetallePedido dp2; 
    private static DetallePedido dp3; 

    //class GestionPedido (TreeMap <Integer (idPedido),DetallePedido>)
    private static GestionPedido gp=new GestionPedido();

    private static void cargarDatos(){

        c1 = new Distribuidor("Venta y Distribucion", "000");
        c2 = new Distribuidor("Productos Ecológicos", "000");
        c3 = new Distribuidor("Spirosa", "000");

        dp1= new DetallePedido("22-04-2023", c1);
        dp2= new DetallePedido("23-04-2023",c2);
        dp3= new DetallePedido("24-04-2023",c3);

        gp.agregarPedido(dp1);
        gp.agregarPedido(dp2);
    }

    public static void main (String []args){
        cargarDatos();
        System.out.println(dp1.getFecha());
        System.out.println(dp1.getCliente());

        gp.cantidadPedidos();

        System.out.println(gp.getPedido(0).getCliente()); 
        gp.borrarPedido(0);
        gp.cantidadPedidos();

        System.out.println(gp.buscarPedido(1));
    }


}
