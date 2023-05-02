package ProyectoCooperativa;
import ProyectoCooperativa.Interfaces.*;
import ProyectoCooperativa.Controladores.*;
import ProyectoCooperativa.Modelos.Producto.*;
import ProyectoCooperativa.Modelos.Productor.*;
import java.math.BigInteger;
import java.util.HashMap;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Cooperativa here.
 * Carga los datos en memoria
 * Ejecuta el metódo main
 */
public class Cooperativa
{
    private static List<Productor> integrantes = new ArrayList<Productor>();
    private static List<Producto> productosJuan = new ArrayList<Producto>();

    //HastMap con los productos
    private static HashMap <String, Producto> hmproductos ;

    private static PequeñoProductor Juan;
    private static PequeñoProductor Sonia;
    private static ProductorFederado Algodon;

    private static Map <String, String> lhm;

    private static void cargarDatos(){
        Random random = new Random();
        hmproductos= new HashMap<String, Producto>();
        hmproductos.put((new BigInteger(50, random).toString(32)), new Producto ("naranjos", 1.5, 80,2.5));
        hmproductos.put((new BigInteger(50, random).toString(32)), new Producto("algodón", 0.5, 60,3.5));
        hmproductos.put((new BigInteger(50, random).toString(32)), new Producto("melocotón", 1.5, 40,3.5));


        Juan = new PequeñoProductor(new BigInteger(50, random).toString(32), "Juan P", 2, productosJuan);
        Sonia = new PequeñoProductor(new BigInteger(50, random).toString(32),"Sonia R", 4.1,productosJuan);
        Algodon = new ProductorFederado(new BigInteger(50, random).toString(32),"Algodon S.A.", "Algodon");
        integrantes.add(Juan);
        integrantes.add(Sonia);
        integrantes.add(Algodon);

        lhm= new LinkedHashMap<String, String>();
        lhm.put("01-10-2022", "1 pedido, productor 1");
        lhm.put("02-10-2022", "2 pedido, productor 4");
        lhm.put("03-10-2022", "3 pedido, productor 4");
        lhm.put("04-10-2022", "4 pedido, productor 4");

    };

    public static void main (String [ ] args) {
        cargarDatos();

        System.out.println("Datos Productores");
        System.out.println("Id: " + Juan.getId() +" \nNombre: "+Juan.getNombreApellidos()+" \nProductos: "+Juan.getProductos()+" -> ");
        System.out.println("Id: " + Sonia.getId()+" \nNombre: "+ Sonia.getNombreApellidos() +" \nProductos: "+Sonia.getHa()+" -> ");
        System.out.println("Id: " + Algodon.getId()+" \nNombre: "+ Algodon.getProductorFederado()+" -> ");
        Interfaz_usuario_programa.saltoParrafo();

        //LLamada al menu
        Menu.menuGestion(hmproductos);
        Interfaz_usuario_programa.saltoParrafo();        

        
        
        /*No borrar
        Listar.listarLinkedHashMap(lhm);
        Interfaz_usuario_programa.saltoParrafo();

        String fechaInicial = Interfaz_usuario_programa.solicitarFechaInicial();
        String fechaFinal = Interfaz_usuario_programa.solicitarFechaFinal();
        System.out.println("Las fechas entre las que se muestran datos son " + fechaInicial + " y " + fechaFinal);

        Listar.listarEntreDosFechas (lhm, fechaInicial, fechaFinal);
         */
    }
}

