package prog031_Objects_ex2;
import java.math.BigInteger;
public class Object2 {
/**
 * Method calculates high powers using BigInteger
 * @param x base of power (int)
 * @param n exponent of power (int)
 * @return BigInteger result of raised 'x' to power of 'n'
 */
	public static BigInteger pow(int x, int n){
		if(n==0){
			return BigInteger.valueOf(1);
		}
		BigInteger t=BigInteger.valueOf(x);
		t=t.pow(n/2);
		if(n%2==0){
			return t.multiply(t);
		}
		else{
			return t.multiply(t.multiply(BigInteger.valueOf(x)));
		}
	}
	public static void main(String[] args) {
		int base=200;
		int exponent=200; 
		BigInteger baseBig=BigInteger.valueOf(base);
		//compare of correctness of new method using standard BigInteger power method
		System.out.println("Base: "+base+", exponent: "+exponent+", BigInteger POW: " +baseBig.pow(exponent));
		System.out.println("Base: "+base+", exponent: "+exponent+", My pow:         " +pow(base,exponent));
	}

}
