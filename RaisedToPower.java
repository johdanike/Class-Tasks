import java.util.Scanner;

public class RaisedToPower{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);


	int num1 = 0;
	int num2 = 0;


	
		for(int count = 1; count <= 2; count++){
		
			System.out.print("Enter integer: ");
			int integer = input.nextInt();	

			if(count == 1)num1 = integer;
			if(count == 2)num2 = integer;
			
			for(int raise = num1; raise <= num2; raise*+){
				System.out.print(raise);
			}	
			
		}

			
	
	}
}