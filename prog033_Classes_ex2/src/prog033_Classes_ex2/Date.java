package prog033_Classes_ex2;

public class Date {
	private int year;
	private int month;
	private int day;
	/**
	 * Initial constructor sets default values to class variables
	 */
	public Date(){
		this.day=1;
		this.month=1;
		this.year=2000;		
	}
	/**
	 * Constructor sets given values to class variables
	 */
	public Date(int day, int month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	/**
	 * Year getter
	 * @return year class variable
	 */
	public int getYear(){
		return this.year;
	}
	/**
	 * Month getter
	 * @return Month class variable
	 */
	public int getMonth(){
		return this.month;
	}
	/**
	 * Day getter
	 * @return Day class variable
	 */
	public int getDay(){
		return this.day;
	}
	/**
	 * Display date
	 * @param date given date
	 */
	public static void printDate(Date date){
		System.out.printf("Date: %02d.%02d.%04d\n", date.day, date.month, date.year);
	}
	/**
	 * Create string format of date
	 */
	public String toString(){
		return String.format("%02d.%02d.%04d", this.day, this.month, this.year);
	}
	/**
	 * Compare two dates and gives info if they are equal
	 * @param date object which is checked with class variables
	 * @return true if dates are equal, false if dates are not equal
	 */
	public boolean equals(Date date){
		return (this.year==date.year)&&
				(this.month==date.month)&&
				(this.day==date.day);
	}
	/**
	 * Tests correctness of other methods
	 */
	public static void testDate(){
		Date date1=new Date(1,1,2001);
		Date date2=new Date(1,1,2002);
		printDate(date1);
		printDate(date2);
		System.out.println("Date1: "+date1);
		System.out.println("Date2: "+date2);
		if(date1.equals(date2)){
			System.out.printf("Date1: %02d.%02d.%04d is equal to Date2: %02d.%02d.%04d", 
					date1.getDay(), date1.getMonth(), date1.getYear(),
					date2.getDay(), date2.getMonth(), date2.getYear());
		}
		else{
			System.out.printf("Date1: %02d.%02d.%04d is NOT equal to Date2: %02d.%02d.%04d", 
					date1.getDay(), date1.getMonth(), date1.getYear(),
					date2.getDay(), date2.getMonth(), date2.getYear());			
		}
	}
	public static void main(String[] args) {
		testDate();

	}

}
