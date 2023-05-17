package Coooperativa;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooperativa {
    public static void main(String[] args) {
        // Creación de objetos Cooperativa, Clientes, Productores, etc.
        
        // Creación de clientes
        Cliente cliente1 = new DistribuidorFinal("123456789", "Cliente Distribuidor", "1234567890");
        Cliente cliente2 = new ConsumidorFinal("987654321", "Cliente Consumidor", "0987654321");

        // Creación de productos
        Producto producto1 = new Producto("P001", "Producto 1", 10, 5.0, 100.0, true);
        Producto producto2 = new Producto("P002", "Producto 2", 15, 4.0, 80.0, false);

        // Creación de productores
        List<Producto> productosProductor1 = new ArrayList<>();
        productosProductor1.add(producto1);
        Productor productor1 = new PequeñoProductor("1234", "Productor 1", "1111111111", productosProductor1);

        List<Producto> productosProductor2 = new ArrayList<>();
        productosProductor2.add(producto2);
        Productor productor2 = new GranProductor("5678", "Productor 2", "2222222222", productosProductor2);

        // Creación de pedidos
        Pedido pedido1 = new Pedido("2023-05-17", cliente1, producto1, 0.0, productor1);
        Pedido pedido2 = new Pedido("2023-05-18", cliente2, producto2, 0.0, productor2);

        // Acceso a los atributos y métodos de los objetos
        System.out.println("Cliente: " + cliente1.getNombre());
        System.out.println("Producto: " + producto1.getNombreProducto());
        System.out.println("Productor: " + productor1.getNombreProductor());
        System.out.println("Pedido realizado por: " + pedido1.getCliente().getNombre());

        // Realizar más operaciones y gestiones de la cooperativa
    }
}
