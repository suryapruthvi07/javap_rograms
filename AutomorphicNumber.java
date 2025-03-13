package typecasting;
import java.util.*;

class Automorphic{
	
	private int number;
	
	public void setNum(int number) {
		this.number=number;
		
	}
	
	public int getNum() {
		return this.number;
	}
	
	public void isAutomorphic() {
		
		
		int square=number*number;
		
		while(number>0) {
			if(number%10!=square%10) {
				System.out.println("number is not automorphic:");
				break;
		}
			number=number/10;
			square=square/10;
	    
	  	}
	
	
		
	 if(number==0) {
		 System.out.println("number is automorphic:");
	 }
	}
}
public class AutomorphicNumber {
	public static void main(String args[]) {
		
		Automorphic a=new Automorphic();
		a.setNum(25);
		
		a.isAutomorphic();
		
		
		
		
		
		
		
		
		
		
	}

}
