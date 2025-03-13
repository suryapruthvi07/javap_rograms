
package typecasting;
import java.util.*;


class Students{
	private int rollno;
	private String name;
	private int age;
	private String address;
	private String gender;
	private int percentage;
	
	public void setRollNo(int rollno) {
		this.rollno=rollno;
	}
	public int getRollNo() {
		return this.rollno;
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
	
	public void setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return this.gender;
	}
	
	public void setPercentage(int percentage) {
		this.percentage=percentage;
	}
	public int getPercentage() {
		return this.percentage;
	}
	
	 public void studentInfo() {
	        System.out.println("Roll No: " + rollno);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Gender: " + gender);
	        System.out.println("Percentage: " + percentage);
	    }
	
}

public class Encapsulationusingarray {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of student:");
		int size=sc.nextInt();
		sc.nextLine();		
		Students [] s=new Students[size];
		
		for(int i=0; i<size; i++) {
			s[i] =new Students();
			
			System.out.println("enter rollno :");
			int rollno=sc.nextInt();
			sc.nextLine();	
			s[i].setRollNo(rollno);
			
			System.out.println("enter name:");
			String name=sc.nextLine();
			s[i].setName(name);
			
			
			System.out.println("enter age:");
			int age=sc.nextInt();
			sc.nextLine();	
			s[i].setAge(age);
			
			System.out.println("enter address:");
			String address=sc.nextLine();
			s[i].setAddress(address);
			
			
			System.out.println("gender:");
			String gender=sc.nextLine();
			s[i].setGender(gender);
			
			
			System.out.println("enter percentage:");
			int percantage=sc.nextInt();
			sc.nextLine();	
			s[i].setPercentage(percantage);
			
			
			
			
			
			
			
		}
		
		
		for(int j=0; j<size; j++) {
			s[j].studentInfo();
		}
		
		sc.close();
	}
	
	

}
