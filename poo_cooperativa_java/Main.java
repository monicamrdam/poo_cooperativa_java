import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.Random;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    private static List<Productores> integrantes = new ArrayList<Productores>();
    private static List<Producto> productosJuan = new ArrayList<Producto>();

    private static PequeñosProductores Juan;
    private static PequeñosProductores Sonia;
    private static ProductoresFederados Algodon;

    private static void cargarDatos() {
        Random random = new Random();
        //Generar idAleatorios
        //new BigInteger(50, random).toString(32);
        Producto p1 = new Producto (1, "naranjos", 1.5, 80,2.5);
        Producto p2 = new Producto(2, "algodón", 0.5, 60,3.5);
        Producto p3 = new Producto(3, "melocotón", 1.5, 40,3.5);
        productosJuan.add(p1);
        productosJuan.add(p2);
        productosJuan.add(p3);      
        
        
        Juan = new PequeñosProductores(new BigInteger(50, random).toString(32), "Juan P", 2, productosJuan);
        Sonia = new PequeñosProductores(new BigInteger(50, random).toString(32),"Sonia R", 4.1,productosJuan);
        Algodon = new ProductoresFederados(new BigInteger(50, random).toString(32),"Algodon S.A.", "Algodon");
        integrantes.add(Juan);
        integrantes.add(Sonia);
        integrantes.add(Algodon);
    }

    public static void main(String[] args) {
        Main.cargarDatos();
        System.out.println("Datos Productores");
        System.out.println("Id: " + Juan.getId() +" \nNombre: "+Juan.getNombreApellidos()+" \nProductos: "+Juan.getProductos()+" -> ");
        System.out.println(Sonia.getId()+" "+ Sonia.getNombreApellidos() +" "+Sonia.getHa()+" -> ");
        System.out.println(Algodon.getId()+" "+Algodon.getProductorFederado()+" -> ");
    }

}
