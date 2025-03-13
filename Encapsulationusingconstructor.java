package typecasting;
import java.util.Scanner;

class Studinfo{
	private int id;
	private String name;
	
	Studinfo(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id : ");
		this.id=sc.nextInt();
		sc.nextLine();	
		
		System.out.println("enter name:");
		this.name=sc.nextLine();
	}
	
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	
	
}







public class Encapsulationusingconstructor {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of student :");
		
		int size=sc.nextInt();
		
		Studinfo [] s=new Studinfo[size];
		
		for(int i=0; i<size; i++) {
			s[i] =new Studinfo();
			s[i].getId();
			s[i].getName();
			
			
		}
		for(int j=0; j<size; j++) {
			
			
		System.out.println("id is : " +s[j].getId());
		
		System.out.println("name is :"+s[j].getName());
		}
		
		
		
		
		
	}

}
