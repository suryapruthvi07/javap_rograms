package typecasting;
import java.util.*;

public class alphabetornot{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character:");
		char ch=sc.next().charAt(0);
		
		character(ch);
		
	}
	public static void character(char ch) {
		if(ch>='a'&& ch<='z' || ch>='A' && ch<='Z')
		{
			System.out.println("Alaphabet");
		}
		else {
			System.out.println("not alphabet");
		}
	}

}
