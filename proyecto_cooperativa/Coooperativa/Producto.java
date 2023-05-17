package Coooperativa;


/**
 * Write a description of class Producto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Producto {
    private String idProducto;
    private String nombreProducto;
    private int extensionHA;
    private double rendimientoPorHa;
    private double valorReferenciaSinIVA;
    private boolean esPerecedero;

    public Producto(String idProducto, String nombreProducto, int extensionHA, double rendimientoPorHa,
                    double valorReferenciaSinIVA, boolean esPerecedero) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.extensionHA = extensionHA;
        this.rendimientoPorHa = rendimientoPorHa;
        this.valorReferenciaSinIVA = valorReferenciaSinIVA;
        this.esPerecedero = esPerecedero;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public int getExtensionHA() {
        return extensionHA;
    }

    public double getRendimientoPorHa() {
        return rendimientoPorHa;
    }

    public double getValorReferenciaSinIVA() {
        return valorReferenciaSinIVA;
    }

    public boolean esPerecedero() {
        return esPerecedero;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setExtensionHA(int extensionHA) {
        this.extensionHA = extensionHA;
    }

    public void setRendimientoPorHa(double rendimientoPorHa) {
        this.rendimientoPorHa = rendimientoPorHa;
    }

    public void setValorReferenciaSinIVA(double valorReferenciaSinIVA) {
        this.valorReferenciaSinIVA = valorReferenciaSinIVA;
    }

    public void setEsPerecedero(boolean esPerecedero) {
        this.esPerecedero = esPerecedero;
    }
     @Override
    public String toString() {
        return "Producto: " + nombreProducto + ", ID: " + idProducto + ", Extensión (HA): " + extensionHA +
                ", Rendimiento por HA: " + rendimientoPorHa + ", Valor referencia sin IVA: " + valorReferenciaSinIVA +
                ", Es perecedero: " + esPerecedero;
    }
}