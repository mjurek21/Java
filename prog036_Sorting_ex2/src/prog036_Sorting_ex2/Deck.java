package prog036_Sorting_ex2;

import java.util.Arrays;
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
	/**
	 * Method searches a deck and finds the lowest card in given range
	 * @param lowIndex lower range of searching
	 * @param highIndex higher range of searching
	 * @return lowest card index
	 */
	public int lowestCard(int lowIndex, int highIndex){
		Card card=new Card(3,13);
		int lowestIndex=0;
		for (int i=lowIndex;i<=highIndex;i++){
			if(card.compareTo(this.cards[i])==1){
				card=this.cards[i];
				lowestIndex=i;
			}
		}
		return lowestIndex;
	}
	public void selectSort(){
		for (int j=0;j<this.cards.length;j++){
			swapCards(j, lowestCard(j, this.cards.length-1));
		}
		swapCards(0, this.cards.length-1);
	}
	
	public static void main(String[] args) {

		Deck deck=new Deck();
		System.out.println("*************************************");
		System.out.println("* shuffleDeck and printDeck Methods *");
		System.out.println("*************************************");
		deck.shuffleDeck();
		deck.printDeck();
		System.out.println("**************************************");
		System.out.println("* lowest card index in deck in given range *");
		System.out.println("**************************************");
		System.out.println(deck.lowestCard(0,51));
		System.out.println("********************************************");
		System.out.println("* Deck after sorting using selectionSort() *");
		System.out.println("********************************************");
		deck.selectSort();
		deck.printDeck();
	}

}
