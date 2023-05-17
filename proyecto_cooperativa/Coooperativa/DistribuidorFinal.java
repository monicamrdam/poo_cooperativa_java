package Coooperativa;


/**
 * Write a description of class DistribuidorFinal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DistribuidorFinal extends Cliente {
    private String cif;

    public DistribuidorFinal(String cif, String nombre, String telefono) {
        super(nombre, telefono);
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }
}
