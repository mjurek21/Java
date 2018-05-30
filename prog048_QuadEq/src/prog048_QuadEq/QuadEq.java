package prog048_QuadEq;

import java.util.Scanner;

public class QuadEq {
	
	private double a_factor;
	private double b_factor;
	private double c_factor;
	
	public QuadEq(){
		this.a_factor=1;
		this.b_factor=0;
		this.c_factor=0;
	}
	public QuadEq(double a_factor, double b_factor, double c_factor){
		this.a_factor=a_factor;
		this.b_factor=b_factor;
		this.c_factor=c_factor;
	}
	public static double setFactor(){
		Scanner in=new Scanner(System.in);
		String word=new String();
		while(!in.hasNextDouble()){
			word=in.next();
			System.out.println("Given value \""+word+"\" is not a double!");
			System.out.print("Give a double value: ");
		}
		return in.nextDouble();
	}
	public void slvEq(){
		if (a_factor==0){
			System.out.println("Factor 'a' cannot be zero!");
		}
		double d=Math.pow(this.b_factor, 2)-4*this.a_factor*this.c_factor;
		
		if((d<0)&&(a_factor!=0)){
			System.out.println("This equation has no real solutions!");
		}
		if((d==0.0)&&(a_factor!=0)){
			System.out.println("This equation has one solution: "+(-b_factor/(2*a_factor)));
		}
		if((d>0)&&(a_factor!=0)){
			double x1=(-b_factor-Math.sqrt(d))/(2*a_factor);	
			double x2=(-b_factor+Math.sqrt(d))/(2*a_factor);
			System.out.println("This equation has two solutions: "+x1+" and "+x2);
		}
		
	}
	public static void main(String[] args) {
		double factor1=0,factor2=0,factor3=0;
		System.out.println("Square Equations:");
		System.out.print("Give a factor 'a': ");
		factor1=setFactor();
		System.out.print("Give a factor 'b': ");
		factor2=setFactor();
		System.out.print("Give a factor 'c': ");
		factor3=setFactor();
		QuadEq obj=new QuadEq(factor1,factor2,factor3);
		obj.slvEq();
	}
}
