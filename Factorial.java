import java.util.Scanner;

public class Factorial{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

		int factorial = 1;
		int loops = 0;
		System.out.print("Enter number to get the factorial: ");
		int number = input.nextInt();

		for(loops = 1; loops <= number; loops++){
			number -= 1;
		
			factorial *= (number+1);
			System.out.print(number+1);
			//System.out.print(factorial);
		}
	}
}


/**factorial = 1
counter = 1
for decrement in range (0, number):
	number -= 1
	print(number+1," ", end="")

	factorial *= (number+1)
print("\n\nThe Factorials of the number equals = ",factorial) 
	**/