package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

   private static final Logger logger = LogManager.getLogger(Calculator.class);

     public double add(double number1, double number2){
        logger.debug("add called with: number1=" + number1 + ", number2=" + number2);
        return number1 + number2;
     }

     public double minus(double number1, double number2){
        logger.debug("minus called with: number1=" + number1 + ", number2=" + number2);
        return number1 - number2;
     }

     public double multiply(double number1, double number2){
        logger.debug("multiply called with: number1=" + number1 + ", number2=" + number2);
        return number1 * number2;
     }

     public double divide(double number1, double number2){
        logger.debug("divide called with: number1=" + number1 + ", number2=" + number2);
        if (number2 == 0){
            logger.error("division by 0 isn't allowed");
            throw new ArithmeticException("division by 0 isn't allowed");
        }
        return number1 / number2;
     }

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
