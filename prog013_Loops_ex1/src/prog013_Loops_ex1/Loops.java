package prog013_Loops_ex1;
import java.util.Scanner;

public class Loops {

	/**
	 * Function gets an user double value and returns it after correctness check
	 * @return checked double value
	 */
	public static double getDouble(){
		Scanner in=new Scanner(System.in);
		double value;
		while(!in.hasNextDouble()){
			String word=in.next();
			System.err.print("Given value: \""+word+"\" is not a double, please give a double value: ");
		}
		value=in.nextDouble();
		return value;
	}
/**
 * FUnction is calculating an estimated value of square root from a given number
 * @param number double value given by user
 * @return Gives an estimation of square root from given value
 */
	public static double squareRoot(double number){
		double x0=number/2;
		while (Math.abs(((x0+number/x0)/2)-(((x0+number/x0)/2
				+number/((x0+number/x0)/2))/2))>0.0001){
			x0=(x0+number/x0)/2;
		}
		return x0;
	}
	public static void main(String[] args) {
		double factor;
		System.out.print("Give a value for square root calculation: ");
		factor=getDouble();
		squareRoot(factor);
		System.out.println("Estimation of square root of given value is: "+squareRoot(factor));

	}

}
