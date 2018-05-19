package prog021_Arrays_ex4;

import java.util.Arrays;

public class ArrayEx3 {
/**
 * Method is creating an array of integer numbers
 * @param n array length 
 * @return integer array with chosen length
 */
	public static int[] initailArray(int n){
		int [] array=new int [n];
		
		for(int i=0;i<n;i++){
			array[i]=i;
		}
		return array;
	}
	/**
	 * Method is selecting only prime numbers from integer array
	 * @param array array of numbers from 0 to defined value
	 * @return array of prime numbers
	 */
	public static int[] sieve(int [] array){
		int i=2;
		array[1]=0;
		while(i<array.length){
			if(array[i]%i==0){
				for (int j=2;j<array.length/i;j++){
					array[j*i]=0;
				}
				i++;
			}
		}
		return array;
	}
	public static void main(String[] args) {
		int [] array =initailArray(1200);
		System.out.println("Integer array");
		System.out.println(Arrays.toString(array));
		System.out.println("Array of prime numbers");
		System.out.println(Arrays.toString(sieve(array)));
	}

}
