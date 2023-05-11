package ProyectoCooperativa.Interfaces;
import java.util.Scanner;

/**
 * Write a description of class Interfaz_usuario_prorama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Interfaz_usuario_programa
{
    private static Scanner sc = new Scanner(System.in);

    //Método para separar información cuando se muestra
    public static void saltoParrafo(){
        System.out.println("==============================================================");

    }

    public static void noSeHaEncontrado(){
        System.out.println("No se ha encontrado el dato buscado" );

    }

}
