import java.util.Scanner;

public class LoopsAndRecursion {
	/**
	 * Method is getting a double value from user
	 * @return verified double value
	 */
	public static double getDouble(){
		double result;
		Scanner in=new Scanner(System.in);
		while (!in.hasNextDouble()){
			String word=in.next();
			System.err.print("Given value \""+word+"\" is not a double, try again: ");
		}
		result=in.nextDouble();
		return result;
	}
	/**
	 * Method is getting a integer value from user
	 * @return verified integer value
	 */
	public static int getInt(){
		int result;
		Scanner in=new Scanner(System.in);
		while (!in.hasNextInt()){
			String word=in.next();
			System.err.print("Given value \""+word+"\" is not an integer, try again: ");
		}
		result=in.nextInt();
		return result;
	}
	public static double powerRecursion(double x, int n){
		double result=1;
		if (n==0){
			return 1;
		}
		if (n>0){
			result=Math.pow(x, n)*powerRecursion(x, n-1);
			return result;
		}
		return -1;
	}
	public static double powerLoop(double x, int n){
		double result=1;
		while (n>0){
			result=result*Math.pow(x, n);
			n--;
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nFactor;
		double dFactor;
		double resultRecursion;
		double resultLoop;
		System.out.print("Please give an integer: ");
		nFactor=getInt();
		System.out.print("Please give an double: ");
		dFactor=getDouble();
		resultRecursion=powerRecursion(dFactor, nFactor);
		System.out.println("Recursive power: "+resultRecursion);
		resultLoop=powerLoop(dFactor, nFactor);
		System.out.println("Loop power: "+resultLoop);
	}

}
