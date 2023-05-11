package ProyectoCooperativa.Controladores;


/**
 * Write a description of class Logistica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logistica
{
    private static Double distancia; //km
    private static Double costeGranPorkgkm; //€
    private static Double costePequeñaPorkgkm; //€
    
    public void productosPerecederos(Double distancia){
        if (distancia <100){
            
        }
        if (distancia >=100){
            /*Producto Perecedero 140 km
         * gran logistica 2 tramos 40 km
         * pequeña logistica 1 tramo maximo 100 km
         */ 
        }
    }
    public void productosNoPerecederos(Double distancia){
        
        if (distancia <100){
            
        }
        //por cada tonelada
        if (distancia >=100){
        /*Producto noPerecedero 180 km
         * gran logistica 3 tramos 50 km
         * pequeña logistica 1 tramo 30 km
         */ 
        costeGranPorkgkm = 0.05; //€
        costePequeñaPorkgkm = 0.01; //€
        
        }
    }
    
    public void ofertasGranLogistica(){
        
    }
    public void ofertasPequeñaLogistica(){
        
    }
}
