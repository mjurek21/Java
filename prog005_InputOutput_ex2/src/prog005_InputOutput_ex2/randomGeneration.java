package prog005_InputOutput_ex2;
import java.util.Scanner;
import java.util.Random;

public class randomGeneration {
	public static void main(String[] args) {
		//Initialization of variables
		int dice; //define type of RPG dice
		int randNum;//help variable for random generation of dice value
		//initialization of inputs
		Scanner in=new Scanner(System.in);
		Random random=new Random();
		//Dice type definition
		System.out.print("Chose the dice type: ");
		dice=in.nextInt();
		randNum=random.nextInt(dice)+1;
		System.out.println("Dice type: "+dice);
		System.out.println("Selected value: "+randNum);

	}

}
