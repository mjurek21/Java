package prog042_Employees;

public class CEO extends AbsEmployee{
	private int bonus;
	
	public CEO(String empName, int empSalary, int bonus){
		super(empName,empSalary);
		this.bonus=bonus;
	}
	public int getEmpSalary(){
		return (this.bonus+super.getEmpSalary());
	}
	public void print(){
		System.out.println("********************************");
		System.out.println("* Name: "+getEmpName()+", CEO    *");
		System.out.println("* Salary per month: "+getEmpSalary()+" Euro *");
		System.out.println("********************************");
	}
}
