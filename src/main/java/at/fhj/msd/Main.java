package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main( String[] args ){

        Calculator calculate = new Calculator();

        System.out.println(calculate.add(2, 4));

        System.out.println(calculate.minus(2, 4));

        System.out.println(calculate.multiply(2, 4));

        try{
        System.out.println(calculate.divide(2, 0));
        } catch (ArithmeticException a){
            System.out.println(a.getMessage());
        }

        System.out.println(calculate.divide(2, 4));

        System.out.println("Alia Alamer");

        logger.info("this is an info message (Level INFO)");
        logger.error("this is an error message (Level ERROR)");
    }
    
}
