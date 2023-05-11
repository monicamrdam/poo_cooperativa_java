package ProyectoCooperativa.Controladores;
import ProyectoCooperativa.Interfaces.*;
import ProyectoCooperativa.Modelos.Productos.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * Write a description of class CRUD_producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CRUD_producto
{
    private static Map <String, Producto> hmproductos ;
    private static Set set;
    private static Iterator iterator;
    private static String id;
    private static String nombreProducto;
    private static double numHectareasProducto;
    private static double precioProductoSinIVa;
    private static double rendimientoPorHa;

    public static void agregarProducto(HashMap<String, Producto> productos) {
        try {
            hmproductos = new HashMap <String, Producto>();
            //Si el hasmap no esta vacio, guardamos sus valores
            if (productos!=null){
                hmproductos = productos;
                id = MenuCrud_Producto.generarIdProducto();
                nombreProducto= MenuCrud_Producto.solicitarnombreProducto();
                numHectareasProducto= MenuCrud_Producto.solicitarnumHectareasProducto();
                precioProductoSinIVa= MenuCrud_Producto.solicitarprecioProductoSinIVa();
                rendimientoPorHa= MenuCrud_Producto.solicitarrendimientoPorHa();
                hmproductos.put(id,new Producto(nombreProducto, numHectareasProducto, precioProductoSinIVa, rendimientoPorHa));
            }
        }catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void listarHasMap(HashMap<String, Producto> productos){
        try {
            set = productos.entrySet();
            iterator = set.iterator();
            while(iterator.hasNext()) {
                Map.Entry me = (Map.Entry)iterator.next();
                System.out.println();
                System.out.println("Id del producto: "+ me.getKey() + 
                    " - Datos del producto: "+me.getValue());
            }
            Interfaz_usuario_programa.saltoParrafo();
        }catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void mostrarProducto(HashMap<String, Producto> productos) {
        try {
            listarHasMap(productos);

        }catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }

    public static void modificarProducto(HashMap<String, Producto> productos) {

        try {
            String idBuscar= MenuCrud_Producto.solicitarIdBuscar();
            //pendiente buscar si existe o no el id
            nombreProducto= MenuCrud_Producto.solicitarnombreProducto();
            numHectareasProducto= MenuCrud_Producto.solicitarnumHectareasProducto();
            precioProductoSinIVa= MenuCrud_Producto.solicitarprecioProductoSinIVa();
            rendimientoPorHa= MenuCrud_Producto.solicitarrendimientoPorHa();

            productos.replace(idBuscar,new Producto(nombreProducto, numHectareasProducto, precioProductoSinIVa, rendimientoPorHa));

            listarHasMap(productos);

        }catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static void eliminarProducto(HashMap<String, Producto> productos) {
        try {
            String idEliminar= MenuCrud_Producto.solicitarIdEliminar();
            productos.remove(idEliminar);

            listarHasMap(productos);

        }catch (Exception e) {
            System.out.println("Error: " + e);
        }

    }
}
