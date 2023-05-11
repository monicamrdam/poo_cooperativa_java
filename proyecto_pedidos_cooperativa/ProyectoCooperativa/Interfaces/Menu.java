package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu
{
    private static Scanner sc = new Scanner(System.in);
    private static String opcion = "";

    //Permite acceder a las tres funciones del sistema gestion de datos, gestión diaria y gestión anual de la cooperativa
    public static void menuGestion(){

        do{
            System.out.println(
                "1. Introducir/Modificar/Eliminar datos \n2. Gestion diaria cooperativa\n3. Gestión anual cooperativa\n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    menuRegistrarDatos();
                case "2":
                    gestionDiariaCooperativa();  
                case "3":
                    gestionAnualCooperativa();
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

    //Menú para las gestiones diarias de la cooperativa
    public static void gestionDiariaCooperativa(){

        do{
            System.out.println(
                "1. Mostrar \n2. Buscar \n3. Gestión \n4. Salir\nElige:");
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

    //Menu para insertar, modificar y eliminar registros 
    public static void menuRegistrarDatos(){

        do{
            System.out.println(
                "1. Datos Clientes \n2. Datos Productos\n3. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    menuRegistrarDatosClientes();
                case "2":
                    menuRegistrarDatosProductos();
                case "3":
                    break;
            }
        }while(!opcion.equals("5"));
    }

    //Menu para insertar, modificar y eliminar registros de clientes
    public static void menuRegistrarDatosClientes(){

        do{
            System.out.println(
                "1. Agregar cliente \n2. Mostrar cliente\n3. Modificar cliente\n4. Eliminar cliente\n5. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //CRUD_Cliente.agregarProducto();
                case "2":
                    //CRUD_Cliente.mostrarProducto();
                case "3":
                    //CRUD_Cliente.modificarProducto();
                case "4":
                    //CRUD_Cliente.eliminarProducto();
                case "5":
                    break;
            }
        }while(!opcion.equals("5"));
    }

    
    //Menu para insertar, modificar y eliminar registros de productos, clientes y productores
    public static void menuRegistrarDatosProductos(){

        do{
            System.out.println(
                "1. Agregar producto \n2. Mostrar productos\n3. Modificar producto\n4. Eliminar producto\n5. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //CRUD_Producto.agregarProducto();
                case "2":
                    //CRUD_Producto.mostrarProducto();
                case "3":
                    //CRUD_Producto.modificarProducto();
                case "4":
                   // CRUD_Producto.eliminarProducto();
                case "5":
                    break;
            }
        }while(!opcion.equals("5"));
    }

    //Menú para las gestiones anuales de la cooperativa
    public static void gestionAnualCooperativa(){
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
