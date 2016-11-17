/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author John
 */
public class CalculatorTest {
    
    public CalculatorTest() {
    }
    

    @Test
    public void testCalculator() {
        String numbers = "//[new][,]\n1,2new1000";
        
        StringCalculator calc = new StringCalculator();
        int res = calc.add(numbers);
        
        assertEquals(3, res);
    }
    

}
