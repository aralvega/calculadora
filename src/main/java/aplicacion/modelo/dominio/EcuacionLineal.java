package aplicacion.modelo.dominio;

/**
 * EcuacionLineal
 */
public class EcuacionLineal extends Ecuacion{
    private double a;
    private double b;

    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b=b;
    }

    @Override
    public double resolverEcuacion(double x){
        return a*x+b;
    }   
    
}