package prog042_Employees;

public class Trainee extends AbsEmployee {
	
	public Trainee(String empName){
		super(empName);
	}
	public void print(){
		System.out.println("********************************");
		System.out.println("* Name: "+getEmpName()+", Trainee   *");
		System.out.println("* Salary per month: none       *");
		System.out.println("********************************");
	}
}
