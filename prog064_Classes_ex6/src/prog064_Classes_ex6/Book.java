package prog064_Classes_ex6;

import java.util.ArrayList;
/**
 * Class defines a book with following arguments ISBN number, title, publish year, edition number,
 * number of pages, publisher, authors.
 * @author mjurek21
 */
public class Book {
	private String isbn;
	private String title;
	private int pubYear;
	private int edNumber;
	private int numberOfPages;
	private Publisher pub;
	private ArrayList<Author> authors;
	/**
	 * Constructor defines two parameters 
	 * ISBN
	 * format 10 digits: XX-XXX-XXXX-X (without hyphens)
	 * format 13 digits: XXX-XX-XXXX-X (without hyphens)
	 * @param isbn ISBN number
	 * @param title book title
	 * @throws Exception ISBN has to be correctly declared, title has to be declared
	 */
	public Book(String isbn, String title) throws Exception{
		if(isIsbnOK(isbn)==-1){
			throw new Exception("ISBN has to be correctly declared!\n"
					+ "format 10 digits: XX-XXX-XXXX-X (without hyphens)\n"
					+ "format 13 digits: XXX-XX-XXXX-X (without hyphens)\n");
		}
		if(isIsbnOK(isbn)==-2){
			throw new Exception("ISBN format is correct, however, a control sum of ISBN number "
					+ "is not correct!\n");
		}	
		if(isIsbnOK(isbn)==-10){
			throw new Exception("Unexpected error!\n");
		}
		this.isbn=isbn;
		if(title==null){
			throw new Exception("Title has to be declared!");
		}
		this.title=title;
		
		this.pubYear=0;
		this.edNumber=0;
		this.numberOfPages=0;
		this.pub=new Publisher();
		this.authors=new ArrayList<Author>();
	}
	/**
	 * Constructor defines three parameters 
	 * ISBN
	 * format 10 digits: XX-XXX-XXXX-X (without hyphens)
	 * format 13 digits: XXX-XX-XXXX-X (without hyphens)
	 * @param isbn ISBN number
	 * @param title book title
	 * @param pubYear publish year
	 * @throws Exception ISBN has to be correctly declared, title has to be declared, publish year has to be in range
	 * of 1900 to 2100. Zero means that year in unknown
	 */
	public Book(String isbn, String title, int pubYear)throws Exception{
		if(isIsbnOK(isbn)==-1){
			throw new Exception("ISBN has to be correctly declared!\n"
					+ "format 10 digits: XX-XXX-XXXX-X (without hyphens)\n"
					+ "format 13 digits: XXX-XX-XXXX-X (without hyphens)\n");
		}
		if(isIsbnOK(isbn)==-2){
			throw new Exception("ISBN format is correct, however, a control sum of ISBN number "
					+ "is not correct!\n");
		}	
		if(isIsbnOK(isbn)==-10){
			throw new Exception("Unexpected error!\n");
		}
		this.isbn=isbn;
		if(title==null){
			throw new Exception("Title has to be declared!");
		}
		this.title=title;
		if((pubYear!=0)&&((pubYear<1900)||(pubYear>2100))){
			throw new Exception("Publish year was incorectly defined. It has to be in range 1900-2100, "
					+ "0 means that publish year is not known.");
		}
		this.pubYear=pubYear;
		
		this.edNumber=0;
		this.numberOfPages=0;
		this.pub=new Publisher();
		this.authors=new ArrayList<Author>();
	}
	/**
	 * Constructor defines three parameters 
	 * ISBN
	 * format 10 digits: XX-XXX-XXXX-X (without hyphens)
	 * format 13 digits: XXX-XX-XXXX-X (without hyphens)
	 * @param isbn ISBN number
	 * @param title book title
	 * @param pub publisher info
	 * @throws Exception ISBN has to be correctly declared, title has to be declared
	 */
	public Book(String isbn, String title, Publisher pub)throws Exception{
		if(isIsbnOK(isbn)==-1){
			throw new Exception("ISBN has to be correctly declared!\n"
					+ "format 10 digits: XX-XXX-XXXX-X (without hyphens)\n"
					+ "format 13 digits: XXX-XX-XXXX-X (without hyphens)\n");
		}
		if(isIsbnOK(isbn)==-2){
			throw new Exception("ISBN format is correct, however, a control sum of ISBN number "
					+ "is not correct!\n");
		}	
		if(isIsbnOK(isbn)==-10){
			throw new Exception("Unexpected error!\n");
		}
		this.isbn=isbn;
		if(title==null){
			throw new Exception("Title has to be decclared!");
		}
		this.title=title;
		this.pub=pub;
		
		this.pubYear=0;
		this.edNumber=0;
		this.numberOfPages=0;
		this.authors=new ArrayList<Author>();
	}
	/**
	 * Full constructor
	 * ISBN
	 * format 10 digits: XX-XXX-XXXX-X (without hyphens)
	 * format 13 digits: XXX-XX-XXXX-X (without hyphens)
	 * @param isbn ISBN number
	 * @param title book title
	 * @param edNumber edition number
	 * @param pubYear publish year
	 * @param numberOfPages number of pages
	 * @param pub publisher info
	 * @throws Exception ISBN has to be declared, title has to be declared, publish year has to be in range
	 * of 1900 to 2100. Zero means that year in unknown
	 */
	public Book(String isbn, String title, int edNumber, int pubYear, int numberOfPages,
			Publisher pub)throws Exception{
		if(isIsbnOK(isbn)==-1){
			throw new Exception("ISBN has to be correctly declared!\n"
					+ "format 10 digits: XX-XXX-XXXX-X (without hyphens)\n"
					+ "format 13 digits: XXX-XX-XXXX-X (without hyphens)\n");
		}
		if(isIsbnOK(isbn)==-2){
			throw new Exception("ISBN format is correct, however, a control sum of ISBN number "
					+ "is not correct!\n");
		}	
		if(isIsbnOK(isbn)==-10){
			throw new Exception("Unexpected error!\n");
		}
		this.isbn=isbn;
		if(title==null){
			throw new Exception("Title has to be decclared!");
		}
		this.title=title;
		if((pubYear!=0)&&((pubYear<1900)||(pubYear>2100))){
			throw new Exception("Publish year was incorectly defined. It has to be in range 1900-2100"
					+ ", 0 means that publish year is not known.");
		}
		this.pubYear=pubYear;
		this.edNumber=edNumber;
		this.numberOfPages=numberOfPages;
		this.pub=pub;
		this.authors=new ArrayList<Author>();
	}
	/**
	 * Getter gets book ISBN number
	 * @return book ISBN number
	 */
	public String getIsbn(){
		return this.isbn;
	}
	/**
	 * Getter gets title of book
	 * @return book title
	 */
	public String getTitle(){
		return this.title;
	}
	/**
	 * Getter gets publish year
	 * @return book publish year
	 */
	public int getPubishYear(){
		return this.pubYear;
	}
	/**
	 * Getter gets edition number
	 * @return book edition number
	 */
	public int getEditionNumber(){
		return this.edNumber;
	}
	/**
	 * Getter gets number of pages of book
	 * @return number of pages of book
	 */
	public int getNumberOfPages(){
		return this.numberOfPages;
	}
	/**
	 * Getter gets publisher info
	 * @return publisher info
	 */
	public Publisher getPublisher(){
		return this.pub;
	}
	/**
	 * Getter gets info about authors
	 * @return authors of book
	 */
	public String getAuthors(){
		String strList="";
		for(Author auth:authors){
			strList+=auth+", ";
		}
		return strList;
	}
	/**
	 * Setter sets ISBN number of existing book
	 * format 10 digits: XX-XXX-XXXX-X (without hyphens)
	 * format 13 digits: XXX-XX-XXXX-X (without hyphens)
	 * @param isbn new ISBN number
	 */
	public void setIsbn(String isbn)throws Exception{
		if(isIsbnOK(isbn)==-1){
			throw new Exception("ISBN has to be correctly declared!\n"
					+ "format 10 digits: XX-XXX-XXXX-X (without hyphens)\n"
					+ "format 13 digits: XXX-XX-XXXX-X (without hyphens)\n");
		}
		if(isIsbnOK(isbn)==-2){
			throw new Exception("ISBN format is correct, however, a control sum of ISBN number "
					+ "is not correct!\n");
		}	
		if(isIsbnOK(isbn)==-10){
			throw new Exception("Unexpected error!\n");
		}
		this.isbn=isbn;
	}
	/**
	 * Setter sets new title of existing book
	 * @param title new title
	 * @throws Exception Title has to be declared
	 */
	public void setTitle(String title)throws Exception{
		if(title==null){
			throw new Exception("Title has to be declared!");
		}
		this.title=title;
	}
	/**
	 * Setter sets new publish year of existing book
	 * @param pubYear new publish year
	 */
	public void setPubishYear(int pubYear){
		this.pubYear=pubYear;
	}
	/**
	 * Setter sets new edition number of existing book
	 * @param edNumber new edition number
	 */
	public void setEditionNumber(int edNumber){
		this.edNumber=edNumber;
	}
	/**
	 * Setter sets new publisher of existing book
	 * @param pub new publisher
	 */
	public void setPublisher(Publisher pub){
		this.pub=pub;
	}	
	/**
	 * Setter sets new author of existing book
	 * @param auth new author
	 */
	public void setAuthors(Author auth){
		this.authors.add(auth);
	}
	/**
	 * Method converts description of book to string
	 */
	public String toString(){
		return String.format("ISBN: %s \nTitle: %s \nPublish year: %s \nEdition: %s "
			+ "\nNumber of pages: %s \nPublisher: %s \nAuthors: %s",
			this.isbn,this.title,!Integer.toString(this.pubYear).equals("0")?Integer.toString(this.pubYear):"Unknown", 
			!Integer.toString(this.edNumber).equals("0")?Integer.toString(this.edNumber):"Unknown", 
			!Integer.toString(this.numberOfPages).equals("0")?Integer.toString(this.numberOfPages):"Unknown",
			this.pub, this.authors.size()==0?"Unknown":getAuthors());
	}
	/**
	 * Method displays info about defined book
	 */
	public void print(){
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Title: "+this.title);
		System.out.println("Publish year: "+this.pubYear);
		System.out.println("Edition: "+this.edNumber);
		System.out.println("Number of pages: "+this.numberOfPages);
		System.out.println("Publisher: "+pub);
		System.out.println("Authors: "+authors);
	}
	/**
	 * Method is testing correctness of 10 and 13 digit ISBN numbers,
	 * Methods detects which sort of number is given (10 or 13 digits)
	 * @param isbn tested ISBN number
	 * @return true if ISBN is correct, false if ISBN number is not correct
	 * @throws Exception 
	 */
	public int isIsbnOK(String isbn){
		int checkSum13=0;//check the control digit in 13 digit ISBN
		char checkSumCh10=' ';//check the control digit in 10 digit ISBN, responsible for character X
		int counter13=0;
		int counter10=0;
		if((isbn.length()!=13)&&(isbn.length()!=10)){
			return -1;
		}
		//case with 13 digit's ISBN number
		if(isbn.length()==13){
			//counting without last value (control digit)
			for(int i=0;i<isbn.length()-1;i++){
				if(i%2==1){
					counter13+=Character.getNumericValue(isbn.charAt(i))*3;
				}
				if(i%2==0){
					counter13+=((Character.getNumericValue(isbn.charAt(i))));
				}	
			}			
			if(counter13%10==0){
				checkSum13=0;
			}
			else{
				checkSum13=10-(counter13%10);
			}
			if(checkSum13==Character.getNumericValue(isbn.charAt(isbn.length()-1))){
				return 1;
			}
			else{
				return -2;
			}
		}
		//case with 10 digit's ISBN number
		if(isbn.length()==10){
			//counting without last value (control digit)
			for(int i=0;i<isbn.length()-1;i++){
				counter10+=Character.getNumericValue(isbn.charAt(i))*(isbn.length()-i);
			}			
			if(counter10%11==10){
				checkSumCh10='X';
			}
			if(counter10%11==0){
				checkSumCh10='0';
			}
			if((counter10%11!=0)&&(counter10%11!=10)){
				//casting of integer to char with adding 48 in order to have a good number
				checkSumCh10=(char)(11-counter10%11+48);
			}
			if(checkSumCh10==isbn.charAt(isbn.length()-1)){
				
				return 1;
			}
			else{
				
				return -2;
			}
		}
		return -10;//unexpected case
	}
	public static void main(String[] args) {

		
		Publisher publisher1=new Publisher("PublishHouse",1234);
		
		try {
			Book book1=new Book("9781590598559","My first book");
			System.out.print(book1.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("\n*******************************************");
		try {
			Book book2=new Book("9781590598558","My second book",1901);
			System.out.print(book2.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	
		System.out.println("\n*******************************************");
		try {
			Author author1=new Author("John","Smith");
			Author author2=new Author("Alan","Smith");
			Author author3=new Author("Ben","Smith");
			try {
				Book book3=new Book("9782123456803","My third book",2, 2000, 
						533,publisher1);
				book3.setAuthors(author1);
				book3.setAuthors(author2);
				book3.setAuthors(author3);
				System.out.println(book3.toString());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n*******************************************");
		try {
			Author author4=new Author("Bob","Smith");
			Author author5=new Author("David","Smith");
			Author author6=new Author("Jack","Smith");
			try {
				Book book4=new Book("978212345680","My fourth book",10, 2010, 
						120,publisher1);
				book4.setAuthors(author4);
				book4.setAuthors(author5);
				book4.setAuthors(author6);
				System.out.println(book4.toString());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n*******************************************");
		try {
			Author author7=new Author("Bob1","Smith");
			Author author8=new Author("David1","Smith");
			Author author9=new Author("Jack1","Smith");
			try {
				Book book5=new Book("1590598555","My fifth book",10, 2010, 
						120,publisher1);
				book5.setAuthors(author7);
				book5.setAuthors(author8);
				book5.setAuthors(author9);
				System.out.println(book5.toString());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n*******************************************");
		try {
			Author author10=new Author("Bob1","Smith");
			Author author11=new Author("David1","Smith");
			Author author12=new Author("Jack1","Smith");
			try {
				Book book6=new Book("1590598554","My sixth book",11, 2015, 
						165,publisher1);
				book6.setAuthors(author10);
				book6.setAuthors(author11);
				book6.setAuthors(author12);
				System.out.println(book6.toString());
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	} 
}