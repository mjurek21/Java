package prog046_Arrays_ex8;

public class Array2D extends TestArray{

	public Array2D(int[][] array){
		fill(array);
	}
	/**
	 * Method fills an int array with random value between 0 and 9
	 * @param arrayfilled int array
	 */
	public static void fill(int[][] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=rand.nextInt(10);
			}
		}
	}
	/**
	 * Method fills an array with next prime numbers
	 * @param array array filled with next prime numbers
	 */
	public static void primeFill(int[][] array){
		int nxPrime=1;
		
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array[i].length;j++){
				array[i][j]=nextPrime(nxPrime);
				nxPrime=nextPrime(nxPrime);
			}
		}
	}
	/**
	 * Method finds a next prime number
	 * @param lastPrime last number up which is conducted searching of a new one
	 * @return next prime number
	 */
	public static int nextPrime(int lastPrime) {
		lastPrime++;
		while(!isPrime(lastPrime)){
			lastPrime++;
		}
		return lastPrime;
	}
	/**
	 * Method checks if number is a prime number
	 * @param nextNumber number which is verified
	 * @return false if number is not prime, true if number is prime
	 */
	public static boolean isPrime(int nextNumber) {
	    for(int i=2;i<nextNumber;i++) {
	        if(nextNumber%i==0)
	            return false;
	    }
	    return true;
	}
	/**
	 * Method displays int 2D array
	 * @param array Array intended to display
	 */
	public static void print(int[][] array){
		for(int i=0;i<array.length;i++){
			System.out.println();
			print(array[i]);
		}
	}
	/**
	 * Method creates and displays array with not equal length of raws
	 */
	public static void notEqualArr(){
		int [][] array2D=new int[5][];
		array2D[0]=new int[3];
		array2D[1]=new int[5];
		array2D[2]=new int[1];
		array2D[3]=new int[7];
		array2D[4]=new int[5];
		System.out.println("\n\n2D not equal array:");
		fill(array2D);
		print(array2D);
	}
	public static void main(String[] args) {
		System.out.println("\n\n2D Array:");
		int [][] array2D=new int[10][10];
		fill(array2D);
		print(array2D);
		System.out.println("\n\n2D prime array:");
		int [][] prime2DArr=new int[5][4];
		primeFill(prime2DArr);
		print(prime2DArr);
		notEqualArr();
	}
}
