package prog032_Classes_ex1;

public class wordGame {
	private int letterValue;
	private char letter;
	
	/**
	 * Constructor which sets initial value to all private class variables
	 */
	public wordGame(){
		this.letterValue=0;
		this.letter=' ';
	}
	/**
	 * Constructor sets given in arguments values to all private class variables
	 * @param letterValue
	 * @param letter
	 */
	public wordGame(int letterValue, char letter){
		this.letterValue=letterValue;
		this.letter=letter;
	}
	/**
	 * Getter gets char class variables
	 * @return class char variable
	 */
	public char getLetter(){
		return this.letter;
	}
	/**
	 * Getter gets int class variables
	 * @return class int variable
	 */
	public int getLetterValue(){
		return this.letterValue;
	}
	/**
	 * Method displays letter and its value
	 */	
	public static void printWord(wordGame word){
		System.out.printf("Value of letter \"%2c\" is \"%2d\"\n", word.letter, word.letterValue);
	}
	/**
	 * Converts class object to string
	 * @return string format of class object
	 */
	public String toString(){
		return String.format("%2c : %2d",this.letter, this.letterValue);
	}
	/**
	 * Check an equivalence between two objects
	 * @return true if both objects are equal or false if they are not.
	 */	
	public boolean equals(wordGame word){
		return (this.letter==word.letter)&&(this.letterValue==word.letterValue);
	}
	/**
	 * Testing method, check correctness of other methods
	 */
	public static void testWordGame(){
		wordGame word=new wordGame(20, 'W');
		wordGame word1=new wordGame(21, 'W');
		printWord(word);
		printWord(word1);
		System.out.println("word: "+word);
		System.out.println("word1: "+word1);
		if (word.equals(word1)){
			System.out.printf("Letter: %2c with value %2d is equal to letter: %4c with value %4d ", 
					word.getLetter(),word.getLetterValue(),word1.getLetter(),word1.getLetterValue());
		}
		else{
			System.out.printf("Letter: %2c with value %2d is NOT equal to letter: %4c with value %4d ", 
					word.getLetter(),word.getLetterValue(),word1.getLetter(),word1.getLetterValue());			
		}
	}
	public static void main(String[] args) {
		testWordGame();

	}

}
