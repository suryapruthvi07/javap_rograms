package typecasting;

import java.util.Scanner;

class TeacherInfo{
	private int id;
	private String name;
	private int age;
	private int experiance;
	private String address;
	private int salary;
	
	
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int setId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return this.age;
	}
	
	public void setExperiance(int experiance) {
		this.experiance=experiance;
		
	}
	public int getExperiance() {
		return this.experiance;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void teacherDetails() {
		System.out.println("teacher clg id no:"+id);
		System.out.println("teacher name:"+name);
		System.out.println("teacher age:"+age);
		System.out.println("teacher working experiance in clg :  "+ experiance  +       "years");
		System.out.println("address:" +address);
		System.out.println("salary:"+salary);
	}
}

public class Teachersinformationusingencapsulationandarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of teacher :");
		int size=sc.nextInt();	
		sc.nextLine();
		
		TeacherInfo [] t=new TeacherInfo[size];
		
		for(int i=0; i<size; i++) {
			t[i]=new TeacherInfo();
			
			System.out.println("enter id no:");
			int id=sc.nextInt();
			t[i].setId(id);
			sc.nextLine();
			
			System.out.println("enter name:");
			String name=sc.nextLine();
			t[i].setName(name);
			
			System.out.println("enter age:");
			int age=sc.nextInt();
			t[i].setAge(age);
			sc.nextLine();
			
			System.out.println("enter experiance :");
			int experiance=sc.nextInt();
			t[i].setExperiance(experiance);
			sc.nextLine();
			
			System.out.println("address:");
			String address=sc.nextLine();
			t[i].setAddress(address);
			
			System.out.println("salary:");
			int salary=sc.nextInt();
			t[i].setSalary(salary);
			sc.nextLine();
			
			
			
			
			
		}
		for(int j=0; j<size; j++) {
			t[j].teacherDetails();
		
		
		}
	
	
		
		
		
		
	}
}


