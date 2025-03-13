package typecasting;

class Student{
	
	private int id;
	private String name;
	private String address;
	private String gender;
	
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

	public void setGender(String gender) {
		this.gender=gender;
	}
	public String getGender() {
		return this.gender;
	}
	
	
	public void display() {
System.out.println(id);
System.out.println(name);
System.out.println(address);
System.out.println(gender);
		
	}
	
	 
	
}


public class encapsulation {

	public static void main(String args[]) {
		Student s=new Student();
		Student s1=new Student();
		Student s2=new Student();
		s.setId(397);
		s.setName("pruthvi");
		s.setAddress("Latur");
		s.setGender("Male");
		s.display();
		s1.setId(398);
		s1.setName("aman");
		s1.setAddress("baramti");
		s1.setGender("female");
		s1.display();
		s2.setId(400);
		s2.setGender("transgender");
		s2.setAddress("satara");
		s2.setName("anand");
		s2.display();
			
		
	}
}
