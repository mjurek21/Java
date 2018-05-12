package prog007_Conditionals_ex2;
import java.util.Scanner;
public class Recursion {
/*
 * Method which is counting down from a given number down to zero
 */
	public static void countDown(int x){
		if (x<0){
			System.out.println("Finished");
		}
		else{
			System.out.println(x);
			countDown(x-1);
		}
	}
	/*
	 * Method which is counting up from zero up to a given number
	 */
	public static void countUp(int i, int max){
		if (i==max){
			System.out.println(i);
			System.out.println("Finished");
		}
		else{
			System.out.println(i);
			countUp(i+1,max);
		}
	}
	/*
	 * Method defines a program menu
	 */
	public static void menu(){
		String word;//additional variable for error detection 
		//during getting of inputs
		int number;
		int option;
		int countUp=0;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("1. Count up from zero to a given number");
		System.out.println("2. Count down from a given number down to zero");
		System.out.print("Chose an option: ");
		
		if(!in.hasNextInt()){
			word=in.next();		
			System.err.println(word+" is not an integer");
		}
		option=in.nextInt();
		if(option==1){
			System.out.print("Give a number to which will be counted up: ");
			if(!in.hasNextInt()){
				word=in.next();		
				System.err.println(word+" is not an integer");
			}
			number=in.nextInt();
			countUp(countUp,number);
		}
		if(option==2){
			System.out.print("Give a number, which will be counted down: ");
			if(!in.hasNextInt()){
				word=in.next();		
				System.err.println(word+" is not an integer");
			}
			number=in.nextInt();
			countDown(number);
		}
		if(option!=1&&option!=2){
			System.out.print("You can chose only 1 and 2!");
		}
	}	
	public static void main(String[] args) {

/*
 * Displaying a program menu
 */
		menu();
	}
}
