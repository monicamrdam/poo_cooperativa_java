package ProyectoCooperativa.Interfaces;
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

/**
 * Write a description of class MenuCrud_Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCrud_Producto
{
    private static Scanner sc = new Scanner(System.in);

    public static String generarIdProducto(){
        Random random = new Random();
        String idProducto = new BigInteger(50, random).toString(32);
        return idProducto;
    }

    public static String solicitarnombreProducto(){
        System.out.println("Introduce el nombre del producto");
        String nombreProducto = sc.nextLine(); 
        return nombreProducto;
    }

    public static Double solicitarnumHectareasProducto(){
        System.out.println("Introduce el nº Hectareas para ese producto");
        double numHectareasProducto = Double.parseDouble(sc.nextLine());
        return numHectareasProducto;
    }

    public static Double solicitarprecioProductoSinIVa(){
        System.out.println("Introduce el nº precio producto sin IVA");
        double precioProductoSinIVa = Double.parseDouble(sc.nextLine());
        return precioProductoSinIVa;
    }

    public static Double solicitarrendimientoPorHa(){
        System.out.println("Introduce el nº rendimiento por Ha");
        double rendimientoPorHa = Double.parseDouble(sc.nextLine());
        return rendimientoPorHa;
    }

    public static String solicitarIdBuscar(){
        System.out.println("Introduce el id del producto a buscar");
        String idBuscar = sc.nextLine();
        return idBuscar;
    }

    public static String solicitarIdEliminar(){
        System.out.println("Introduce el id del producto a eliminar");
        String idEliminar = sc.nextLine();
        return idEliminar;
    }
}
