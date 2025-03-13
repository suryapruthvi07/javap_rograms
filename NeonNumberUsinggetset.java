package typecasting;

import java.util.Scanner;

class Neon{
	private int num;
	
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return this.num;
		
	}
	
	public void isNeonNumber(int num) {
		
		int sum=0;
		int square=num*num;
		
		while(square > 0) {
			
			int rem=square%10;
			sum=sum+rem;
			
		    square=square/10;
		    
		   
		   
		    
		}
//		 System.out.println(sum);
		    
		if(sum==num) {
	    	System.out.println("number is neon:");
	    }
	    else {
	    	System.out.println("number is not neon:");
	    }
		System.out.println(sum);
		
	}
}


public class NeonNumberUsinggetset {
	public static void main(String args[]) {

		
		Neon n=new Neon();
		n.setNum(9);
		int i=n.getNum();
		n.isNeonNumber(i);
		
		

	}

}
