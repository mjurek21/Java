package prog029_String_ex6;

import java.util.Arrays;

public class Anagram {
	public static boolean areStringsAnagrams(String word1, String word2){
		String string1=word1.toLowerCase();
		String string2=word2.toLowerCase();
		//counter of letter in UTF-8 for string1
		int [] counterString1=new int[(int) Math.pow(2.0, 8.0)];
		//counter of letter in UTF-8 for string2
		int [] counterString2=new int[(int) Math.pow(2.0, 8.0)];

		//Case 1: Check the length of both strings, if they are different 
		//strings are not anagrams
		if (string1.length()!=string2.length()){
			return false;
		}
		//counting a number of each letter in each string
		for (int i=0;i<string1.length();i++){
			counterString1[string1.charAt(i)]++;
			counterString2[string2.charAt(i)]++;
		}
		//Case 2: Verification if all letters occur the same number of times
		//in both strings, if not then return false
		for (int i=0;i<counterString1.length;i++){
			if(counterString1[i]!=counterString2[i]){
				return false;
			}
		}
		//if nether case 1 nor case 2 are the case, return true. Both strings
		//are anagrams
		return true;
	}
	public static void main(String[] args) {
		String string1="123workthe";
		String string2="the321korw";
		if(areStringsAnagrams(string1, string2)){
			System.out.println("Both strings \""+string1+"\" and \""+string2+"\" are anagrams");
		}
		else{
			System.out.println("Both strings \""+string1+"\" and \""+string2+"\" are NOT anagrams");
		}

	}

}
