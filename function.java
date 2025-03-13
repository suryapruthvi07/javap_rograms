package typecasting;

public class function
{
	
	public static boolean isPositive(int a)
	
	{
		
		if(a>0) {
			return true;
		}
		else {
			return false;
		}
		
    }
	
	public static void main(String args[]) {
		int a=10;
		boolean positive=isPositive(a);
		System.out.println(positive);
		
	}

}
