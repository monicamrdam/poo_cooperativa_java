package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class Menu here.
 * Menús contextuales para acceder y mostrar los datos
 */
public class Menu
{
    private static Scanner sc = new Scanner(System.in);
    private static String opcion = "";

    //Permite acceder a las tres funciones del sistema registrar, gestión diaria y gestión anual de la cooperativa
    public static void menuGestion(){

        do{
            System.out.println(
                "1. Introducir datos \n2. Gestion diaria cooperativa\n3. Gestión anual cooperativa\n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    menuGestion();
                case "2":
                    gestionDiariaCooperativa();  
                case "3":
                    gestionAnualCooperativa();
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

    //Menu para insertar, modificar y eliminar registros de productos, clientes y productores
    public static void menuRegistrarDatos(){

        do{
            System.out.println(
                "1. Datos del producto \n2. Datos de clientes\n3. Datos de productores\n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //Datos del producto
                case "2":
                    //Datos de clientes
                case "3":
                    //Datos de productores
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

    //Menú para las gestiones diarias de la cooperativa
    public static void gestionDiariaCooperativa(){

        do{
            System.out.println(
                "1. Introducir datos \n2. Gestion diaria cooperativa\n3. Gestión anual cooperativa\n4. Salir\nElige:");
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
    public static void gestionAnualCooperativa(){
        do{
            System.out.println(
                "1. Introducir datos \n2. Gestion diaria cooperativa\n3. Gestión anual cooperativa\n4. Salir\nElige:");
            opcion = sc.nextLine();
            switch(opcion){
                case "1":
                    //Ventas anuales
                case "2":
                    gestionDiariaCooperativa();
                case "3":
                    gestionAnualCooperativa();
                case "4":
                    break;
            }
        }while(!opcion.equals("4"));
    }

}
