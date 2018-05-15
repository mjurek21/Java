package prog009_ValueMethods;
import java.util.Scanner;

/**
 * Method is checking if two integers are divisible 
 * @author mjurek21
 *@param m first factor (Dividend)
 *@param n second second (Divider)
 *@return true m%n==0
 *@return false m%n!=0
 */
public class ValueMethod {

	public static boolean isDivisible(int n, int m){
		if (n%m==0) return true;
		else return false;
	}
	public static void main(String[] args) {
		int factor1, factor2;
		Scanner in=new Scanner(System.in);
		System.out.print("Give dividend:");
		factor1=in.nextInt();
		System.out.print("Give divider:");
		factor2=in.nextInt();
		if (isDivisible(factor1, factor2)){
			System.out.println("m is divisible through n");
		}
		else{
			System.out.println("m is NOT divisible through n");
		}
	}

}
