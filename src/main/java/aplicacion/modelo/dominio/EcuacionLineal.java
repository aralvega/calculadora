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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    
    
}