package prog046_Arrays_ex8;

import java.util.Random;

public class TestArray {

	protected static Random rand=new Random();

	/**
	 * Method prints the array which is given as an argument
	 * @param array which should be displayed 
	 */
	public static void print(int [] array){
		for (int i=0;i<array.length;i++){
			System.out.printf("%3d ",array[i]);
		}
	}

}