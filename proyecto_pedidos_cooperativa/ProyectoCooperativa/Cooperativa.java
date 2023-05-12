package ProyectoCooperativa;
import ProyectoCooperativa.Modelos.Pedidos.*;
import ProyectoCooperativa.Modelos.Clientes.*;
import ProyectoCooperativa.Modelos.Productos.*;
import ProyectoCooperativa.Modelos.Productores.*;
import ProyectoCooperativa.Interfaces.*;
import ProyectoCooperativa.Controladores.*;

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
    private static Cliente c4; 
    private static Cliente c5;
    private static Cliente c6;

    private static CaracteristicaPedido cp1;
    private static CaracteristicaPedido cp2;
    private static CaracteristicaPedido cp3;

    
    private static Producto p1;
    private static Producto p2;
    private static Producto p3;
    
    private static PequeñoProductor Juan;
    private static PequeñoProductor Sonia;
    private static ProductorFederado Algodon;
    
    
    
    // class DetallesPedido(String fecha, Cliente cliente, CaracteristicasPedido cp, Producto p, Productores productor)
    private static DetallePedido dp1; 
    private static DetallePedido dp2; 
    private static DetallePedido dp3; 

    //class GestionPedido (TreeMap <Integer (idPedido),DetallePedido>)
    private static GestionPedido gp=new GestionPedido();

    private static void cargarDatos(){

        c1 = new Distribuidor("Venta y Distribucion", "600.006.006");
        c2 = new Distribuidor("Productos Ecológicos", "600.006.007");
        c3 = new Distribuidor("Spirosa", "600.006.008");
        c4 = new ConsumidorFinal("Venta y Distribucion", "600.006.009");
        c5 = new ConsumidorFinal("Productos Ecológicos", "600.006.010");
        c6 = new ConsumidorFinal("Spirosa", "600.006.011");

        cp1=new CaracteristicaPedido(500.0, "pepino");
        cp2=new CaracteristicaPedido(1000.0, "lechuga");
        cp3=new CaracteristicaPedido(1000.0, "tomate");
        
        
        p1= new Producto("naranjos", 1.5, 80,2.5);
        p2=new Producto("algodón", 0.5, 60,3.5);
        p3= new Producto("melocotón", 1.5, 40,3.5);
        
        Juan = new PequeñoProductor("Juan P", "666.666.001");
        Sonia = new PequeñoProductor("Sonia R", "666.666.002");
        Algodon = new ProductorFederado("Algodon S.A.", "666.666.003");
        
        
        

        dp1= new DetallePedido("22-04-2023",c1,cp1,p1,Juan);
        dp2= new DetallePedido("23-04-2023",c2,cp2,p2,Sonia);
        dp3= new DetallePedido("24-04-2023",c3,cp3,p3,Algodon);

        System.out.println(dp1.getCaracteristicaPedido().getcantidadPedida());
        System.out.println(dp2);
        System.out.println(dp3);
        Interfaz_usuario_programa.saltoParrafo();

        gp.agregarPedido(dp1);
        gp.agregarPedido(dp2);
        gp.agregarPedido(dp3);

        System.out.println("Datos cargados");
    }

    public static void main (String []args){
        cargarDatos();
        Interfaz_usuario_programa.saltoParrafo();

        //LLamada al menu
        Menu.menuGestion();
        Interfaz_usuario_programa.saltoParrafo();  

    }

}
