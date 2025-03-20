package at.fhj.msd;

public class Main 
{
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
    }
    
}
