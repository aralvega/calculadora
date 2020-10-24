package aplicacion.modelo.dominio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void sumarNumerosEnteros(){
        //init
        Calculadora calculadora = new Calculadora();
        //define values
        double a=12;
        double b=13;
        //evaluation
        assertEquals(25, calculadora.sumar(a, b));
    }
    @Test
    public void sumarNumerosNegativos(){
        //init
        Calculadora calculadora = new Calculadora();
        //define values
        double a=-5;
        double b=-7;
        //evaluation
        assertEquals(-12, calculadora.sumar(a, b));
    }
    @Test
    public void restNumerosNegativos(){
        //init
        Calculadora calculadora = new Calculadora();
        //define values
        double a=-5;
        double b=-7;
        //evaluation
        assertEquals(2, calculadora.restar(a, b));
    }

    @Test
    public void evaluarEcuacionLineal(){
        //define previus values
        double a=5;
        double b=7;
        Ecuacion ecuacion = new EcuacionLineal(a,b);
        //init
        Calculadora calculadora = new Calculadora();
        //define values
        double x =1;
        calculadora.setEcuacion(ecuacion);
        //evaluation  
        assertEquals(12d, calculadora.getEcuacion().resolverEcuacion(x));
    }
}
