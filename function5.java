package typecasting;

public class function5 {
	public static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After swapping: a = " + a + ", b = " + b);
		
		
		
	}
	public static void main(String args[])
	{
		int a=10;
		int b=5;
		
	     swap(a,b);
	}

}
