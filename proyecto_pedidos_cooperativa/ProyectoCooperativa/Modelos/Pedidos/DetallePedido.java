package ProyectoCooperativa.Modelos.Pedidos;
import ProyectoCooperativa.Modelos.Clientes.*;
import ProyectoCooperativa.Modelos.Productos.*;
import ProyectoCooperativa.Modelos.Productores.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class DetallePedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DetallePedido
{
    private String fecha;
    private Cliente cliente;
    private CaracteristicaPedido cp;
    private Producto p;
    private Productor productor;

    public DetallePedido(String fecha, Cliente cliente, CaracteristicaPedido cp,Producto p,Productor productor){
        this.fecha = fecha;
        this.cliente=cliente;
        this.cp=cp;
        this.p=p;
        this.productor=productor;

    }

    public String getFecha(){
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public CaracteristicaPedido getCaracteristicaPedido(){
        return cp;
    }

    public Producto getProducto(){
        return p;
    }

    public Productor getProductor(){
        return productor;
    }

    @Override
    public String toString(){
        return " Fecha Pedido: "  + this.fecha +" - "+ " Datos cliente: " + this.cliente + " - "+  " Caracteristicas pedido: " + this.cp + " - " + " Características producto " + this.p + " - " + " Características productor " + this.productor;
    }
}
