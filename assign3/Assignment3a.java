
/*******************************************************************************
 *  																			*
 *  		Compilation:  javac Assignment3a.java								*
 *  		Execution:    java Assignment3a 									*
 *  																			*
 ********************************************************************************/

public class Assignment3a {

    public static void main(String[] args) {
        
		// Declaration
		int number1, number2, sum , sub, mul;
		float div;
        
		// assignment
		number1 = 80;
		number2 = 20; 
        
		// expressions
		sum = number1 + number2;
		sub = number1 - number2;
		mul = number1 * number2;
		div = number1 / number2;
		
		
		//printing results
        System.out.println(number1 + " + "  + number2 + " = " + sum);
        System.out.println(number1 + " - "  + number2 + " = " + sub);
        System.out.println(number1 + " * "  + number2 + " = " + mul);
        System.out.println(number1 + " / "  + number2 + " = " + div);
    }
}


