
/*******************************************************************************
 *  																			*
 *  		Compilation:  javac Assignment3b.java								*
 *  		Execution:    java Assignment3b 									*
 *  																			*
 ********************************************************************************/
import java.util.*;

public class Assignment3b {

    public static void main(String[] args) {
        
		
		// Declaration
		int number1, number2;
        
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter Number 1:");	number1 = Integer.parseInt(input.next());		
		System.out.println ("Enter Number 2:");	number2 = Integer.parseInt(input.next());
		
		
        System.out.println ("First Number = " + number1);
        System.out.println ("Second Number = " + number2);
        
		if (number1 > number2){
			//printing results
			System.out.println ("First number is greater.");
		}
		else if (number1 < number2){
			//printing results
			System.out.println ("Second number is greater.");
		}
		else {
			//printing results
			System.out.println ("Both Numbers are Equal.");
		}
		
		
		
        
    }
}


