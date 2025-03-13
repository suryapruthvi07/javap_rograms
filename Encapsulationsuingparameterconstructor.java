package typecasting;

import java.util.Scanner;

class Info{
	private int id;
	private String name;
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	
	Info(int id,String name){
		Scanner sc=new Scanner(System.in);
	    this.id=id;;
	    sc.nextLine();
	    
	    this.name=sc.nextLine();
	    
		
	}
}







public class Encapsulationsuingparameterconstructor {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of Student :");
		int size=sc.nextInt();
		
		Info[] I=new Info[size];
		
		for(int i=0; i<size; i++) {
			I[i] =new Info(id,name);
			I[i].getId();
			I[i].getName();
			
			
		}
		
		for(int j=0; j<size; j++)
		{
			I[j].Info(id,name);
			
		}
		
	}

}
