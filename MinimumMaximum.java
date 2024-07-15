import java.util.Scanner;

public class MinimumMaximum{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	int number = 0;
	int num1 =0;
	int num2 =0;
	int num3 = 0;
	int num4 =0;
	int num5 = 0;
	int num6 = 0;
	int num7 =0;
	int num8 = 0;
	int num9 = 0;
	int num10 = 0;
	int smallestNum = 0;
	int largestNum = 0;



	for(int loop = 1; loop <= 10; loop++){

		System.out.printf("Enter (%d) number: ", loop);
		number = input.nextInt();

			if(loop == 1)num1 = number;
			if(loop == 2)num2 = number;
			if(loop == 3)num3 = number;
			if(loop == 4)num4 = number;
			if(loop == 5)num5 = number;
			if(loop == 6)num6 = number;
			if(loop == 7)num7 = number;
			if(loop == 8)num8 = number;
			if(loop == 9)num9 = number;
			if(loop == 10)num10 = number;
			
	}	
		if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5 && num1 > num6 && num1 > num7 && num1 > num8 && num1 > num9 && num1 > num10)largestNum = num1;
		else if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5 && num1 < num6 && num1 < num7 && num1 < num8 && num1 < num9 && num1 < num10)smallestNum = num1;
	
		if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6 && num2 > num7 && num2 > num8 && num2 > num9 && num2 > num10)largestNum = num2;
		else if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5 && num2 < num6 && num2 < num7 && num2 < num8 && num2 < num9 && num2 < num10)smallestNum = num2;
	
		if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6 && num3 > num7 && num3 > num8 && num3 > num9 && num3 > num10)largestNum = num3;
		else if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5 && num3 < num6 && num3 < num7 && num3 < num8 && num3 < num9 && num3 < num10)smallestNum = num3;

		if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6 && num4 > num7 && num4 > num8 && num4 > num9 && num4 > num10)largestNum = num4;
		else if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5 && num4 < num6 && num4 < num7 && num4 < num8 && num4 < num9 && num4 < num10)smallestNum = num4;

		if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6 && num5 > num7 && num5 > num8 && num5 > num9 && num5 > num10)largestNum = num5;
		else if(num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4 && num5 < num6 && num5 < num7 && num5 < num8 && num5 < num9 && num5 < num10)smallestNum = num5;
		
		if(num6 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6 && num5 > num8 && num5 > num9 && num5 > num10 && num5 > num7)largestNum = num6;
		else if(num6 < num1 && num6 < num2 && num6 < num3 && num6 < num4 && num6 < num5 && num6 < num8 && num6 < num9 && num6 < num10 && num6 < num7)smallestNum = num6;

		if(num7 > num1 && num7 > num2 && num7 > num3 && num7 > num4 && num7 > num6 && num7 > num8 && num7 > num9 && num7 > num10 && num7 > num5)largestNum = num7;
		else if(num7 < num1 && num7 < num2 && num7 < num3 && num7 < num4 && num7 < num6 && num7 < num8 && num7 < num9 && num7 < num10 && num7 < num5)smallestNum = num7;

		if(num8 > num1 && num8 > num2 && num8 > num3 && num8 > num4 && num8 > num6 && num8 > num8 && num8 > num9 && num8 > num10 && num7 > num5)largestNum = num8;
		else if(num8 < num1 && num8 < num2 && num8 < num3 && num8 < num4 && num8 < num6 && num8 < num7 && num8 < num9 && num8 < num10 && num8 < num5)smallestNum = num8;

		if(num9 > num1 && num9 > num2 && num9 > num3 && num9 > num4 && num9 > num5 && num9 > num6 && num9 > num7 && num9 > num8 && num9 > num10)largestNum = num9;
		else if(num9 < num1 && num9 < num2 && num9 < num3 && num9 < num4 && num9 < num5 && num9 < num6 && num9 < num7 && num9 < num8 && num9 < num10)smallestNum = num9;

		if(num10 > num1 && num10 > num2 && num10 > num3 && num10 > num4 && num10 > num5 && num10 > num6 && num10 > num7 && num10 > num8 && num10 > num9)largestNum = num10;
		else if(num10 < num1 && num10 < num2 && num10 < num3 && num10 < num4 && num10 < num5 && num10 < num6 && num10 < num7 && num10 < num8 && num10 < num9)smallestNum = num10;


		


		System.out.println("Maximun number is = "+largestNum);
		System.out.println("Minimum number is = "+smallestNum);


	}
}
