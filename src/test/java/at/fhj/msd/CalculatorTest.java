package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest{
    Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @Test
    void testAddValues(){
        double result = calc.add(2, 2);
        assertEquals(4, result, "the result of 2 + 2 should be 4");
    }

    @Test
    void testAddNegativNum(){
        double result1 = calc.add(2, -4);
        assertEquals(-2, result1, "the result of 2 + (-4) should be -2");
    }

    @Test
    void testAddWithZero(){
        double result2 = calc.add(2, 0);
        assertEquals(2, result2, "the result of 2 + 0 should be 2");
    }


    @Test
    void testMultiplyValues(){
        double result3 = calc.multiply(2, 2);
        assertEquals(4, result3, "the result of 2 * 2 should be 4");
    }

    @Test
    void testMultiplyNagativNum(){
        double result4 = calc.multiply(2, -2);
        assertEquals(-4, result4, "the result of 2 * -2 should be -4");
    }

    @Test
    void testMultiplyWithZero(){
        double result5 = calc.multiply(2, 0);
        assertEquals(0, result5, "the result of 2 * 0 should be 0");
    }


    @Test
    void testSubValues(){
        double result6 = calc.minus(4, 2);
        assertEquals(2, result6, "the result of 4 - 2 should be 2");
    }

    @Test
    void testSubNegativeNum(){
        double result7 = calc.minus(2, -4);
        assertEquals(6, result7, "the result of 2 - (-4) should be 6");
    }

    @Test
    void testSubWithZero(){
        double result8 = calc.minus(0, 2);
        assertEquals(-2, result8, "the result of 0 - 2 should be -2");
    }


    @Test
    void testDivValues(){
        double result9 = calc.divide(4, 2);
        assertEquals(2, result9, "the result of 4 / 2 should be 2");
    }

    @Test
    void testDivNegativNum(){
        double result10 = calc.divide(4, -2);
        assertEquals(-2, result10, "the result of 4 / -2 should be -2");
    }

    @Test
    void testDivWithZero(){
        double result11 = calc.divide(0, 2);
        assertEquals(0, result11, "the result of 0/2 should be 0");
    }

    @Test
void exceptionTest() {
    ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
        calc.divide(4, 0);
    });
    assertEquals("division by 0 isn't allowed", exception.getMessage());
}

    @Test
    void testFactorial5(){
        int result12 = calc.factorial(5);
        assertEquals(120, result12, "the answer of 5! should be 120");
    }

    @Test
    void testFactorial0(){
        int result13 = calc.factorial(0);
        assertEquals(1, result13, "the answer of 0! should be 1");
    }

    @Test
    void testFactorialNegativ(){
        int result14 = calc.factorial(-3);
        assertEquals(0, result14, "the result of -3! should be 0");
    }
}
