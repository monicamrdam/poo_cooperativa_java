package ProyectoCooperativa.Modelos.Productores;
import ProyectoCooperativa.Controladores.*;

/**
 * Write a description of class PequeñoProductor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PequeñoProductor extends Productor
{
    public PequeñoProductor(String nombre, String telefono)
    {
        super(nombre, telefono);
    }

    public void limiteHa(Integer limiteHa){
        //1 toneada = 1000 kg
        if (limiteHa <=ContabilidadCooperativa.limiteHaAñoFiscal() ){
           
        }else{
             System.out.println("No es posible tener mas de " + ContabilidadCooperativa.limiteHaAñoFiscal() + " si eres un pequeño productor");
        }
    }
}
