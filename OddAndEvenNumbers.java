import java.util.Scanner;
public class OddAndEvenNumbers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int sumOdd = 0;
	int sumEven = 0;

		for(int num = 1; num <= 10; num ++){

			System.out.printf("Enter (%d) number: ", num);
			int number = input.nextInt();
			if(number % 2 == 1)sumOdd += number;
			if(number % 2 == 0)sumEven += number;

		}

	System.out.printf("%nThe sum of the odd numbers is = %d", sumOdd);
	System.out.printf("%nThe sum of the even numbers is = %d%n", sumEven);


	}
}