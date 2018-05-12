package prog002_Variables;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		double addResult;
		double subResult;
		double multiplicationResult;
		double divisionResult;
		double x1=10.0;
		double x2=3.0;
		String introduction="Introduction";
		String summary="Simply mathematical operation were performed";
		//Displaying of introduction text
		System.out.println(introduction);
		
		//Definition of x1 and x2 values
		System.out.print("x1: ");
		System.out.println(x1);
		System.out.print("x2: ");
		System.out.println(x2);
		
		//Adding of x1 and x2
		System.out.print("Sum of x1 and x2: ");
		addResult=x1+x2;
		System.out.println(addResult);
		counter++;//counting a number of operations
		
		//Subtracting of x1 and x2
		System.out.print("Substraction of x1 and x2: ");
		subResult=x1-x2;
		System.out.println(subResult);	
		counter++;//counting a number of operations
		
		//Multiplication of x1 and x2
		System.out.print("Multiplication of x1 and x2: ");
		multiplicationResult=x1*x2;
		System.out.println(multiplicationResult);
		counter++;//counting a number of operations
		
		//Division of x1 and x2
		System.out.print("Division of x1 and x2: ");
		divisionResult=x1/x2;
		System.out.println(divisionResult);	
		counter++;//counting a number of operations

		//empty line
		System.out.println("");
		
		//Total number of mathematical operations, which were performed
		System.out.print("Number of performed mathematical operations: ");
		System.out.println(counter);

		//empty line
		System.out.println("");
		
		//Displaying of end text
		System.out.println(summary);
	}

}
