package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class MenuCrud_Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCrud_Cliente
{
    private static Scanner sc = new Scanner(System.in);

    public static String solicitarnombreCliente(){
        System.out.println("Introduce el nombre del cliente");
        String nombreCliente = sc.nextLine(); 
        return nombreCliente;
    }

    public static String solicitarTelefonoCliente(){
        System.out.println("Introduce el télefono del cliente");
        String numeroTelefonoCliente = sc.nextLine();
        return numeroTelefonoCliente;
    }


}
