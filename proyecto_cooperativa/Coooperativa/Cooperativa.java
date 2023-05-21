package Coooperativa;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

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
        try{
            int numeroPedido = generarNumeroPedidoCliente();
            pedidosVentasClientes.put(numeroPedido, pedido);
        }catch(Exception e){
            System.out.println("Se produjo un error al guardar los productos comprados. " + e.getMessage());

        }
        return pedidosVentasClientes;        

    }

    private static void cantidadProductosCooperativa(Map<Integer, Pedido> pedidosCompraCooperativa) {
        Map<String, Double> productosYCantidades = new HashMap<>();

        for (Pedido pedido : pedidosCompraCooperativa.values()) {
            Productor productor = pedido.getProductor();
            List<Producto> productosVende = productor.getProductosVende();

            for (Producto producto : productosVende) {
                String nombreProducto = producto.getNombreProducto();
                double cantidadProducto = producto.getCantidadProducto();
                productosYCantidades.merge(nombreProducto, cantidadProducto, Double::sum);
            }
        }

        for (Map.Entry<String, Double> entry : productosYCantidades.entrySet()) {
            String nombreProducto = entry.getKey();
            double cantidadProducto = entry.getValue();
            System.out.println("Producto: " + nombreProducto + ", Cantidad: " + cantidadProducto);
        }
    }

    private static void mostrarCantidadMiel(Map<Integer, Pedido> pedidosCompraCooperativa) {
        Map<String, Double> productoresMiel = new HashMap<>();

        for (Pedido pedido : pedidosCompraCooperativa.values()) {
            Productor productor = pedido.getProductor();

            for (Producto producto : productor.getProductosVende()) {
                if (producto.getNombreProducto().equalsIgnoreCase("miel")) {
                    String nombreProductor = productor.getNombreProductor();
                    double cantidadMiel = producto.getCantidadProducto();

                    productoresMiel.merge(nombreProductor, cantidadMiel, Double::sum);
                }
            }
        }

        System.out.println("Productores de miel y sus cantidades:");
        for (Map.Entry<String, Double> entry : productoresMiel.entrySet()) {
            String nombreProductor = entry.getKey();
            double cantidadMiel = entry.getValue();

            System.out.println("Productor: " + nombreProductor + ", Cantidad de miel: " + cantidadMiel);
        }
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

    private static void solicitarCompra(Map<Integer, Pedido> pedidosCompraCooperativa) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        String nombreProductoCliente = scanner.nextLine();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        double cantidadCliente = scanner.nextDouble();

        System.out.println("Usted desea comprar " + cantidadCliente + " unidades de " + nombreProductoCliente);

        Map<String, Double> productosYCantidades = new HashMap<>();

        for (Pedido pedido : pedidosCompraCooperativa.values()) {
            Productor productor = pedido.getProductor();
            List<Producto> productosVende = productor.getProductosVende();

            for (Producto producto : productosVende) {
                String nombreProducto = producto.getNombreProducto();
                double cantidadProducto = producto.getCantidadProducto();
                productosYCantidades.merge(nombreProducto, cantidadProducto, Double::sum);
            }
        }

        double cantidadRestante = cantidadCliente;
        System.out.println("Cantidades de productos que quedan en la cooperativa");

        for (Map.Entry<String, Double> entry : productosYCantidades.entrySet()) {
            String nombreProducto = entry.getKey();
            double cantidadProducto = entry.getValue();

            if (cantidadRestante > 0) {
                if (nombreProducto.equalsIgnoreCase(nombreProductoCliente) && cantidadProducto >= cantidadRestante) {
                    // Realizar la compra
                    cantidadProducto -= cantidadRestante;
                    cantidadRestante = 0;
                } else if (nombreProducto.equalsIgnoreCase(nombreProductoCliente) && cantidadProducto < cantidadRestante) {
                    // Realizar la compra parcial
                    cantidadRestante -= cantidadProducto;
                    cantidadProducto = 0;
                }

                // Actualizar la cantidad del producto en el mapa
                productosYCantidades.put(nombreProducto, cantidadProducto);
            }
            System.out.println("Producto: " + nombreProducto + ", Cantidad: " + cantidadProducto);
        }

        scanner.close();
    }

    private static void gananciasProductores(Map<Integer, Pedido> pedidosCompraCooperativa) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto que desea comprar: ");
        String nombreProductoCliente = scanner.nextLine();

        System.out.print("Ingrese la cantidad que desea comprar: ");
        double cantidadCliente = scanner.nextDouble();

        System.out.println("Usted desea comprar " + cantidadCliente + " unidades de " + nombreProductoCliente);

        Map<String, Double> productosYCantidades = new HashMap<>();
        Map<String, Double> productoresProductos = new HashMap<>();
        Map<String, Double> productoresCantidades = new HashMap<>();

        // Calcular cantidades de productos en la cooperativa
        for (Pedido pedido : pedidosCompraCooperativa.values()) {
            Productor productor = pedido.getProductor();
            List<Producto> productosVende = productor.getProductosVende();

            for (Producto producto : productosVende) {
                String nombreProducto = producto.getNombreProducto();
                double cantidadProducto = producto.getCantidadProducto();
                double valorReferenciaSinIVA = producto.getValorReferenciaSinIVA();

                productosYCantidades.merge(nombreProducto, cantidadProducto, Double::sum);
                productoresProductos.put(nombreProducto, valorReferenciaSinIVA);
                productoresCantidades.put(nombreProducto, cantidadProducto);
            }
        }

        double cantidadRestante = cantidadCliente;
        System.out.println("Cantidades de productos que quedan en la cooperativa");

        for (Map.Entry<String, Double> entry : productosYCantidades.entrySet()) {
            String nombreProducto = entry.getKey();
            double cantidadProducto = entry.getValue();

            if (cantidadRestante > 0) {
                if (nombreProducto.equalsIgnoreCase(nombreProductoCliente) && cantidadProducto >= cantidadRestante) {
                    // Realizar la compra
                    cantidadProducto -= cantidadRestante;
                    cantidadRestante = 0;
                } else if (nombreProducto.equalsIgnoreCase(nombreProductoCliente) && cantidadProducto < cantidadRestante) {
                    // Realizar la compra parcial
                    cantidadRestante -= cantidadProducto;
                    cantidadProducto = 0;
                }

                // Actualizar la cantidad del producto en el mapa
                productosYCantidades.put(nombreProducto, cantidadProducto);
            }

            System.out.println("Producto: " + nombreProducto + ", Cantidad: " + cantidadProducto);
        }

        // Mostrar productores que tenían el producto solicitado y calcular ganancias
        System.out.println("Productores que tenían el producto: " + nombreProductoCliente);
        double gananciasTotales = 0.0;
        for (Pedido pedido : pedidosCompraCooperativa.values()) {
            Productor productor = pedido.getProductor();
            List<Producto> productosVende = productor.getProductosVende();

            for (Producto producto : productosVende) {
                String nombreProducto = producto.getNombreProducto();
                double valorReferenciaSinIVA = productoresProductos.get(nombreProducto);
                double cantidadProducto = productoresCantidades.get(nombreProducto);

                if (nombreProducto.equalsIgnoreCase(nombreProductoCliente)) {
                    double cantidadVendida = Math.min(cantidadCliente, cantidadProducto);
                    double ganancia = cantidadVendida * valorReferenciaSinIVA;
                    gananciasTotales += ganancia;

                    System.out.println("Productor: " + productor.getNombreProductor() + ", Valor de referencia sin IVA: " + valorReferenciaSinIVA + ", Cantidad: " + cantidadProducto);
                    System.out.println("Cantidad vendida: " + cantidadVendida);
                    System.out.println("Ganancia: " + ganancia);
                    System.out.println("--------------------");
                }
            }
        }

        System.out.println("Ganancias totales: " + gananciasTotales);

        scanner.close();
    }

    private static void cargarDatos(){
        // Creación de clientes
        cliente1 = new DistribuidorFinal("676342178", "D Vinatahi", "N9912202J");
        cliente2 = new ConsumidorFinal("693955444", "C Gregoria", "79868493G");
        cliente3 = new DistribuidorFinal("910950608", "D Laxumutu", "B32766677");
        cliente4 = new ConsumidorFinal("644908448", "C Minerva", "71016682L");
        cliente5 = new DistribuidorFinal("6672809200", "D Jomudog", "S0419538D");

        // Creación de productos
        Producto producto1 = new ProductoPerecedero("P001", "Aceitunas",1, 1, 5.0, 1100.0, true);
        Producto producto2 = new ProductoPerecedero("P002", "Uvas",10, 5, 4.0, 180.0, true);
        Producto producto3 = new ProductoPerecedero("P003", "Pistachos",15, 20, 6.0, 1150.0, true);
        Producto producto4 = new ProductoPerecedero("P004", "Naranjas",26, 8, 3.5, 190.0, true);
        Producto producto5 = new ProductoNoPerecedero("P005", "Algodon",28, 12, 4.5, 1120.0, false);
        Producto producto6 = new ProductoPerecedero("P006", "Melocoton",50, 1, 7.0, 1200.0, true);
        Producto producto7 = new ProductoNoPerecedero("P007", "Aceite",30, 2, 3.0, 170.0, false);
        Producto producto8 = new ProductoNoPerecedero("P008", "Vino", 13, 14, 5.5, 1130.0, false);
        Producto producto9 = new ProductoNoPerecedero("P009", "Miel", 23, 22, 6.5, 1180.0, false);
        Producto producto10 = new ProductoNoPerecedero("P010", "Cafe", 28,16, 4.2, 1110.0, false);
        Producto producto11 = new ProductoPerecedero("P007", "Manzanas",33, 10, 2.0, 180.0, true);
        Producto producto12 = new ProductoNoPerecedero("P008", "Arroz", 31,5, 1.5, 160.0, false);
        Producto producto13 = new ProductoPerecedero("P009", "Pepinos",21,6, 2.5, 170.0, true);
        Producto producto14 = new ProductoPerecedero("P010", "Peras",24, 4, 2.0, 190.0, true);
        Producto producto15 = new ProductoNoPerecedero("P011", "Azúcar",11, 3, 2.0, 150.0, false);
        Producto producto16 = new ProductoPerecedero("P012", "Lechuga",5, 2, 1.0, 130.0, true);
        Producto producto17 = new ProductoNoPerecedero("P013", "Sal",54, 7, 1.0, 140.0, false);

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

        solicitarCompra(pedidosCompraCooperativa);

        System.out.println("-----------------------------");  
        buscarCliente(pedidosVentasClientes, cliente4);

        System.out.println("Estos son las cantidades de productos que hay en la cooperativa.");
        System.out.println("-----------------------------");  
        cantidadProductosCooperativa(pedidosCompraCooperativa);

        System.out.println("Estos son productores que tienen miel.");
        System.out.println("-----------------------------");  
        mostrarCantidadMiel(pedidosCompraCooperativa);

        System.out.println("Estos son las ganancias por productores.");
        System.out.println("-----------------------------");  
        gananciasProductores(pedidosCompraCooperativa);

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
 