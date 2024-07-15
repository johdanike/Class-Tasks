import java.util.Scanner;

public class UsingArraysToCollect10Scores{

	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	System.out.println("Program that collects 10 numbers from user and outputs then\n");

	int score1 =0;
	int score2 =0;
	int score3 = 0;
	int score4 =0;
	int score5 = 0;
	int score6 = 0;
	int score7 =0;
	int score8 = 0;
	int score9 = 0;
	int score10 = 0;
	int scores = 0;
	int loops = 1;

		for(loops = 1; loops <= 10; loops++){

			System.out.printf("Enter (%d) number: ", loops);
			scores = input.nextInt(); 

			if(loops == 1)score1 = scores;
			if(loops == 2)score2 = scores;
			if(loops == 3)score3 = scores;
			if(loops == 4)score4 = scores;
			if(loops == 5)score5 = scores;
			if(loops == 6)score6 = scores;
			if(loops == 7)score7 = scores;
			if(loops == 8)score8 = scores;
			if(loops == 9)score9 = scores;
			if(loops == 10)score10 = scores;




			
		}

			if(score1 % 2 == 0)System.out.printf("Even Score = %d%n",score1);
			if(score2 % 2 == 0)System.out.printf("Even Score = %d%n",score2);
			if(score3 % 2 == 0)System.out.printf("Even Score = %d%n",score3);
			if(score4 % 2 == 0)System.out.printf("Even Score = %d%n",score4);
			if(score5 % 2 == 0)System.out.printf("Even Score = %d%n",score5);
			if(score6 % 2 == 0)System.out.printf("Even Score = %d%n",score6);
			if(score7 % 2 == 0)System.out.printf("Even Score = %d%n",score7);
			if(score8 % 2 == 0)System.out.printf("Even Score = %d%n",score8);
			if(score9 % 2 == 0)System.out.printf("Even Score = %d%n",score9);
			if(score10 % 2 == 0)System.out.printf("Even Score = %d%n",score10);
			




			

	}
}