package prog025_String_ex2;

public class stringEx1 {
/**
 * Method controls correctness of parentheses in equation
 * 	
 * @param array controlled equation
 * @return number of opened and not closed parentheses
 */
	public static int parenthesesCotrol(String array){
		int counter=0;//counter of number of opened parentheses
		boolean startEnd=true;//indicates if parenthesis was at first opened
		//and then closed
		for(int i=0;i<array.length();i++){
			//check if parenthesis was opened
			if(array.charAt(i)=='('){
				counter++;
				startEnd=true;//marks that parenthesis was opened
			}
			//Detection of closed parentheses and check if there are no more 
			//closed parentheses as open one
			if((array.charAt(i)==')')&&startEnd){
				counter--;
				if(counter<0){
					startEnd=false;//marks that all parentheses were closed
					System.err.println("Error! There are no more opened parentheses!");
					return -1;
				}
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		String equation="(3+4)*(6-8)+(2-1)(";//tested equation with parentheses
		System.out.println("Number of opened and not closed parentheses: "+parenthesesCotrol(equation));

	}

}
