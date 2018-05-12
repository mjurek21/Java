package prog006_Conditionals_ex1;
import java.util.Scanner;
public class Conditionals_ex1 {

	/*Definiotion of logartithm method
	 * -with check if the given number is negative
	 */
	public static void printLogartithm(double x) {	
		double result;
		if (x<=0){
			System.err.println("Error! Number has to be positive!");
			return;
		}
		result=Math.log(x);
		System.out.println("The log of x is: " +result);
	}
	
	public static void main(String[] args) {
		double x;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a number: ");
		//Elimination of risk that user is giving not a double
		if(!in.hasNextDouble()){
			String word=in.next();
			System.err.println(word+" is not a double");
			return;
		}
		x=in.nextDouble();
		printLogartithm(x);

	}

}
