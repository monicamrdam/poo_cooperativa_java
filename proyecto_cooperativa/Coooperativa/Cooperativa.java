package Coooperativa;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooperativa {
    private static Map<Integer, Pedido> pedidosCompraCooperativa = new HashMap<>();
    private static Map<Integer, Pedido> pedidosVentasClientes = new HashMap<>();
    private static Map<Integer, Pedido> pedidosRegistrados;
    private static Cliente cliente1;
    private static Cliente cliente2;
    private static Cliente cliente3;
    private static Cliente cliente4;
    private static Cliente cliente5;

    private static int generarNumeroPedidoCliente() {
        return pedidosVentasClientes.size() + 1;
    }

    private static int generarNumeroPedidoCooperativa() {
        return pedidosCompraCooperativa.size() + 1;
    }

    private static Map<Integer, Pedido> registrarCompraCooperativa(Pedido pedido) {
        try{
            int numeroPedido = generarNumeroPedidoCooperativa();
            pedidosCompraCooperativa.put(numeroPedido, pedido);
        }catch(Exception e){
            System.out.println("Se produjo un error al guardar los productos comprados. " + e.getMessage());

        }
        return pedidosCompraCooperativa;
    }

    private static Map<Integer, Pedido> registrarPedidoCliente(Pedido pedido) {
        int numeroPedido = generarNumeroPedidoCliente();
        pedidosVentasClientes.put(numeroPedido, pedido);
        return pedidosVentasClientes;
    }

    private static void buscarCliente(Map<Integer, Pedido> pedidos, Cliente cliente) {
        try {
            System.out.println("Estos son todos lo pedidos realizados por un cliente.");
            System.out.println("Pedidos realizados por " + cliente.getNombre() + ":");
            System.out.println("-----------------------------");
            boolean encontrado = false;
            for (Map.Entry<Integer, Pedido> entry : pedidos.entrySet()) {
                Pedido pedido = entry.getValue();
                if (pedido.getCliente().equals(cliente)) {
                    System.out.println(" " + pedido.toString());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontraron pedidos para el cliente " + cliente.getNombre());
            }
        } catch (Exception e) {
            System.out.println("Se produjo un error al buscar el cliente: " + e.getMessage());
        }

    }

    private static void cargarDatos(){
        // Creación de clientes
        cliente1 = new DistribuidorFinal("676342178", "D Vinatahi", "N9912202J");
        cliente2 = new ConsumidorFinal("693955444", "C Gregoria", "79868493G");
        cliente3 = new DistribuidorFinal("910950608", "D Laxumutu", "B32766677");
        cliente4 = new ConsumidorFinal("644908448", "C Minerva", "71016682L");
        cliente5 = new DistribuidorFinal("6672809200", "D Jomudog", "S0419538D");

        // Creación de productos
        Producto producto1 = new ProductoPerecedero("P001", "Aceitunas", 1, 5.0, 100.0, true);
        Producto producto2 = new ProductoPerecedero("P002", "Uvas", 5, 4.0, 80.0, true);
        Producto producto3 = new ProductoPerecedero("P003", "Pistachos", 20, 6.0, 150.0, true);
        Producto producto4 = new ProductoPerecedero("P004", "Naranjas", 8, 3.5, 90.0, true);
        Producto producto5 = new ProductoNoPerecedero("P005", "Algodon", 12, 4.5, 120.0, false);
        Producto producto6 = new ProductoPerecedero("P006", "Melocoton", 1, 7.0, 200.0, true);
        Producto producto7 = new ProductoNoPerecedero("P007", "Aceite", 2, 3.0, 70.0, false);
        Producto producto8 = new ProductoNoPerecedero("P008", "Vino", 14, 5.5, 130.0, false);
        Producto producto9 = new ProductoNoPerecedero("P009", "Miel", 22, 6.5, 180.0, false);
        Producto producto10 = new ProductoNoPerecedero("P010", "Cafe", 16, 4.2, 110.0, false);
        Producto producto11 = new ProductoPerecedero("P007", "Manzanas", 10, 2.0, 80.0, true);
        Producto producto12 = new ProductoNoPerecedero("P008", "Arroz", 5, 1.5, 60.0, false);
        Producto producto13 = new ProductoPerecedero("P009", "Pepinos", 6, 2.5, 70.0, true);
        Producto producto14 = new ProductoPerecedero("P010", "Peras", 4, 2.0, 90.0, true);
        Producto producto15 = new ProductoNoPerecedero("P011", "Azúcar", 3, 2.0, 50.0, false);
        Producto producto16 = new ProductoPerecedero("P012", "Lechuga", 2, 1.0, 30.0, true);
        Producto producto17 = new ProductoNoPerecedero("P013", "Sal", 7, 1.0, 40.0, false);

        Producto[] listaProductos = {producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10, producto11, producto12, producto13, producto14, producto15, producto16, producto17};

        List<Producto> productosProductor1 = new ArrayList<>();
        List<Producto> productosProductor2 = new ArrayList<>();
        List<Producto> productosProductor3 = new ArrayList<>();
        List<Producto> productosProductor4 = new ArrayList<>();
        List<Producto> productosProductor5 = new ArrayList<>();
        List<Producto> productosProductor6 = new ArrayList<>();
        List<Producto> productosProductor7 = new ArrayList<>();

        for (int i = 0; i < listaProductos.length; i++) {
            productosProductor1.add(listaProductos[i]);
            productosProductor2.add(listaProductos[i]);
            productosProductor3.add(listaProductos[i]);
            productosProductor4.add(listaProductos[i]);
            productosProductor5.add(listaProductos[i]);
            productosProductor6.add(listaProductos[i]);
            productosProductor7.add(listaProductos[i]);
        }

        // Creación de productores
        Productor productor1 = new PequeñoProductor("919937744", "Pq Juan", "90358188C", productosProductor1);
        Productor productor2 = new GranProductor("919931042", "GP Antonia", "C23840515", productosProductor2);
        Productor productor3 = new PequeñoProductor("919930038", "Pq Luisa", "8454443B", productosProductor3);
        Productor productor4 = new GranProductor("919934933", "Gp Vanesa", "N1477838E", productosProductor4);
        Productor productor5 = new PequeñoProductor("919930548", "Pq Ana", "42565986R", productosProductor5);
        Productor productor6 = new GranProductor("919932700", "GP Luana", "W3917292I", productosProductor6);
        Productor productor7 = new PequeñoProductor("91993066", "Pq Laura", "14260438R", productosProductor7);

        // Creación de pedidos comprados por la cooperativa
        Pedido pedidoCp1 = new Pedido(productor1);
        Pedido pedidoCp2 = new Pedido(productor5);
        Pedido pedidoCp3 = new Pedido(productor6);
        Pedido pedidoCp4 = new Pedido(productor3);
        Pedido pedidoCp5 = new Pedido(productor4);

        // Creación de pedidos de compras de clientes
        Pedido pedido1 = new Pedido("2023-05-17", cliente1, producto1, 0.0, productor1);
        Pedido pedido2 = new Pedido("2023-05-18", cliente5, producto2, 0.0, productor2);
        Pedido pedido3 = new Pedido("2023-05-19", cliente1, producto4, 0.0, productor5);
        Pedido pedido4 = new Pedido("2023-05-20", cliente4, producto9, 0.0, productor2);
        Pedido pedido5 = new Pedido("2023-05-21", cliente3, producto5, 0.0, productor4);

        // Registro de pedidos comprados por la cooperativa
        registrarCompraCooperativa(pedidoCp1);
        registrarCompraCooperativa(pedidoCp2);
        registrarCompraCooperativa(pedidoCp3);
        registrarCompraCooperativa(pedidoCp4);
        registrarCompraCooperativa(pedidoCp5);

        // Registro de pedidos comprados por los clientes
        registrarPedidoCliente(pedido1);
        registrarPedidoCliente(pedido2);
        registrarPedidoCliente(pedido3);
        registrarPedidoCliente(pedido4);
        registrarPedidoCliente(pedido5);

    }

    public static void main(String[] args) {
        cargarDatos();

        buscarCliente(pedidosVentasClientes, cliente4);

        
        System.out.println("Estos son todos lo pedidos comprados por la cooperativa.");
        System.out.println("-----------------------------");       
        for (Map.Entry<Integer, Pedido> entry : pedidosCompraCooperativa.entrySet()) {
            int numeroPedido = entry.getKey();
            Pedido pedido = entry.getValue();
            System.out.println("Número de pedido: " + numeroPedido);
            System.out.println("Pedido: " + pedido);       
        }

        System.out.println();       
        System.out.println("Estos son todos lo pedidos comprados por los clientes.");
        System.out.println("-----------------------------");       
        for (Map.Entry<Integer, Pedido> entry : pedidosVentasClientes.entrySet()) {
            int numeroPedido = entry.getKey();
            Pedido pedido = entry.getValue();
            System.out.println("Número de pedido: " + numeroPedido);
            //System.out.println("Pedido: " + pedido); //Muestra lo mismo que lo que sigue
            System.out.println("Fecha: " + pedido.getFecha());
            System.out.println("Cliente: " + pedido.getCliente());
            System.out.println("Producto: " + pedido.getProducto());
            System.out.println("Oferta aplicada: " + pedido.getOfertaAplicada());
            System.out.println("Productor: " + pedido.getProductor());
            System.out.println("-----------------------------");
        }

    }
}
