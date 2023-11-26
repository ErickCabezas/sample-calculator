package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String [] arg){
        System.out.println("== Calculator Execute==");

        Calculator c= new Calculator();
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7)= "+addition);

        int substracion = c.subtraction(7, 1);
        System.out.println("c.substraction(7,1)= "+substracion);
    }
}
