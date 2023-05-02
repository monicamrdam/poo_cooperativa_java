package ProyectoCooperativa.Interfaces;
import ProyectoCooperativa.Controladores.*;
import ProyectoCooperativa.Modelos.Producto.*;

import java.util.Scanner;
import java.util.HashMap;

/**
 * Write a description of class Menu here.
 * Menús contextuales para acceder y mostrar los datos
 */
public class Menu
{
    private static Scanner sc = new Scanner(System.in);
    private static String opcion = "";

    //Permite acceder a las tres funciones del sistema gestion de datos, gestión diaria y gestión anual de la cooperativa
    public static void menuGestion(HashMap<String, Producto> productos){

        do{
            System.out.println(
                "1. Introducir/Modificar/Eliminar datos \n2. Gestion diaria cooperativa\n3. Gestión anual cooperativa\n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    menuRegistrarDatos(productos);
                case "2":
                    gestionDiariaCooperativa(productos);  
                case "3":
                    gestionAnualCooperativa(productos);
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

    //Menu para insertar, modificar y eliminar registros de productos, clientes y productores
    public static void menuRegistrarDatos(HashMap<String, Producto> productos){

        do{
            System.out.println(
                "1. Agregar producto \n2. Mostrar lista de productos\n3. Modificar producto\n4. Eliminar producto\n5. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    CRUD_Producto.agregarProducto(productos);
                case "2":
                    CRUD_Producto.mostrarProducto(productos);
                case "3":
                    CRUD_Producto.modificarProducto(productos);
                case "4":
                    CRUD_Producto.eliminarProducto(productos);
                case "5":
                    break;
            }
        }while(!opcion.equals("5"));
    }

    //Menú para las gestiones diarias de la cooperativa
    public static void gestionDiariaCooperativa(HashMap<String, Producto> productos){

        do{
            System.out.println(
                "1. Mostrar  \n2. Buscar \n3. Gestión \n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //Registrar pedidos
                case "2":
                    //Listar Pedidos
                case "3":
                    //Buscar Pedidos
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

    //Menú para las gestiones anuales de la cooperativa
    public static void gestionAnualCooperativa(HashMap<String, Producto> productos){
        do{
            System.out.println(
                "1. Ventas anuales \n2. Busqueda\n3. Gestión \n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //Ventas anuales
                case "2":
                    //Busqueda
                case "3":
                    //Busqueda
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

}
