package ProyectoCooperativa.Controladores;

/**
 * Write a description of class ContabilidadCooperativa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContabilidadCooperativa
{
    private static Double gananciaCooperativaDistribuidorFinal;
    private static Double gananciaCooperativaConsumidorFinal;
    private static Double porcentajeIVA;
    private static Double incrementoPrecio;

    public Double gananciaDistribuidorfinal(Double cantidad){
        gananciaCooperativaDistribuidorFinal =0.05;
        incrementoPrecio = cantidad * gananciaCooperativaDistribuidorFinal;
        return incrementoPrecio;
    }

    public Double gananciaConsumidorFinal(Double cantidad){
        gananciaCooperativaConsumidorFinal =0.15;
        incrementoPrecio = cantidad * gananciaCooperativaConsumidorFinal;
        return incrementoPrecio;
    }

    public Double IVA(Double cantidad){
        porcentajeIVA =0.10;
        incrementoPrecio = cantidad * gananciaCooperativaConsumidorFinal;
        return incrementoPrecio;
    }
}
