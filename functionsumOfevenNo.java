package typecasting;

public class functionsumOfevenNo {
	public static int sumOfEvenNo(int i) {
		int sum=0;
		while(i>0)
		{
			int rem=i%10;
			if(rem%2==0)
			{
			sum=sum+rem;
			
			}
			i=i/10;
			
					
		}
		return sum;
		
	}
	public static void main(String args[]) {
		int i=12465;
		int evenAdd=sumOfEvenNo(i);
		System.out.println(evenAdd);
		
	}	

}
