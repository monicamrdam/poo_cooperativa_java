package ProyectoCooperativa.Controladores;
import ProyectoCooperativa.Interfaces.*;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

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
        Interfaz_usuario_programa.saltoParrafo();

    } 

    private static Date ParseFecha(String fecha)
    {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(fecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public static void listarEntreDosFechas(Map <String, String> lhmap, String fechaInicial, String fechaFinal){
        lhm= new LinkedHashMap<String, String>();
        set = lhmap.entrySet();
        iterator = set.iterator();
        System.out.println(fechaInicial);
        
        Date fecha_inicial = ParseFecha(fechaInicial);
        Date fecha_final = ParseFecha(fechaFinal);

        while(iterator.hasNext()) {
            Map.Entry me = (Map.Entry)iterator.next();       

            if(ParseFecha(me.getKey().toString()).after(fecha_inicial)){
                 System.out.println("Fecha del pedido: "+ me.getKey() + 
                    " - Datos del pedido: "+me.getValue());
            }
        }
        //Falta limitar cuando llegue a la fecha final

    }
}
