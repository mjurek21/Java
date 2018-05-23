package prog024_String_ex1;

import java.util.Arrays;

public class StringEX {

	public static int [] letterHist(String alphString){
		int [] result=new int[26];
		int index=0;
		char chValue='0';
		String temp=alphString.toLowerCase();
		for (int j=0;j<result.length;j++){
			result[j]=0;
		}
		for (int i=0;i<result.length;i++){
			chValue=temp.charAt(i);
			index=chValue;
			result[index-97]++;
		}
		return result;
	}
	public static void main(String[] args) {
		String testString="AbCaaDDaaaaaaEEEaaaaaaazzz";
		String textString="";
		char charLetter='A';
		for(int i=0;i<26;i++){
			textString=textString+"  "+charLetter;
			charLetter++;
		}
		System.out.println("Text String:  "+textString);
		System.out.println("Final result: "+Arrays.toString(letterHist(testString)));
	}
}
