package typecasting;

public class function4 {
	public static int isGreater(int a,int b,int c) 
	{
		if(a>b&&a>c)
		{
			System.out.println("a is greater");
			return a;
		}
		else if(b>c&&b>a){
			System.out.println("b is greater");
			return b;
			
		}
		else {
			System.out.println("c is greater");
			return c;
		}
	}
	public static void main(String args[]) {
		int a=10;
		int b=5;
		int c=15;
	    int greater=isGreater(a,b,c);
	    System.out.println(greater);
		
		
		
	}

}
