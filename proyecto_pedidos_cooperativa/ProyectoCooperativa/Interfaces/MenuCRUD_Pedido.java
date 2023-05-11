package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class MenuCRUD_Pedido here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuCRUD_Pedido
{
    private static Scanner sc = new Scanner(System.in);

    public static Double cantidadAdquirida(){
        System.out.println("Introduce la cantidad del producto a adquirir en kg");
        Double cantidad = Double.parseDouble(sc.nextLine());
        return cantidad;
    }
}
