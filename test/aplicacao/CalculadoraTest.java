package aplicacao;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hedon
 */
public class CalculadoraTest {
    
    public CalculadoraTest() {
    }

    @Test
    public void testSoma() {
        int result = Calculadora.soma(1, 999999999);
        assertFalse(result > 999999999);
    }
    @Test
    public void testSoma2() {
       
        assertEquals(4, Calculadora.soma(2, 2));
    }
    @Test
    public void testSoma3() {
        assertEquals(0, Calculadora.soma(6, 2));
    }
    @Test
    public void testSoma4() {
        assertEquals(7, Calculadora.soma(5, 2));
    }
    @Test
    public void testSub() {
        assertEquals(5, Calculadora.subtracao(3, -2));
    }
        @Test
    public void testSub2() {
        int result = Calculadora.subtracao(0, -1);
        assertFalse(result > 0);
        
    }
        @Test
    public void testSub3() {
        assertEquals(2, Calculadora.subtracao(2, 2));
       
    }
        @Test
    public void testSub4() {
        assertEquals(4, Calculadora.subtracao(7, 3));
    }
    
    @Test
    
    public void testProd() {
        assertEquals(0, Calculadora.produto(0, 25));        
    }
    @Test
    public void testProd2() {       
        assertEquals(-14, Calculadora.produto(2, -7));   
    }
    @Test
    public void testProd3() {       
        assertEquals(0, Calculadora.produto(0, 25));      
    }
    
     @Test
    public void testDivi() {              
        assertEquals(5, Calculadora.divisao(10, 2)); 
    }
     @Test
    public void testDivi2() {              
        assertEquals(423908, Calculadora.divisao(999999999, 2359)); 
    }
     @Test
    public void testDivi3() {              
        assertEquals(0, Calculadora.divisao(1, 0)); 
    }
     @Test
    public void testDivi4() {              
        assertEquals(10, Calculadora.divisao(100, 10)); 
    }
    
}