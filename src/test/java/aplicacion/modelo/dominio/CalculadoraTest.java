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
}
