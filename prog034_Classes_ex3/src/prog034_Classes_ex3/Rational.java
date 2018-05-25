package prog034_Classes_ex3;

public class Rational {
	private int numerator;
	private int denominator;
	/**
	 * Initial constructor
	 */
	public Rational(){
		this.numerator=0;
		this.numerator=1;
	}
	/**
	 * Second construct, which takes arguments and sets class variables
	 * Constructors checks if denominator is different from 0
	 * @param numerator of rational
	 * @param denominator of rational
	 */
	public Rational(int numerator, int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}
	/**
	 * Method displays Rational object for negative and positive cases
	 * @param number Rational object 
	 */
	public static void printRational(Rational number){
		//positive result
		if ((((number.numerator>0)&&(number.denominator>0))||((number.numerator<0)&&(number.denominator<0)))
				&&(number.denominator!=0)){
			System.out.printf("%d/%d\n",Math.abs(number.numerator),Math.abs(number.denominator));
		}
		//negative result
		if ((((number.numerator<0)&&(number.denominator>0))||((number.numerator>0)&&(number.denominator<0)))
				&&(number.denominator!=0)){
			System.out.printf("-%d/%d\n",Math.abs(number.numerator),Math.abs(number.denominator));
		}
		if ((number.numerator==0)&&(number.denominator!=0)){
			System.out.printf("0\n");
		}
		if (number.denominator==0){
			System.out.println("Error! Denominator cannot be 0!");
		}
	}
	/**
	 * Method converts numerator and denominator to user friendly form
	 */
	public String toString(){
		//positive value
		if ((((this.numerator>0)&&(this.denominator>0))||((this.numerator<0)&&(this.denominator<0)))
				&&(this.denominator!=0)){
			return String.format("%d/%d",Math.abs(this.numerator),Math.abs(this.denominator));
		}
		//negative value
		if ((((this.numerator<0)&&(this.denominator>0))||((this.numerator>0)&&(this.denominator<0)))
				&&(this.denominator!=0)){
			return String.format("-%d/%d",Math.abs(this.numerator),Math.abs(this.denominator));
		}
		if ((this.numerator==0)&&(this.denominator!=0)){
			return String.format("0");
		}
		if (this.denominator==0){
			return String.format("Error! Denominator cannot be 0!");
		}
		else{
			return String.format("Other Error!");
		}
	}
	/**
	 * Method gets numerator from class variable
	 * @return numerator from class variable
	 */
	public int getNumerator(){
		return this.numerator;
	}
	/**
	 * Method gets denominator from class variable
	 * @return denominator from class variable
	 */
	public int getDenominator(){
		return this.denominator;
	}	
	/**
	 * Method negates rational number
	 */
	public void negateRational(){
		if (((this.numerator>0)&&(this.denominator>0))||((this.numerator<0)&&(this.denominator<0))){
			this.numerator=-Math.abs(this.numerator);
			this.denominator=Math.abs(this.denominator);
		}
		else{
			this.numerator=Math.abs(this.numerator);
			this.denominator=Math.abs(this.denominator);
		}
	}
	/**
	 * Method inverts rational number
	 */
	public void invertRational(){
		int temp=this.numerator;
		this.numerator=this.denominator;
		this.denominator=temp;		
		if(this.denominator==0){
			System.out.println("ERROR! Denominator cannot be 0!");
		}
	}
	/**
	 * Method converts Rational number to double
	 * @param number rational number which is converted to double
	 * @return converted rational number to double
	 */
	public static double toDouble(Rational number){
		return ((double)number.numerator/(double)number.denominator);
	}
	/**
	 * Method is searching for greatest common divisor
	 * @param number tested rational object
	 * @return greatest common divisor:int
	 */
	public static int grComDiv(Rational number){
		int comDiv=-1;
		for (int k=2;k<=Math.abs(number.denominator);k++){
			if((((number.numerator%k==0))&&(number.denominator%k==0))&&(number.numerator!=0)){
				comDiv=k;
			}
			if(number.numerator==0){
				comDiv=-2;
			}
		}
		return comDiv;
	}
	/**
	 * Method adds two rational numbers
	 * @param second rational number which is added to first rational number
	 * @return sum of both rational numbers
	 */
	public Rational add(Rational number){
		
		if(number.denominator==this.denominator){
			return new Rational(((number.numerator+this.numerator)),
					(number.denominator));			
		}
		else{
			return new Rational(((number.numerator*this.denominator)+
						(this.numerator*number.denominator)),
						(number.denominator*this.denominator));
		}
	}
	/**
	 * Method test the correctness of printRational method
	 */
	public static void testPrintRational(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of printRational Method                     *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				printRational(number);
			}
		}
	}
	/**
	 * Method tests a correctness of toString method
	 */
	public static void testToString(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of toString Method                          *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				System.out.println(number);
			}
		}
	}
	/**
	 * Method tests a correctness of negateRational method
	 */
	public static void testNegateRational(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of negateRational Method                    *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				System.out.print("Rational number: "+number);
				number.negateRational();
				System.out.println(", negated rational number after: "+number);
			}
		}
	}
	/**
	 * Method tests a correctness of invertRational method
	 */
	public static void testInvertRational(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of invertRational Method                    *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				System.out.print("Rational number: "+number);
				number.invertRational();
				System.out.println(", inverted rational number after: "+number);
			}
		}
	}
	/**
	 * Method tests a correctness of toDouble method
	 */
	public static void testToDouble(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of toDouble Method                          *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				System.out.print("Rational number: "+number);
				System.out.println(", converted to double: "+toDouble(number));
			}
		}
	}
	/**
	 * Method tests a correctness of grComDiv method
	 */
	public static void testGrComDiv(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of grComDiv Method                          *");
		System.out.println("***************************************************");

		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				if (grComDiv(number)==-1){
					System.out.println("Rational number: "+number+", greatest common divisor: none");
				}
				if (grComDiv(number)==-2){
					System.out.println("Rational number: "+number+", greatest common divisor: all numbers");
				}	
				if((grComDiv(number)!=-2)&&(grComDiv(number)!=-1)){
					System.out.println("Rational number: "+number+", greatest common divisor: "+grComDiv(number));
				}
			}
		}
	}
	/**
	 * Method tests a correctness of add method
	 */
	public static void testAdd(){
		final int MIN_VALUE=-10;
		final int MAX_VALUE=10;
		
		System.out.println("***************************************************");
		System.out.println("*Test of add Method                               *");
		System.out.println("***************************************************");
		
		for (int i=MIN_VALUE;i<MAX_VALUE;i++){
			for(int j=MIN_VALUE;j<MAX_VALUE;j++){
				Rational number=new Rational(i,j);
				if((grComDiv(number)!=-1)&&(grComDiv(number)!=-2)){
					Rational number1=new Rational(i/grComDiv(number),j/grComDiv(number));
					System.out.println("Rational number: "+number+", Divisor: " +grComDiv(number)+
							",rational+rational: "+number1.add(number1));
				}
				else{
					System.out.println("Rational number: "+number+", Divisor: none, rational+rational: "
							+number.add(number));
				}
			}
		}
	}
	public static void main(String[] args) {
	//**********************************************
	//Verify the correctness separate for each method
	//**********************************************	
		//Test of printRational method
	//	testPrintRational();
		//Test of toString method
	//	testToString();
		//Test of negateRational
	//	testNegateRational();
		//Test of invertRational();
	//	testInvertRational();
		//Test toDouble()
	//	testToDouble();
		//Test of grComDIv()
	//	testGrComDiv();	
		//Test add() method
		testAdd();
	}

}
