package prog008_Conditionals_ex3;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
/*Method is verifing if the random number is the same as the number given by user
 * If the user number is incorrect method gives the user a next chance to guess.
 */
	public static void guess(int randInput){
		int userNumber;
		Scanner in=new Scanner(System.in);
		System.out.print("Guess a number: ");
		userNumber=in.nextInt();	
		if(randInput==userNumber){
			System.out.println("You guessed the number correctly!!!");
			return;
		}
		if(randInput<userNumber){
			System.out.println("The random number is smaller as yours, try again!");
			guess(randInput);
		}		
		if(randInput>userNumber){
			System.out.println("The random number is bigger as yours, try again!");
			guess(randInput);
		}			
	}
	public static void main(String[] args) {
		int randNumber;
		Random random= new Random();
		randNumber=random.nextInt(100)+1;
		//System.out.println("The random number is: " +randNumber);
		guess(randNumber);
	}
}
