package typecasting;

public class function2 {
	public static boolean isEven(int a) {
		
		if(a%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[]) {
		int a=11;
		boolean evenodd=isEven(a);
		if(evenodd)
		System.out.println("even");
		else
			System.out.println("odd");

			
	}

}
