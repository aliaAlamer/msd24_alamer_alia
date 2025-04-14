package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * a simple calculator that performs arithmetic operations (addition, subtraction,
 * multiplication, division and calculates the factorial of a number)
 * <p> this class uses Log4j2 for logging debug and error messages </p>
 * 
 * @author [Alia Alamer]
 */
public class Calculator {

   /**
    * Logger instance for Logging debug and error messages
    */
   private static final Logger logger = LogManager.getLogger(Calculator.class);

     /**
      * adds 2 numbers and returns the result
      * 
      * @param number1 the first number to be added
      * @param number2 the second number to be added
      * @return the sum of number1 and number2 
      */
     public double add(double number1, double number2){
        logger.debug("add called with: number1=" + number1 + ", number2=" + number2);
        return number1 + number2;
     }

     /**
      * subtracts 2 numbers and returns the result 
      *
      * @param number1 the number to subtract from
      * @param number2 the number to subtract
      * @return the difference between number1 and number2
      */
     public double minus(double number1, double number2){
        logger.debug("minus called with: number1=" + number1 + ", number2=" + number2);
        return number1 - number2;
     }

     /**
      * multiplies 2 numbers and returns the result
      *
      * @param number1 the first number
      * @param number2 the second number
      * @return the product of number1 and number2
      */
     public double multiply(double number1, double number2){
        logger.debug("multiply called with: number1=" + number1 + ", number2=" + number2);
        return number1 * number2;
     }

     /**
      * divides the first number by the second number and returns the result
      *
      * @param number1 the number to be divided
      * @param number2 the number to divide by
      * @return the quotient of number1 divided by number2
      * @throws ArithmeticException if number2 is 0 (division by 0 is invalid)
      */
     public double divide(double number1, double number2){
        logger.debug("divide called with: number1=" + number1 + ", number2=" + number2);
        if (number2 == 0){
            logger.error("division by 0 isn't allowed");
            throw new ArithmeticException("division by 0 isn't allowed");
        }
        return number1 / number2;
     }

     /**
      * calculates the factorial of a number that isn't negative
      * <p> the factorial of 0 is 1. For negative numbers, the method returns 0. </p>
      * 
      * @param n the number for which the factorial is to be calculated
      * @return the factorial of n
      */
     public int factorial(int n){
      logger.debug("factorial called with: n=" + n);
      if(n < 0){
         return 0;
      }
      if(n == 0){
         return 1;
      }
      return n * factorial(n-1);
     }
}
