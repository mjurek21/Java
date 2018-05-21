package prog023_Arrays_ex6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class ArraysEx {
/**
 * Method is creating an array
 * @param n length of created array
 * @return Initial array with next integers 0, 1, 2...
 */
	public static int [] initialArray(int n){
		int [] array= new int[n];
		for(int i=0;i<array.length;i++){
			array[i]=i;
		}
		return array;
	}
	/**
	 * Method is creating an array with prime numbers numbered from end to begin
	 * @param n length of created array
	 * @return Array with prime numbers
	 */
		public static int [] rotArray(int n){
			int index=n-1;
			int [] temp=new int [n];
			int [] array= primeArray(n);
			for (int i=0;i<temp.length;i++){
				temp[i]=0;
			}
			for(int j=0;j<array.length;j++){
				temp[index]=array[j];
				index--;
			}
			return temp;
		}
	/**
	 * Method is creating an array with prime numbers
	 * @param array initial array with integers 
	 * @return array with prime numbers
	 */
	public static int [] primeArray(int n){
		int [] array= new int[n];
		int i=2;
		
		for(int j=0;j<array.length;j++){
			array[j]=j;
		}
		
		array[1]=0;
		
		while (i<array.length){
			if(array[i]%i==0){
				for (int j=2;j<array.length/i;j++){
					array[j*i]=0;
				}
			}
			i++;
		}
		return array;
	}
	/**
	 * Method is checking if the tested array has only prime numbers
	 * All components of array are tested up to maximal prime number of array
	 * Numbers out of the array range are not covered with test e.g. 31 in 30 elements matrix
	 * @param array tested array
	 * @param n array length
	 * @return true (array has only prime numbers), false (array has not only prime numbers)
	 */
	public static boolean arePrimeNumbers(int [] array, int n){
		int [] tempArray=primeArray(n);
		int [] testedArray=new int[n];
		int index=0;
		for(int i=0;i<array.length;i++){
			index=array[i];
			testedArray[index]=array[i];
		}
		for (int i=0;i<array.length;i++){
			if(testedArray[i]!=tempArray[i]){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int n=30;//array length
		int [] array=initialArray(n);
		int [] primeArray=primeArray(n);
		int [] rotArray=rotArray(n);
		System.out.println("Array1: "+ Arrays.toString(array));
		System.out.println("Array2: "+Arrays.toString(primeArray));
		System.out.println("Array3: "+Arrays.toString(rotArray));
		System.out.println("Is Array1 a prime array?: "+arePrimeNumbers(array,n));
		System.out.println("Is Array2 a prime array?: "+arePrimeNumbers(primeArray,n));
		System.out.println("Is Array3 a prime array?: "+arePrimeNumbers(rotArray,n));
	}

}
