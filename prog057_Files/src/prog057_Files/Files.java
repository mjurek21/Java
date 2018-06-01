/**
 * First experience with files. Program creates a text.txt and saves data given by user
 * Then displays the conntent of this file
 */
package prog057_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Files {
	/**
	 * Method writes to file
	 * @param str ArrayList<String> type writen to file
	 */
	public static void writeToFile(ArrayList <String> str){
		try{
			BufferedWriter writer=new BufferedWriter(new FileWriter("text.txt"));
			for(int i=0;i<str.size();i++){
				writer.write(str.get(i));
				writer.newLine();
			}
			writer.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
	/**
	 * Method creates line as string which is got from user
	 * @return String value given by user
	 */
	public static String createLine(){
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		return str;
	}
	/**
	 * Method reads from file and displays a result on screen
	 */
	public static void readFromFile(){
		ArrayList <String> line=new ArrayList();
		String str=".";
		try {
			BufferedReader reader=new BufferedReader(new FileReader("text.txt"));
			while(str!=null){
				str=reader.readLine();
				line.add(str);
			}
			reader.close();
			for (int i=0;i<line.size()-1;i++){
				System.out.println(line.get(i));
			}
		} 
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		
		ArrayList <String> strList=new ArrayList();
		int index=0;
		String str=new String();
		do{
			System.out.print("Give name: ");
			strList.add(createLine());
			str=strList.get(index);
			index++;
		}while(str.length()!=0);
		writeToFile(strList);
		readFromFile();
	}
}
