package prog020_Arrays_ex3;

import java.util.Arrays;
import java.util.Random;

public class ArrayEX1 {
	/**
	* Method define a new random array
	* @param n array length 
	* @param m random number range
	* @return array with random elements
	*/
	public static int [] initialArray(int n, int m){
		int [] array=new int [n];
		Random rand=new Random();
		for(int i=0;i<n;i++){
			array[i]=rand.nextInt(m);
		}
		return array;
	}
	/**
	* Search the biggest value in matrix
	* @param array the array which is tested 
	* @return array with info about maxvalue and its position
	*/
	public static int [] maxElem(int [] array){
		int [] indexMax=new int [2];
		for(int i=0;i<array.length;i++){
			if (indexMax[0]<array[i]){
				indexMax[0]=array[i];
				indexMax[1]=i;
			}
		}
		return indexMax;
	}	
	public static void main(String[] args) {
		int [] array=initialArray(100, 100);
		int [] count=maxElem(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Maximal value in array: "+count[0]);
		System.out.println("First maximal value in array is on position: "+count[1]);
	}

}
