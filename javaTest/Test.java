public class Test{
	public static void main(String[] args){
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		String textToPrint = args [2];
		int j=0;
		for (int i =0; i< x; i++){
			for(j=0; j<y; j++){
				System.out.print(textToPrint + " \t");
			}
			System.out.println(" ");
		}
	}
}