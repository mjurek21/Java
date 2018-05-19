package prog018_Arrays_ex1;

import java.util.Arrays;

public class ArrayPower {
/**
 * Method creates an array
 * @param n length of created array
 * @return Array with values
 */
	public static double[] array(int n){
		double [] initialArray=new double[n];
		for (int i=0;i<n;i++){
			initialArray[i]=i;
		}
		return initialArray;
	}
	/**
	 * Method raise each value of array to specified power
	 * @param double[] array double array which will be rased to chosen power
	 * @param n power
	 * @return Array with powers
	 */
	public static double[] powArray(double[] array, int n){
		double []powSecondArray=new double[array.length];
		for (int i=0;i<array.length;i++)
			powSecondArray[i]=Math.pow(array[i], n);
		return powSecondArray;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(array(10)));
		System.out.println(Arrays.toString(powArray(array(10),2)));

	}

}
