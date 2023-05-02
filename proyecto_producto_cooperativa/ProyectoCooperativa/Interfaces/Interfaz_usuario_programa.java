package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class Interfaz_usuario_programa here.
 * Contiene los métodos para acceder a la entrada y salida de datos
 */
public class Interfaz_usuario_programa
{
    private static Scanner sc = new Scanner(System.in);
    private static String fechaInicial;
    private static String fechaFinal;

    //Método para separar información cuando se muestra
    public static void saltoParrafo(){
        System.out.println("==============================================================");

    }

    
    public static void noSeHaEncontrado(){
        System.out.println("No se ha encontrado el dato buscado" );

    }

    //Métodos para gestionar las ventas anuales de la cooperativa en un periodo dado
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

    
}