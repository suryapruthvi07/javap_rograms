package typecasting;
import java.util.*;



class EmployeeInfo{
	private int empid;
	private String empname;
	private String empaddress;
	private int empage;
	private int empsalary;
	
	public void setId(int empid) {
		this.empid=empid;
		
	}
	public int getId() {
		return this.empid;
	}
	
	
	public void setName(String empname) {
		this.empname=empname;
		
	}
	public String getName() {
		return this.empname;
	}
	
	public void setAddress(String empaddress) {
		this.empaddress=empaddress;
	}
	public String getAddress() {
		return this.empaddress;
	}
	
	public void setAge(int empage) {
		this.empage=empage;
	}
	public int setAge() {
		return this.empage;
	}
	
	public void setSalary(int empsalary) {
		this.empsalary=empsalary;
	}
	public int getSalary() {
		return this.empsalary;
	}
	
	public void Employeeinfo() {
		System.out.println("employee id: " +empid);
		System.out.println("employee name:" +empname);
		System.out.println("employee address: " +empaddress);
		System.out.println("employee age:" +empage);
		System.out.println("employee salary:" +empsalary);
	}
	
	
	
	
}

public class StudentInfoformationusingencapsulationandarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of employee");
		int size=sc.nextInt();
		sc.nextLine();
		
		EmployeeInfo[] E=new EmployeeInfo[size];
		
		for(int i=0; i<size; i++)
		{
			E[i]=new EmployeeInfo();
			
			System.out.println("enter employee id :");
			int empid=sc.nextInt();
			E[i].setId(empid);
			sc.nextLine();
			
			System.out.println("enter employee name :");
			String empname=sc.nextLine();
			E[i].setName(empname);
			
			System.out.println("enter employee address :");
			String empaddress=sc.nextLine();
			E[i].setName(empaddress);
			
			
			System.out.println("enter employee age :");
			int empage=sc.nextInt();
			E[i].setId(empage);
			sc.nextLine();
			
			

			System.out.println("enter employee salary :");
			String empsalary=sc.nextLine();
			E[i].setName(empsalary);
			
			
			
			
			
			
			
			
			
			
		}
		
		for(int j=0; j<size; j++)
		{
			E[j].Employeeinfo();
			
		}
		
		
		
		
	}

}
