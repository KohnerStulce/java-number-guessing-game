import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("\nI'm thinking of a number between 1-100");
		
		Random random = new Random();
		int secretNum = random.nextInt(100) + 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your guess: ");
		int guess = input.nextInt();
		
		while(guess != secretNum) {
			if(secretNum > guess) {
				System.out.println("Too Low!\nEnter another guess: ");
			} else if(secretNum < guess) {
				System.out.println("Too High!\nEnter another guess: ");
			}
			guess = input.nextInt();
		}
		System.out.println("You Win!");
		input.close();
	}
}
