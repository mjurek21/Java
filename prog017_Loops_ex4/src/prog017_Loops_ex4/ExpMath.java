package prog017_Loops_ex4;
import java.util.Scanner;

public class ExpMath {
/**
 * Method is getting an integer value from user.
 * Method is testing if given value is a positive integer.
 * Method is asking for corrections if given value is not correct.
 * @return Checked integer variable
 */
	public static int getInt(){
		
		int variable=1;
		Scanner in=new Scanner(System.in);
		
		while (!in.hasNextInt()){
			String word=in.next();
			System.err.println("Given \""+word+"\" is not an integer. Try again: ");
		}
		do{
			variable=in.nextInt();
			if (variable<0)
				System.out.println("Given \""+variable+"\" is not a positive integer. Try again: ");
		}while(variable<0);
		return variable;
	}
	/**
	 * Method is getting a double value from user.
	 * Method is testing if given value is a double.
	 * Method is asking for corrections if given value is not correct.
	 * @return Checked double variable
	 */
		public static double getDouble(){
			
			double variable=1;
			Scanner in=new Scanner(System.in);
			
			while (!in.hasNextDouble()){
				String word=in.next();
				System.err.println("Given \""+word+"\" is not double. Try again: ");
			}
			variable=in.nextDouble();
			return variable;
		}
		/**
		 * Method is calculating an estimation of EXP(-x^2).
		 * @return Estimation of EXP(-x^2)
		 */
		public static double gauss(double x, int n){
			
			double result=1;
			int factorial=1;
			double mult=1;
			for (int i=1;i<=n;i++){
				factorial=factorial*i;
				mult=mult*x*x;
				if(i%2==0){
					result+=mult/factorial;
				}
				if(i%2!=0){
					result-=mult/factorial;
				}
			}
			return result;
		}
		/**
		 * Method is calculating a second estimation of EXP(-x^2).
		 * @return Estimation of EXP(-x^2)
		 */
		public static double gauss2(double x, int n){
			
			double result=1;
			int factorial=1;
			for (int i=1;i<=n;i++){
				factorial=factorial*i;
				if(i%2==0){
					result+=Math.pow(x, 2*i)/factorial;
				}
				if(i%2!=0){
					result-=Math.pow(x, 2*i)/factorial;
				}
			}
			return result;
		}
		public static void testGauss(double x, int n){

			System.out.printf("%10s %10s %15s %15s %15s\n","x","n","Estimation1","Estimation2", "Real");
			for (double i=1.0;i<=x;i++){
				for (int j=0;j<=n;j++){
					System.out.printf("%10.2f %10d %15.4f %15.4f %15.4f\n",i,j,+gauss(i,j),+gauss2(i,j),Math.exp(-i*i));				
				}
			}
		}	
	public static void main(String[] args) {

		int intVariable;
		double doubleVariable;
		System.out.println("Calculation of EXP(-x^2)");
		System.out.print("Give a double factor: ");
		doubleVariable=getDouble();
		System.out.print("Give an integer factor: ");
		intVariable=getInt();		
		testGauss(doubleVariable, intVariable);
		


	}

}
