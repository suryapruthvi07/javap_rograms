package typecasting;

public class functionsumofoddnumber {
	public static int sumOfOddNo(int i) {
		int sum=0;
		while(i>0)
		{
			int rem=i%10;
			if(rem%2!=0)
			{
			sum=sum+rem;
			
			}
			i=i/10;
			
					
		}
		return sum;
		
	}
	public static void main(String args[]) {
		int i=12465;
		int oddAdd=sumOfOddNo(i);
		System.out.println(oddAdd);
		
	}	

}
