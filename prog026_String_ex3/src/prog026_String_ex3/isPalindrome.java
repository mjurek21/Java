package prog026_String_ex3;

public class isPalindrome {
/**
 * Method is checking if word is palindrome
 * @param word string which is checked
 * @return true if word is palindrome, false if word is not palindrome
 */
	public static boolean isStringPalindrome(String word){
		//Definition of substrings for compare issues
		String string1="";
		String string2="";
		String string3="";
		//Convert all letters to lower case in order to improve the correctness
		//of this method
		String wordLowerCase=word.toLowerCase();
		//even number of letter in word
		if(word.length()%2==0){
			string1=wordLowerCase.substring(word.length()/2, word.length());
			string2=wordLowerCase.substring(0, word.length()/2);
			System.out.println("String1: "+string1);
			System.out.println("String2: "+string2);
			
			for(int i=0;i<string2.length();i++){
				string3+=string2.charAt(string2.length()-i-1);
			}
			System.out.println("String3: "+string3);
		}
		//odd number of letter in word
		if(word.length()%2!=0){
			string1=wordLowerCase.substring(word.length()/2+1, word.length());
			string2=wordLowerCase.substring(0, word.length()/2);	
			for(int i=0;i<string2.length();i++){
				string3+=string2.charAt(string2.length()-i-1);
			}			
		}
		//Compare of equality of both substrings
		if(string3.equals(string1)){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		String word="Ottttto";
		System.out.println("Palidorme of given word: \""+word+"\"is:"+ isStringPalindrome(word));

	}

}
