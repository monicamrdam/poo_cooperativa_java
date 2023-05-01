package ProyectoCooperativa;
import ProyectoCooperativa.Interfaces.*;
import ProyectoCooperativa.Controladores.*;
import ProyectoCooperativa.Modelos.Producto.*;
import ProyectoCooperativa.Modelos.Productor.*;
import java.math.BigInteger;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

/**
 * Write a description of class Cooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cooperativa
{
    //Datos productores
    private static List<Productor> integrantes = new ArrayList<Productor>();
    private static List<Producto> productosJuan = new ArrayList<Producto>();

    private static PequeñoProductor Juan;
    private static PequeñoProductor Sonia;
    private static ProductorFederado Algodon;

    //Datos Anuales
    private static Map <String, String> lhm;

    public static void cargarDatos(){

        //Datos Productores
        Random random = new Random();
        //Generar idAleatorios
        //new BigInteger(50, random).toString(32);
        Producto p1 = new Producto (1, "naranjos", 1.5, 80,2.5);
        Producto p2 = new Producto(2, "algodón", 0.5, 60,3.5);
        Producto p3 = new Producto(3, "melocotón", 1.5, 40,3.5);
        productosJuan.add(p1);
        productosJuan.add(p2);
        productosJuan.add(p3);      

        Juan = new PequeñoProductor(new BigInteger(50, random).toString(32), "Juan P", 2, productosJuan);
        Sonia = new PequeñoProductor(new BigInteger(50, random).toString(32),"Sonia R", 4.1,productosJuan);
        Algodon = new ProductorFederado(new BigInteger(50, random).toString(32),"Algodon S.A.", "Algodon");
        integrantes.add(Juan);
        integrantes.add(Sonia);
        integrantes.add(Algodon);

        //Datos Ventas Anuales        
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
        System.out.println(Sonia.getId()+" "+ Sonia.getNombreApellidos() +" "+Sonia.getHa()+" -> ");
        System.out.println(Algodon.getId()+" "+Algodon.getProductorFederado()+" -> ");
        Interfaz_usuario_programa.saltoParrafo();

        Listar.listarLinkedHashMap(lhm);
        Interfaz_usuario_programa.saltoParrafo();

        String fechaInicial = Interfaz_usuario_programa.solicitarFechaInicial();
        String fechaFinal = Interfaz_usuario_programa.solicitarFechaFinal();
        System.out.println("Las fechas entre las que se muestran datos son " + fechaInicial + " y " + fechaFinal);

        Listar.listarEntreDosFechas (lhm, fechaInicial, fechaFinal);

    }
}

