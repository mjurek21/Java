package prog016_Loops_ex3;
import java.util.Scanner;

public class EstimatedExp {
/**
 * Method estimates an EXP value
 * @param x argument raised to power
 * @param n power
 * @return estimation of EXP
 */
	public static double myexp(double x, int n){
		double result=0;
		double nHelp=1;
		for (int i=1; i<n;i++){
			nHelp=nHelp*i;
			result+=Math.pow(x,i)/nHelp;
		}
		result++;//add a value for n=0
		return result;
	}
	/**
	 * Method estimates an EXP value
	 * @param x argument raised to power
	 * @param n power
	 * @return estimation of EXP
	 */
	public static double myexp1(double x, int n){
		double next=1;
		double result=1;//initial value for calculation "1" for n=0
		double nHelp=1;
		for (int i=1; i<n;i++){
			nHelp=nHelp*i;
			next=next*x/i;
			result=result+next;
		}
		return result;
	}
/**
 * Method is getting an integer variable from user
 * Method is checking if variable is an integer
 * Method asks user for correction of variable type if necessary 
 * @return checked integer value
 */
	public static int getInt(){
		int value=0;
		Scanner in=new Scanner(System.in);
		while(!in.hasNextInt()){
			String word=in.next();
			System.err.print("Given variable \""+word+"\"is not an integer, try again: ");
		}
		value=in.nextInt();
		return value;
	}
	/**
	 * Method is getting a double variable from user
	 * Method is checking if variable is a double type
	 * Method asks user for correction of variable type if necessary 
	 * @return checked double value
	 */
	public static double getDouble(){
		double value=0;
		Scanner in=new Scanner(System.in);
		while(!in.hasNextDouble()){
			String word=in.next();
			System.err.print("Given variable \""+word+"\"is not an integer, try again: ");
		}
		value=in.nextDouble();
		return value;
	}
	/**
	 * Method is checking both estimation and compare with real Math.exp()
	 */
	public static void checkEXP(){
		double doFactor;
		int intFactor;
		System.out.print("Give a double variable: ");
		doFactor=getDouble();
		System.out.print("Give an integer variable: ");
		intFactor=getInt();
		System.out.println("Estiated value of EXP is: "+myexp(doFactor,intFactor));
		System.out.println("Estiated value of EXP(second method) is: "+myexp1(doFactor,intFactor));
		System.out.println("Real value of EXP is: "+Math.exp(doFactor));
	}
	public static void main(String[] args) {
		checkEXP();
		System.out.println("Overview for different x and n");
		System.out.format("%10s %10s %15s  %15s %15s", "x","n","Estimated1", "Estimated2", "Real\n");
		for(int n=1;n<=100;n++){
			for(double x=0.1;x<=100;x=x*10){
				System.out.printf("%10.2f %10d %15.2f %15.2f %15.2f", x, n, myexp(x,n), myexp1(x,n), Math.exp(x));
				System.out.println();
			}
		}

	}

}
