package ProyectoCooperativa.Modelos.Pedidos;
import ProyectoCooperativa.Modelos.Clientes.*;
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

    public DetallePedido(String fecha, Cliente cliente, CaracteristicaPedido cp){
        this.fecha = fecha;
        this.cliente=cliente;
        this.cp=cp;

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

    @Override
    public String toString(){
        return " Fecha Pedido: "  + this.fecha +" - "+ " Datos cliente: " + this.cliente + " - "+  " Caracteristicas pedido: " + this.cp;
    }
}
