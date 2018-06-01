/**
 * Crabs game, player is throwing with 2 6 sides dices. If he gets 7 or 11 he wins, if he gets
 * 2,3,12 he loses. For other values a result is recorded and throwing is repeated. If he gets 
 * 7 he loses if he gets the same value as the last result he wins. For other results throwing is 
 * repeated and result is recorded. 
 * 
 */
package prog055_CrabsGame;

import java.util.Random;

public class Crabs {
	
	/**
	 * Simulation of throw with 2 dices
	 * @return random result of 2 dices throw
	 */
	public static int dice2D6(){
		Random rand=new Random();
		return (rand.nextInt(6)+1)+(rand.nextInt(6)+1);
	}
	/**
	 * Method describes a methodology of game crabs
	 * @param dice first result from throwing with 2 dices
	 * @return true if player wins, false if player loses
	 */
	public static boolean game(int dice){
		int nextThrow=0;
		int result=0;
		//player wins
		if(dice==7||dice==11){
			return true;
		}
		//player loses
		if(dice==2||dice==3||dice==12){
			return false;
		}
		//play further
		else{
			result=dice;
			do{
				//player wins
				if(nextThrow==result){
					return true;
				}
				//player loses
				if(nextThrow==7){
					return false;
				}
				result=nextThrow;
				nextThrow=dice2D6();
			}while((nextThrow!=result)||(nextThrow!=7));
			return true;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=dice2D6();
		boolean result=game(n);
		if(result){
			System.out.println("You won!");
		}
		else{
			System.out.println("You lost!");
		}
	}

}
