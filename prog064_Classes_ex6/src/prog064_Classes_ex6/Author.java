package prog064_Classes_ex6;

/**
 * Class defines an author of a book, it sets first and second name as well as unique ID for each
 * created author.
 * @author mjurek21
 *
 */

public class Author {
	//variable used for setting of next ID number of book
	private static int counter=0;
	//used for setting of first name of an author
	private String firstName;
	//used for setting of last name of an author
	private String lastName;
	//Unique author ID number
	private int authorID;
	/**
	 * Constructors sets first name, second name (given as parameters) and gives a next ID number
	 * for author
	 * @param firstName first author name
	 * @param lastName second author name
	 * @throws Exception first name cannot be null, second name has to have a value
	 */
	public Author(String firstName, String lastName)throws Exception {
		if((firstName.length()==0)) throw new Exception("First name cannot be null!");
		this.firstName=firstName;
		if((lastName==null)||(lastName.length()==0)){
			throw new Exception("Last name cannot be empty!");
		}
		this.lastName=lastName;
		this.authorID=++counter;
	}
	/**
	 * Fist Name of author getter
	 * @return first author's name
	 */
	public String getFirstName(){
		return this.firstName;
	}
	/**
	 * Getter of last author's name
	 * @return last author's name
	 */
	public String getLastName(){
		return this.lastName;
	}
	/**
	 * Getter gets author's ID number
	 * @return author's ID number
	 */
	public int getAuthorID(){
		return this.authorID;
	}
	/**
	 * Setter sets a first author's name
	 * @param firstName new first author's name
	 * @throws Exception first name cannot be null
	 */
	public void setFirstName(String firstName)throws Exception{
		if(firstName==null){
			throw new Exception("First name cannot be null!");
		}
		this.firstName=firstName;
	}
	/**
	 * Setter sets last author's name
	 * @param lastName new last name
	 * @throws Exception last name has to have a value
	 */
	public void setLastName(String lastName)throws Exception{
		if((lastName==null)||(lastName.length()==0)){
			throw new Exception("Last name cannot be null!");
		}
		this.lastName=lastName;
	}
	/**
	 * Method prints author's data in format: [Author's ID] first name last name
	 * @param author given author object
	 */
	public void print(){
		System.out.printf("[%d] %s %s\n", this.getAuthorID(),this.getFirstName(),
				this.getLastName());
	}
	public String toString(){
		if((this.firstName==null)&&(this.lastName==null)){
			return String.format("Unknown");
		}
		else{
			return String.format("[%d] %s %s", this.authorID,this.firstName,this.lastName);
		}
	}
}

