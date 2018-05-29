package prog042_Employees;

public abstract class AbsEmployee implements Employee{
	private String empName;
	private int empSalary;
	
	public AbsEmployee(){
		this.empName="none";
		this.empSalary=0;
	}
	public AbsEmployee(String empName){
		this.empName=empName;
		this.empSalary=0;
	}
	public AbsEmployee(String empName, int empSalary){
		this.empName=empName;
		this.empSalary=empSalary;
	}
	public int getEmpSalary(){
		return this.empSalary;
	}
	public String getEmpName(){
		return this.empName;
	}
}
