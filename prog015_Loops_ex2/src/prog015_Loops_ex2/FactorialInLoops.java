package prog015_Loops_ex2;


import java.util.Scanner;

public class FactorialInLoops {
/**
 * Method is getting user variable
 * Method checks if variable is positive Integer-type
 * If not then ask for correction
 * @return Checked integer value given by user
 */
	public static int getInt(){
		int variable;
		Scanner in=new Scanner(System.in);
		while(!in.hasNextInt()){
			String word=in.next();
			System.err.print("Given value:\""+word+ "\" is not an integer, try again: ");
		}
		do{
			variable=in.nextInt();
			if(variable<0){
				System.out.print("Given value:\""+variable+ "\" is not a positive integer, try again: ");
			}
		}while(variable<0);
		return variable;
	}
	
	public static int factorial(int n){
		int result=1;
		while (n>0){
			result=result*n;
			n--;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int variable;
		System.out.print("Please give a positive integer: ");
		variable=getInt();
		System.out.print("Factor of \""+variable+"\" is: " +factorial(variable));

	}

}
