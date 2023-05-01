package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class Interfaz_usuario_programa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interfaz_usuario_programa
{
    private static Scanner sc = new Scanner(System.in);
    private static String fechaInicial;
    private static String fechaFinal;

    public static String solicitarFechaInicial(){
        System.out.println("Introduce la fecha inicial de búsqueda");
        fechaInicial= sc.nextLine();
        return fechaInicial;
    }

    public static String solicitarFechaFinal(){
        System.out.println("Introduce la fecha final de búsqueda");
        fechaFinal= sc.nextLine();
        return fechaFinal;

    }

    public static void saltoParrafo(){
        System.out.println("==============================================================");

    }

    public static void noSeHaEncontrado(){
        System.out.println("No se ha encontrado el dato buscado" );

    }
}