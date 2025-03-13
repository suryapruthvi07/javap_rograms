package typecasting;
import java.util.*;

class Studentt{
	private int id;
	private String name;
	private String address;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void  setAddress(String address) {
		this.address=address;
	}
	public String getAddress() {
		return this.address;
	}
	
	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(address);
	}
		
}



public class EncapsulationUsingforloop {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		
		Studentt[] s= new Studentt[size];
		
		for(int i=0;i<size;i++) {
			s[i] = new Studentt();
			System.out.println("enter id");
			int id=sc.nextInt();
			s[i].setId(id);
			System.out.println("enter name");
			String name=sc.nextLine();
			s[i].setName(name);
			sc.next();
			System.out.println("enter address");
			String address=sc.nextLine();
			s[i].setAddress(address);
			sc.next();
			
			
			}
		for(int j=0 ; j<size; j++) {
			s[j].display();
		}
		
	}

}
