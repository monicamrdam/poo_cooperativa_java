package ProyectoCooperativa.Controladores;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

/**
 * Write a description of class Listar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Listar
{
    private static Set set;
    private static Iterator iterator;
    private static Map <String, String> lhm;

    public static void listarLinkedHashMap(Map <String, String> lhmap){
        lhm= new LinkedHashMap<String, String>();
        set = lhmap.entrySet();
        iterator = set.iterator();

        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();
            System.out.println();
            System.out.print("Fecha del pedido: "+ me.getKey() + 
                " - Datos del pedido: "+me.getValue());
        }

    } 
}
