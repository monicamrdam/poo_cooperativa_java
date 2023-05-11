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
    //private Producto producto;
    //private Productor productor;
    //private Logistica logistica;

    public DetallePedido(String fecha, Cliente cliente){
        this.fecha = fecha;
        this.cliente=cliente;

    }

    public String getFecha(){
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    @Override
    public String toString(){
        return this.fecha+" fecha "+this.cliente +" cliente ";
    }

}
