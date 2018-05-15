package prog010_ValueMethods_ex1;
import java.util.Scanner;

public class triangleTest {
/**
 * Method is checking if sticks can be arranged in a triangle
 * @author mjurek21
 * @param x first triangle stick
 * @param y second triangle stick
 * @param z third triangle stick
 * @return true three sticks can be arranged in a triangle
 * @return false three sticks cannot be arranged in a triangle
 */
	public static boolean isTrianglePossible(int x, int y, int z){
		if (x<(y+z)&&y<(x+z)&&z<(y+x)) return true;
		else return false;	
	}
	/**
	 * Method is checking if given stick dimensions are really integers
	 * @author mjurek21
	 * @return Given input integer after verification
	 */	
	public static int getStickInt(){
		int dimenssion;
		Scanner in= new Scanner(System.in);
		//Elimination of risk that user is giving not a double
		while(!in.hasNextDouble()){
			String word=in.next();
			System.err.print(word+" is not a double, give a new dimension:");
		}
		dimenssion=in.nextInt();
		return dimenssion;
	}
	public static void main(String[] args) {
		//sticks of hypothetical triangle
		int stick1;
		int stick2;
		int stick3;
		
		System.out.print("Give a first stick dimension:");
		stick1=getStickInt();	
		System.out.print("Give a second stick dimension:");
		stick2=getStickInt();
		System.out.print("Give a third stick dimension:");
		stick3=getStickInt();
		if (isTrianglePossible(stick1, stick2, stick3)){
			System.out.println("It is possible to arrange sticks in a trangle!");
		}
		else{
			System.out.println("It is NOT possible to arrange sticks in a trangle!");
		}
	}

}
