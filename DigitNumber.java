package typecasting;
import java.util.*;

public class DigitNumber {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int i=sc.nextInt();
		positivenegative(i);
		
	}
	public static void positivenegative(int i) 
	{
	
		if(i>=-9 && i<=9)
		{
			System.out.println("digit");
		}
		else {
			System.out.println("number");
		}
		
	}
	

}
