package prog012_ValueMethods_ex3;
import java.util.Scanner;

public class MathMethodRec {
/**
 * Function is calculating Ackermann function
 * @param m first factor of the function 
 * @param n second factor of the function
 * @return Gives an Ackermann function result
 */
	public static int ack(int m, int n){
		int result;
		if (m==0){
			result=n+1;
			return result;
		}
		if(m>0&&n==0){
			return ack(m-1, 1);
		}
		if(m>0&&n>0){
			return ack(m-1, ack(m,n-1));
		}
		return -1;
	}
/**Function is getting a integer value from user 
 * then it is checking if the given value is an positive integer, 
 * if not it asks for correction
 * 
 * @return positive integer value after verification 
 */
	public static int getIntValue(){
		int value;
		Scanner in=new Scanner(System.in);
		while (!in.hasNextInt()){
			String word=in.next();
			System.err.print("Given value \""+word+ "\" is not a positive integer. Give a factor (positive integer):");
		}
		
		do {
			value=in.nextInt();
			if (value<0){
				System.out.print("Given value \""+value+ "\" is not a positive integer. Give a factor (positive integer):");
			}
		}while(value<0);
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor1, factor2;
		System.out.print("Give a factor \"m\" (positive integer): ");
		factor1=getIntValue();
		System.out.print("Give a factor \"n\" (positive integer): ");
		factor2=getIntValue();
		System.out.println("Ackermann function result is: "+ack(factor1, factor2));
		
	}

}
