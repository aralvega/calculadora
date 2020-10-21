package aplicacion.modelo.dominio;

/**
 * EcuacionLineal
 */
public class EcuacionLineal extends Ecuacion{
    private double a;
    private double b;

    @Override
    public double resolverEcuacion(double x){
        return a*x+b;
    }
    
}