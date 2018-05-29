package prog042_Employees;

public class Bookkeeper extends AbsEmployee{

	public Bookkeeper(String empName, int empSalary){
		super(empName,empSalary);
	}
	public void print(){
		System.out.println("********************************");
		System.out.println("* Name: "+getEmpName()+", Bookkeeper *");
		System.out.println("* Salary per month: "+getEmpSalary()+" Euro *");
		System.out.println("********************************");
	}
	public static void main(String[] args) {
		Employee emp1=new Bookkeeper("John Smith", 40000);
		Employee emp2=new Trainee("Johny Smith");
		Employee emp3=new CEO("Sir John Smith", 60000,10000);
		emp1.print();
		System.out.println();
		emp2.print();
		System.out.println();
		emp3.print();
		System.out.println();
		System.out.println("Total salary of all employees: "+(emp1.getEmpSalary()+emp2.getEmpSalary()
		+emp3.getEmpSalary()));
	}
}
