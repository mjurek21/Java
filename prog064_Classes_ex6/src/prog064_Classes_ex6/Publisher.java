package prog064_Classes_ex6;

/**
 * Class represents a publisher. It creates a name and a number of book.
 * There is possibility to change a name and number of book and read them.
 * Class has it's own method for converting of results to String.
 * @author mjurek21
 *
 */
public class Publisher {

		//publisher name
		private String pubName;
		//publisher number
		private int pubNumber;
		
		public Publisher(){
			this.pubName="none";
			this.pubNumber=-1;
		}
		public Publisher(String pubName, int pubNumber){
			this.pubName=pubName;
			this.pubNumber=pubNumber;
		}
		/**
		 * Getter gets a publisher name
		 * @return publisher name
		 */
		public String getPubName(){
			return this.pubName;
		}
		/**
		 * Getter gets a publisher number
		 * @return publisher number
		 */
		public int getPubNumber(){
			return this.pubNumber;
		}
		/**
		 * Setter sets a publisher name
		 * @param pubName new publisher name
		 */
		public void setPubName(String pubName){
			this.pubName=pubName;
		}
		/**
		 * Setter sets publisher number. Method detects correctness of given integer.
		 * @param pubNumber new publisher number
		 */
		public void setPubNumber(int pubNumber){
			try{
				this.pubNumber=pubNumber;
			}
			catch(Exception ex){
				System.out.println("Given value is not integer!");
			}
		}
		/**
		 * Method converts publisher name and number to needed String format
		 */
		public String toString(){
			if((this.pubName=="none")&&(this.pubNumber==-1)){
				return String.format("Unknown");
			}
			else{
				return String.format("%s, [%d]", this.pubName,this.pubNumber);
			}
		}


}
