package prog028_String_ex5;

import java.util.Arrays;

public class Doubloon {
/**
 * Method tests if word is a doubloon word
 * @param word tested string
 * @return False if word is not a doubloon word. True if word is a doubloon word.
 */
	public static boolean isStringDoubloon(String word){
		int setPoint=100000;//setting of zero point of the array
		int [] counter=new int[(int) Math.pow(2.0, 8.0)];//counting integer which covers the whole UTF-8
		//String arg is copied to new string and letters are changed to lower
		//case in order to make compare easier
		String wordToLowerCase=word.toLowerCase();
		//setting initial value of all elements of counter array
		for(int j=0;j<word.length();j++){
			counter[j]=0;
			if (word.charAt(j)<setPoint){
				setPoint=word.charAt(j);
			}
		}
		//analysis of false case. If false case occurs return false
		for(int i=0;i<word.length();i++){
			//setPoint sets the min. value of smallest letter in alphabet
			counter[word.charAt(i)-setPoint]++;	
		}
		System.out.println(Arrays.toString(counter));
		for (int i=0;i<word.length();i++){
			if(counter[i]!=0){
				for (int j=i;j<word.length();j++){
					if((counter[i]!=counter[j])&&(counter[j]!=0)){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		//String which is tested
		String word="reappear";
		if (isStringDoubloon(word)){
			System.out.println("Given word\""+word+"\" is doubloon word.");
		}
		else{
			System.out.println("Given word\""+word+"\" is NOT doubloon word.");
		}
			
		
	}

}
