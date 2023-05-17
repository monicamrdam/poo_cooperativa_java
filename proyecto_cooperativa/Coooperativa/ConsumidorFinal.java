package Coooperativa;


/**
 * Write a description of class ConsumidorFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConsumidorFinal extends Cliente {
    private String nif;

    public ConsumidorFinal(String nif, String nombre, String telefono) {
        super(nombre, telefono);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}