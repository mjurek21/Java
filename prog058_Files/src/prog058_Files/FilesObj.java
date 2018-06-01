package prog058_Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class FilesObj {
	/**
	 * Creates an integer array with n components
	 * @param n number of array components
	 * @return created integer array
	 */
	public static int [] intMatrix(int n){
		int [] intArray=new int[n];
		for (int i=0;i<intArray.length;i++){
			intArray[i]=i;
		}
		return intArray;
	}
	/**
	 * Write an integer array to file as an object
	 * @param array array which should be written to file
	 */
	public static void writeObjToFile(int [] array){
		try{
			ObjectOutputStream stream=new ObjectOutputStream(new FileOutputStream("text.txt"));
			stream.writeObject(array);
			stream.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	/**
	 * Method reads object value from file and displays it
	 */
	public static void readObjFromFile(){
		try {
			ObjectInputStream stream=new ObjectInputStream(new FileInputStream("text.txt"));
			System.out.println(Arrays.toString((int[])(stream.readObject())));
			stream.close();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	/**
	 * Method reads an integer array from file and displays a sum of all elements
	 * @return sum of all elements of integer array
	 */
	public static int readObjAndCal(){
		int [] array = null;
		int sum=0;
		try {
			ObjectInputStream stream=new ObjectInputStream(new FileInputStream("text.txt"));
			array=(int[])(stream.readObject());
		} catch (Exception ex) {
			System.out.println(ex);
		}
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=100;
		int [] array=new int[n];
		array=intMatrix(n);
		writeObjToFile(array);
		readObjFromFile();
		System.out.println("Sum of all componets of array: "+readObjAndCal());
	}

}
