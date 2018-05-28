package prog035_Sorting_ex1;

import java.util.Random;

public class Deck {
	private Card[] cards;
	
	public Deck(int n){
		this.cards=new Card[n];
	}
	
	/**
	 * Constructor which populate a card deck
	 */
	public Deck(){
		this.cards=new Card[52];
		int cardIndex=0;
		for(int i=1;i<=13;i++){
			for (int j=0;j<=3;j++){
				this.cards[cardIndex]=new Card(j,i);
				cardIndex++;
			}
		}
		
	}
	/**
	 * Method swap cards at two fixed positions
	 */
	public void swapCards(int index1, int index2){
		Card tempCard=new Card();
		tempCard=this.cards[index1];
		this.cards[index1]=this.cards[index2];
		this.cards[index2]=tempCard;
	}
	/**
	 * Method uses swapCard method to shuffle randomly all cards in deck
	 */	
	public void shuffleDeck(){
		Random rand=new Random();
		int index1;
		int index2;
		for (int i=0;i<this.cards.length;i++){
			index1=rand.nextInt(cards.length);
			index2=rand.nextInt(cards.length);
			swapCards(index1, index2);
		}		
	}
	public void printDeck(){
		for (int i=0;i<this.cards.length;i++){
			System.out.println(this.cards[i]);
		}
	}
	public static void main(String[] args) {

		//Card [] cards1 = Card.make52CardsDeck();	
		Deck deck=new Deck();
		System.out.println("********************");
		System.out.println("* printDeck Method *");
		System.out.println("********************");
		deck.printDeck();
		System.out.println("**********************************");
		System.out.println("* shuffleDeck and printDeck Methods *");
		System.out.println("**********************************");
		deck.shuffleDeck();
		deck.printDeck();
		//System.out.println(Arrays.toString(deck.randInt(0,10)));
		
	}

}
