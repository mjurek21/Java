package prog036_Sorting_ex2;

public class Card {
	//class variables
	public static final String [] RANKS={"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	public static final String [] SUITS={"Clubs","Diamonds","Hearts","Spades"};
	
	//Instance variables
	private final int rank;
	private final int suit;
	
	public Card(){
		this.rank=0;
		this.suit=0;
	}
	/**
	 * Constructor sets user suit and rank values to instance variables
	 * @param suit {"Clubs","Diamonds","Hearts","Spades"}
	 * @param rank {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"}
	 */
	public Card( int suit, int rank){
		this.suit=suit;
		this.rank=rank;
	}
	/**
	 * Method creates a 52 cards deck (Card type) and populate all elements of object array
	 * @return populated 52 cards deck: Card type
	 */
	public static Card [] make52CardsDeck(){
		Card [] popDeck=new Card[52];
		int index=0;
		
		for(int j=1;j<=13;j++){
			for(int i=0;i<=3;i++){
				popDeck[index]=new Card(i,j);
				index++;
			}
		}
		return popDeck;
	}
	/**
	 * Method displays a 52 cards deck
	 * @param cards 52 cards deck: Card array object 
	 */
	public static void print52CardsDeck(Card [] cards){

		for(int i=0;i<cards.length;i++){
			System.out.println(cards[i]);
		}
	}
	/**
	 * Method checks if two sets of Card objects are equal
	 * @param that second object 
	 * @return true if objects are equal, false if objects are not equal 
	 */
	public boolean equals(Card that){
		return (this.rank==that.rank)&&(this.suit==that.suit);
	}
	/**
	 * Method compare two Card objects 
	 * @param that second Card object
	 * @return 1-first object is higher, 0 - both objects are equal, -1 - fisrt object is smaller
	 */
	public int compareTo(Card that){
		if ((this.rank==that.rank)&&(this.suit==that.suit)){
			return 0;
		}		
		if ((this.rank>that.rank)||((this.rank==that.rank)&&(this.suit>that.suit))){
			return 1;
		}
		else{
			return -1;
		}
	}
	/**
	 * Method converts object array element to string
	 */
	public String toString(){
		return SUITS[this.suit]+"/"+RANKS[this.rank];
	}
}