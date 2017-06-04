import java.util.Scanner;
import java.util.Random;;

public class GuessingGameMain {
	public static void main(String[] Args){
		
		System.out.println("Welcome to the Guess the Number Game\nPlease Make your Guess:");		
		Integer GuessedNumber;
		
		Random rand = new Random();	
		Integer NumberToGuess = rand.nextInt(50)+1;
		
		Scanner scan = new Scanner(System.in);
		String input =scan.nextLine();
		GuessedNumber = Integer.parseInt(input);
		
		if (NumberToGuess.equals(GuessedNumber)){
			System.out.println("You won!");
		}else if(NumberToGuess>GuessedNumber){
			System.out.println("The target number is greater than your number.");
		}else{
			System.out.println("The target number is less than your number. ");
		}
		
		
		
		
	}

}
