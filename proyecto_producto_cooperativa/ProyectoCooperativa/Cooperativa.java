package ProyectoCooperativa;
import ProyectoCooperativa.Interfaces.*;
import ProyectoCooperativa.Controladores.*;
import ProyectoCooperativa.Modelos.*;
import java.util.Map;
import java.util.LinkedHashMap;

/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooperativa
{
    private static Map <String, String> lhm;

    public static void cargarDatos(){
        lhm= new LinkedHashMap<String, String>();
        lhm.put("01-10-2022", "1 pedido, productor 1");
        lhm.put("02-10-2022", "2 pedido, productor 4");
        lhm.put("03-10-2022", "3 pedido, productor 4");
        lhm.put("04-10-2022", "4 pedido, productor 4");

    };

    
    public static void main (String [ ] args) {
        cargarDatos();
        Listar.listarLinkedHashMap(lhm);
        Interfaz_usuario_programa.saltoParrafo();
        
        String fechaInicial = Interfaz_usuario_programa.solicitarFechaInicial();
        String fechaFinal = Interfaz_usuario_programa.solicitarFechaFinal();
        System.out.println("Las fechas entre las que se muestran datos son " + fechaInicial + " y " + fechaFinal);
        
        Listar.listarEntreDosFechas (lhm, fechaInicial, fechaFinal);

    }
}

