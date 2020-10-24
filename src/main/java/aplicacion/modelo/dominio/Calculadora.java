package aplicacion.modelo.dominio;

public class Calculadora {
    private Ecuacion ecuacion;



    public double sumar(double a, double b){
        return a+b;
    }
    
    public double restar(double a, double b){
        return a-b;
    }

    public Ecuacion getEcuacion(){
        return this.ecuacion;
    }

    public void setEcuacion(Ecuacion ecuacion){
        this.ecuacion = ecuacion;
    }


}
