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
    private static Map<Integer, Pedido> pedidos = new HashMap<>();
    private static Map<Integer, Pedido> pedidosRegistrados;
    private static int generarNumeroPedido() {
        return pedidos.size() + 1;
    }

    private static Map<Integer, Pedido> registrarPedido(Pedido pedido) {
        int numeroPedido = generarNumeroPedido();
        pedidos.put(numeroPedido, pedido);
        return pedidos;
    }

    public static void main(String[] args) {
        // Creación de objetos Cooperativa, Clientes, Productores, etc.

        // Creación de clientes
        Cliente cliente1 = new DistribuidorFinal("123456789", "Cliente Distribuidor", "1234567890");
        Cliente cliente2 = new ConsumidorFinal("987654321", "Cliente Consumidor", "0987654321");
        Cliente cliente3 = new DistribuidorFinal("555555555", "Cliente Distribuidor 2", "999999999");
        Cliente cliente4 = new ConsumidorFinal("444444444", "Cliente Consumidor 2", "888888888");
        Cliente cliente5 = new DistribuidorFinal("777777777", "Cliente Distribuidor 3", "666666666");

        // Creación de productos
        Producto producto1 = new Producto("P001", "Producto 1", 10, 5.0, 100.0, true);
        Producto producto2 = new Producto("P002", "Producto 2", 15, 4.0, 80.0, false);
        Producto producto3 = new Producto("P003", "Producto 3", 20, 6.0, 150.0, false);
        Producto producto4 = new Producto("P004", "Producto 4", 8, 3.5, 90.0, true);
        Producto producto5 = new Producto("P005", "Producto 5", 12, 4.5, 120.0, false);
        Producto producto6 = new Producto("P006", "Producto 6", 18, 7.0, 200.0, false);
        Producto producto7 = new Producto("P007", "Producto 7", 25, 3.0, 70.0, true);
        Producto producto8 = new Producto("P008", "Producto 8", 14, 5.5, 130.0, false);
        Producto producto9 = new Producto("P009", "Producto 9", 22, 6.5, 180.0, false);
        Producto producto10 = new Producto("P010", "Producto 10", 16, 4.2, 110.0, true);

        // Creación de productores
        List<Producto> productosProductor1 = new ArrayList<>();
        productosProductor1.add(producto1);
        productosProductor1.add(producto3);
        Productor productor1 = new PequeñoProductor("1234", "Productor 1", "1111111111", productosProductor1);

        List<Producto> productosProductor2 = new ArrayList<>();
        productosProductor2.add(producto2);
        productosProductor2.add(producto4);
        Productor productor2 = new GranProductor("5678", "Productor 2", "2222222222", productosProductor2);

        List<Producto> productosProductor3 = new ArrayList<>();
        productosProductor3.add(producto5);
        productosProductor3.add(producto6);
        Productor productor3 = new PequeñoProductor("91011", "Productor 3", "3333333333", productosProductor3);

        List<Producto> productosProductor4 = new ArrayList<>();
        productosProductor4.add(producto7);
        productosProductor4.add(producto8);
        Productor productor4 = new GranProductor("121314", "Productor 4", "4444444444", productosProductor4);

        List<Producto> productosProductor5 = new ArrayList<>();
        productosProductor5.add(producto9);
        productosProductor5.add(producto10);
        Productor productor5 = new PequeñoProductor("151617", "Productor 5", "5555555555", productosProductor5);

        List<Producto> productosProductor6 = new ArrayList<>();
        productosProductor6.add(producto3);
        productosProductor6.add(producto7);
        Productor productor6 = new GranProductor("181920", "Productor 6", "6666666666", productosProductor6);

        List<Producto> productosProductor7 = new ArrayList<>();
        productosProductor7.add(producto1);
        productosProductor7.add(producto9);
        Productor productor7 = new PequeñoProductor("212223", "Productor 7", "7777777777", productosProductor7);

        // Creación de pedidos
        Pedido pedido1 = new Pedido("2023-05-17", cliente1, producto1, 0.0, productor1);
        Pedido pedido2 = new Pedido("2023-05-18", cliente5, producto2, 0.0, productor2);
        Pedido pedido3 = new Pedido("2023-05-19", cliente1, producto4, 0.0, productor5);
        Pedido pedido4 = new Pedido("2023-05-20", cliente4, producto9, 0.0, productor2);
        Pedido pedido5 = new Pedido("2023-05-21", cliente3, producto5, 0.0, productor4);

        // Registro de pedidos
        registrarPedido(pedido1);
        registrarPedido(pedido2);
        registrarPedido(pedido3);
        registrarPedido(pedido4);
        registrarPedido(pedido5);

        for (Map.Entry<Integer, Pedido> entry : pedidos.entrySet()) {
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

    

        // Realizar más operaciones y gestiones de la cooperativa
    }
}
