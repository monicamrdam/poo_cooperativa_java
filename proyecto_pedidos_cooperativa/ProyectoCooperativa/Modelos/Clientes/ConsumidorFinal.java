package ProyectoCooperativa.Modelos.Clientes;


/**
 * Write a description of class ConsumidorFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsumidorFinal extends Cliente
{
     public ConsumidorFinal(String nombre, String telefono)
    {
        super(nombre, telefono);
    }

    public void cantidadAdquirida(Double cantidad){
       //1 toneada = 1000 kg
       if (cantidad >1000 ){
           System.out.println("No es posible comprar más de 1000 kg");
       }else{
           System.out.println("Cantidad adquirida " + cantidad);
       }
   }
}