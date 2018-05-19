package prog019_Arrays_ex2;

import java.util.Arrays;
import java.util.Random;

public class arraysEx {
/**
 * Method is generating an array with random values
 * @param n array length
 * @param m maximal number which is possible in the random range
 * @return Array with random values
 */
	public static int[] randArray(int n, int m){
		Random rand=new Random();
		int [] intArray=new int[n];
		for (int i=0;i<n;i++)
			intArray[i]=rand.nextInt(m);
		return intArray;
	}
	/**
	 * Method counts how many times particular integer occurs in array
	 * @param array which elements are counted
	 * @return array with counted numbers
	 */
	public static int[] countingArray(int [] array){
		int index=0;
		int [] counter=new int[array.length];
		for (int i=0;i<array.length;i++){
			index=array[i];
			counter[index]++;
		}
		return counter;
	}	
	public static void main(String[] args) {
		int [] array=randArray(100, 10);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(countingArray(array)));
	}

}
