package typecasting;

public class baseexponent {
	public static void main(String args[])
	{
//		int base=2, exponant=3,ans=1;;
//		while(exponant>0)
//		{
//			ans=base*ans;
//			exponant--;
//		}
//		System.out.println(ans);
		
		int i=121;
		while(i>0) {
			int rem=i%10;
			System.out.print(rem);
			i=i/10;
		}
		
	}
}
