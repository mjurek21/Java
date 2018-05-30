package prog047_Conditionals_ex4;

import java.util.Scanner;

public class Sorting {
	private int[] intArray;
	/**
	 * Constructor creates n element array
	 * @param n array length
	 */
	public Sorting(int n){
		this.intArray=new int[n];
	}
	/**
	 * Get from user string value which is suppose to be an integer
	 * @return string value
	 */
	public static String setValue(){
		Scanner in=new Scanner(System.in);
		String str="";
		System.out.print("Give an integer: ");
		str=in.nextLine();
		return str;
	}
	/**
	 * Converts string value to integer
	 * @param str given string value
	 * @return converted integer value
	 */
	public static int convValue(String str){
		int convertedValue=0;
		
		try{
			convertedValue=Integer.parseInt(str);
		}
		catch(Exception ex){
			System.out.println("Wrong value was given!");
			return 0;
		}
		return convertedValue;
	}
	/**
	 * Creates and fill int array
	 * @return filled int array
	 */
	public int [] setArray(){
		
		for (int i=0;i<intArray.length;i++){
			this.intArray[i]=convValue(setValue());
		}
		return this.intArray;
	}
	/**
	 * Simple sorting of data in array
	 */
	public void sortArray(){
		int temp=0;
		for(int i=0;i<this.intArray.length;i++){
			for (int j=i;j<this.intArray.length;j++){
				if(this.intArray[i]>this.intArray[j]){
					temp=this.intArray[j];
					this.intArray[j]=this.intArray[i];
					this.intArray[i]=temp;
				}
			}
		}
	}
	/**
	 * Conversion of Sorting object to String
	 */
	public String toString(){
		String str="";
		for(int i=0;i<intArray.length;i++){
			str+=this.intArray[i]+ " ";
		}
		return str;
	}
	public static void main(String[] args) {
		Sorting sort=new Sorting(5);
		sort.setArray();
		System.out.println(sort.toString());
		sort.sortArray();
		System.out.println(sort.toString());
	}

}
