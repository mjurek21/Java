package prog027_String_ex4;

public class Abecedarian {
	public static boolean isStringAbecedarian(String word){
		int counter=0;
		String stringToLowerCase=word.toLowerCase();
		for (int i=0;i<word.length();i++){
			for (int j=i;j<word.length();j++){
				if(word.charAt(i)>word.charAt(j)){
					counter++;
				}
				
			}
		}
		//if letters are not alphabetic order then counter>0 and return false
		//else return true
		if (counter>0){
			return false;
		}
		else{
			return true;	
		}
	}
	public static void main(String[] args) {
		String word="dcba";//word which is tested
		if (isStringAbecedarian(word)){
			System.out.println("Given word \""+word+"\" is abecedarian");
		}
		else{
			System.out.println("Given word \""+word+"\" is NOT abecedarian");
		}
	}

}
