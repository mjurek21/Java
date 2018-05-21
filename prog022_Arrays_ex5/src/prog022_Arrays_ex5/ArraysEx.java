package prog022_Arrays_ex5;

import java.util.Arrays;
import java.util.Scanner;
public class ArraysEx {
/**
 * Method is creating an array 
 * Method is filling array with '2'
 * @param n array length
 * @param m is setting for all elements of array
 * @return created array
 */
	public static int [] initailArray(int m, int n){
		int []array=new int[n];
		for (int i=0;i<array.length;i++){
			array[i]=m;
		}
		return array;
	}
	/**
	 * Method is testing if given number is divisible thorough all elements of array
	 * @param array
	 * @param n integer which is checked if it is divisible
	 * @return true - if n is divisible, false if n is not divisible
	 */
	public static boolean areFactors(int array[],int n){
		for (int i=0;i<array.length;i++){
			if (n%array[i]!=0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] array;
		int m;//setting value of array components
		int n;//tested integer
		Scanner in=new Scanner(System.in);
		System.out.print("Give an integer which will be passed to all components of array: ");
		m=in.nextInt();
		System.out.print("Give an integer which will be tested: ");
		n=in.nextInt();	
		array=initailArray(m,100);
		System.out.println("Array:"+Arrays.toString(array));
		System.out.println("Integer factor:"+n);
		System.out.println(areFactors(array,n));

	}

}
