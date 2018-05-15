package prog011_ValueMethods_ex2;
import java.util.Scanner;

public class MathOperation {
	/**
	 * Method is calculating and displaying the sum of all odd 
	 * integers between 0 and user integer
	 * @param n given by user odd integer
	 * @return sum of all odd integers from 1 and user value
	 */
	public static int oddSum(int n){
		int sum=0;
		if(n>0){
			sum=n+oddSum(n-2);
			return sum;
		}
		else{
			return sum;
		}
	}
	/**
	 * Method is getting an odd integer
	 * Method checks if integer is an odd integer and if not asked user for an odd integer
	 * Method checks if given value is an integer
	 * @return user odd integer
	 */
	public static int getOddInt(){
		Scanner in=new Scanner(System.in);
		int factor;
		System.out.print("Give an odd integer: ");
		do{
			while(!in.hasNextInt()){
				String word=in.next();
				System.err.print(word +": is NOT an integer, please give a new integer: ");
			}
		
			factor=in.nextInt();
			if (factor%2!=0){
				System.out.print(factor +": is NOT an odd integer, please give a new odd integer: ");
			}
			}while(factor%2!=0);
		return factor;
	}
	public static void main(String[] args) {
		
		System.out.println("Sum of all odd integers from 0 to your value is: "+oddSum(getOddInt()));
	}

}
