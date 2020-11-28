
/*******************************************************************************
 *  																			*
 *  		Compilation:  javac Assignment3c.java								*
 *  		Execution:    java Assignment3c 									*
 *  																			*
 ********************************************************************************/
import java.util.*;

public class Assignment3c {


    public static void main(String[] args) {
        
		
		String name; 	int count;
		Scanner input = new Scanner(System.in);
		
		System.out.println ("Enter Your Name:");	name = input.next();
		System.out.println ("Enter How many times you want to print your name:");	count = Integer.parseInt(input.next());
		
		
		for (int i=0; i < count; i++)
		{
			System.out.println (name + "   ");	
		}
        
    }
}


