import java.util.*;
public class Test{
	public static void main(String[] args){
		int x = 2;
		int y = 2;
		String textToPrint = "Mazhar";
		java.util.Scanner input = new Scanner(System.in);
		
		
		//x = Integer.parseInt(args[0]); 	// reads argumnet 1 from comand line
		//y = Integer.parseInt(args[1]); 	// reads argumnet 2 from comand line
		//textToPrint = args [2];			// read argument 3
		
		System.out.print("Enter Your Name:");
		textToPrint = input.nextLine();
		
		int j=0;
		for (int i =0; i< x; i++){
			for(j=0; j<y; j++){
				System.out.print(textToPrint + " \t");
			}
			System.out.println(" ");
			
		}
	}
}