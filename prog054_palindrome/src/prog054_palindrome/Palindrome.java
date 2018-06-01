package prog054_palindrome;

public class Palindrome {
	/**
	 * Method is checking if word or sentence is a palindrome.
	 * Method does not include in testing any spaces and special characters
	 * @param str tested string
	 * @return true if word/sentence is palindrome, false if word/sentence is not palindrome
	 */
	public static boolean isPalindrome(String str){
		String strTemp=str.toLowerCase();
		String strFinal="";
		for(int i=0;i<str.length();i++){
			if((strTemp.charAt(i)<0x0061)||(strTemp.charAt(i)>0x007A)){
				strFinal+="";
			}
			if((strTemp.charAt(i)>=0x0061)&&(strTemp.charAt(i)<=0x007A)){
				strFinal+=strTemp.charAt(i);
			}
		}
		for (int i=0;i<strFinal.length()/2;i++){
			if(strFinal.charAt(i)!=strFinal.charAt(strFinal.length()-i-1)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String text=new String();
		text="Madam, I'm Adam";
		if (isPalindrome(text)){
			System.out.println("\""+text+ "\" is palindrome!");
		}
		else{
			System.out.println("\""+text+ "\" is NOT palindrome!");
		}
	}
}