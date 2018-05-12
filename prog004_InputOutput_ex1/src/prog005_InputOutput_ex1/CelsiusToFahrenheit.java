package prog005_InputOutput_ex1;
import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		//variables and constants 
		double tempCelsius;
		double tempFahrenheit;
		//Input initialization
		Scanner in= new Scanner(System.in);
		
		//Waiting for user temperature
		System.out.print("Give temperature in Celsius: ");
		tempCelsius=in.nextDouble();
		tempFahrenheit=tempCelsius*(9.0/5.0)+32;
		System.out.format("Temperature after conversion to Fahrenheit is: %.1f",tempFahrenheit);
		

	}

}
