package typecasting;
import java.util.*;

public class uppercaselowercase {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter alphabet");
		char ch=sc.next().charAt(0);
		alphabet(ch);
		
	}
	public static void alphabet(char ch) {
		if(ch>='a'&& ch<='z' ) 
		{
			System.out.println("lower case");
		}
		else if( ch>='A' && ch<='Z')
		{
			System.out.println("upper case");
		}
		else {
			System.out.println("invalid");
		}
	}

}
