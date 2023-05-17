package Coooperativa;


/**
 * Write a description of class DatosCooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DatosCooperativa {
    private int distribuidorFinal;
    private int consumidorFinal;
    private int IVAconsumidorFinal;
    private int limiteHa;

    public DatosCooperativa(int distribuidorFinal, int consumidorFinal, int IVAconsumidorFinal, int limiteHa) {
        this.distribuidorFinal = distribuidorFinal;
        this.consumidorFinal = consumidorFinal;
        this.IVAconsumidorFinal = IVAconsumidorFinal;
        this.limiteHa = limiteHa;
    }

    public int getDistribuidorFinal() {
        return distribuidorFinal;
    }

    public int getConsumidorFinal() {
        return consumidorFinal;
    }

    public int getIVAconsumidorFinal() {
        return IVAconsumidorFinal;
    }

    public int getLimiteHa() {
        return limiteHa;
    }

    public void setDistribuidorFinal(int distribuidorFinal) {
        this.distribuidorFinal = distribuidorFinal;
    }

    public void setConsumidorFinal(int consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    public void setIVAconsumidorFinal(int IVAconsumidorFinal) {
        this.IVAconsumidorFinal = IVAconsumidorFinal;
    }

    public void setLimiteHa(int limiteHa) {
        this.limiteHa = limiteHa;
    }
}