package prog030_Objects_ex1;
import java.math.BigInteger;

public class ClassFactorial {
	
	public static BigInteger factorial(int factor){
		
		BigInteger result=BigInteger.valueOf(1);
		for (int i=0;i<=factor;i++){
			if(i==0){
				result=result.multiply(BigInteger.valueOf(1));
			}
			else{
				result=result.multiply(BigInteger.valueOf(i));
			}
		}
		if(factor==0){
			return result;
		}
		return result;
	}
	
	public static void main(String[] args) {
		int factor=30;
		for (int i=0;i<=factor;i++){
			System.out.println("No: "+i+", BigInteger: "+BigInteger.valueOf(i)+", factorial: "+factorial(i));
		}

	}

}
