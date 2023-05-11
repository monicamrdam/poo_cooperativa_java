package ProyectoCooperativa.Modelos.Pedidos;
import java.util.TreeMap;
import java.util.List;
import java.util.LinkedList;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;

/**
 * Write a description of class GestionPedido here.
 * Clase que permite gestionar los pedidos de la cooperativa por idPedido
 * Dispone de 5 métodos principales: agregarPedido, modificarPedido,borrarPedido, buscarPedido, listarPedidos
 */
public class GestionPedido
{
    private TreeMap <Integer, DetallePedido> gestionpedido;
    private static int idPedido;

    public GestionPedido(){
        gestionpedido= new TreeMap <Integer, DetallePedido>();
        idPedido=0;
    }

    private boolean idPedidoActual(Integer idPedido){
        return gestionpedido.containsKey(idPedido);
    }

    public DetallePedido getPedido(Integer idPedido){
        return gestionpedido.get(idPedido);
    }

    public void cantidadPedidos(){
        System.out.println(gestionpedido.size());
    }

    public void agregarPedido(DetallePedido detallepedido) {
        try{
            gestionpedido.put(idPedido, detallepedido);
            idPedido++;
        }catch(Exception e) {
            System.out.println("No ha sido posible agregarlo " + e); 
        }

    }

    public void borrarPedido(Integer idPedido){
        try{
            if(idPedidoActual(idPedido)){
                gestionpedido.remove(idPedido);
            }
        }catch(Exception e) {
            System.out.println("No ha sido posible borrar el pedido " + e); 
        }

    }

    private void modificarPedido(Integer idPedidoBorrar, DetallePedido detallepedido){
        if(idPedidoActual(idPedidoBorrar)){
            borrarPedido(idPedidoBorrar);

        }
        agregarPedido(detallepedido);

    }

    public DetallePedido[] buscarPedido(Integer idPedidoBuscar){
        List <DetallePedido> listdp = new LinkedList <DetallePedido>();
        SortedMap <Integer, DetallePedido> cola = gestionpedido.tailMap(idPedidoBuscar);

        Iterator <Integer> it = cola.keySet().iterator();
        boolean encuentraIdPedido = false;

        while (it.hasNext()&& !encuentraIdPedido){
            Integer id= it.next();
            if(id==idPedidoBuscar){
                listdp.add(gestionpedido.get(id));
            }else{
                encuentraIdPedido=true; 
            }

        }
        DetallePedido[] dp=new DetallePedido[listdp.size()];
        listdp.toArray(dp);
        return dp;
    }

    public String listarPedidos(){
        System.out.println("listar pedidos");
        StringBuilder todosLosPedidos = new StringBuilder();
        System.out.println(gestionpedido.values());
        Set <DetallePedido> dpOrdenado = new TreeSet <DetallePedido>(gestionpedido.values());

        for (DetallePedido dp: dpOrdenado){
            todosLosPedidos.append(dp);
            todosLosPedidos.append("\n");
        }
        return todosLosPedidos.toString();
    }
}
