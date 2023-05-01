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
        lhm.put("01-10-2022", "1 pedido");
        lhm.put("02-10-2022", "2 pedido");
        lhm.put("03-10-2022", "3 pedido");
        lhm.put("04-10-2022", "4 pedido");

    };

    
    public static void main (String [ ] args) {
        cargarDatos();
        Interfaz_usuario_programa.fechasBuscar();
        Listar.listarLinkedHashMap(lhm);

    }
}

