/**
 * Program is collecting numbers from user till user will chose zero. Then program gives:
 * - total number of numbers given by user
 * - average value of all numbers
 * - minimal and maximal number given by user
 * 
 */
package prog049_Numbers;

import java.util.Scanner;

public class Numbers {
	

/**
 * Method sets the program progress, update of all values needed for final calculates
 * @param result last state of array before giving by user new value
 * @param value new given value by user
 */
	public static void setNumber(double [] result, double value){
		if(value!=0){
			//minimal given value
			if(result[1]==0){
				result[3]=value;
			}	
			if(result[3]>value){
				result[3]=value;
			}
			result[0]+=value;//sum of all given numbers
			result[1]+=1;//number of given numbers
			//maximal given value
			if(result[2]<value){
				result[2]=value;
			}
					
		}
	}
	/**
	 * Method collect data from user
	 * @return verified double value given by user
	 */
	public static double giveNumber(){
		Scanner in=new Scanner(System.in);
		String word=new String();
		System.out.print("Give a double: ");
		while(!in.hasNextDouble()){
	    	word=in.next();
			System.out.println("Given value \""+word+"\" is not a double!");
			System.out.print("Try again: ");
		}
		return in.nextDouble();
	}
	public static void main(String[] args) {
		double df=1;
		double [] result=new double[4];
		for (int i=0;i<result.length;i++){
			result[i]=0;
		}
		while(df!=0){
			df=giveNumber();
			setNumber(result, df);
			
		}
		System.out.println("Sum of all numbers: "+ result[0]);
		System.out.println("Amout of all numbers: "+ result[1]);
		System.out.println("Max among all numbers: "+ result[2]);
		System.out.println("Min among all numbers: "+ result[3]);
		System.out.println("Average of all numbers: "+ (result[0]/result[1]));
	}

}
