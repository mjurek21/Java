package prog003_InputOutput;
import java.util.Scanner;

public class stringInputOutput {
	public static void main(String[] args) {
		
		//definition of inputs
		String stringIn;
		int tempCels;
		int tempKelvin;
		final int CELS_PER_KELVIN=273;//factor used to convert Celsius to Kelvin
		//definition of string input
		Scanner in=new Scanner(System.in);
				
		//setting of string inputs
		System.out.print("Please type a text: ");
		stringIn=in.nextLine();
		System.out.println("You wrote: " + stringIn);
		
		//Celsius to Kelvin converter
		System.out.print("Please type a temperture [Celsius degrees]: ");
		tempCels=in.nextInt();
		tempKelvin=tempCels+CELS_PER_KELVIN;
		System.out.println("Kelvin temperature is: " + tempCels+ "+273=" +tempKelvin+"[K]");
		System.out.printf("Kelvin temperature is: %08d +273= %d [K]\n", tempCels,tempKelvin);
		//Rounding
		System.out.printf("Result after rounding 4/3= %.3f \n", 4.0/3.0);
		
		//setting of string inputs
		System.out.print("Please type a text: ");
		in.nextLine();//eliminates a problem with Scanner bug (reading of \n)
		stringIn=in.nextLine();
		System.out.println("You wrote: " + stringIn);
		

	}

}
