package prog043_Coins;

import java.util.Random;

public class coin {
	
	private static Random rand=new Random();
	private String side;
	
	public coin(){
		this.side="Head";
	}
	public void coinRoll(){
		this.side=(rand.nextBoolean()? "Head": "Tail");
	}
	public String getCoinValue(){
		return this.side;
	}
	public String toString(){
		return " "+this.side;
	}
	public boolean equals(coin that){
		return (this.side==that.side);
	}
	public static void main(String[] args) {
		coin obj1=new coin();
		coin obj2=new coin();
		coin obj3=new coin();
		do{
			obj1.coinRoll();
			obj2.coinRoll();
			obj3.coinRoll();
			System.out.println(obj1+" "+obj2+" "+obj3);
			System.out.println((obj1.equals(obj2)&&obj1.equals(obj3)));
		}while(!(obj1.equals(obj2)&&obj1.equals(obj3)));
			
	}
}
