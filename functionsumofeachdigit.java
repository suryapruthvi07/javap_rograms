package typecasting;

public class functionsumofeachdigit {
	public static int sumOfDigit(int no) {
		int sum=0;
		while(no>0) {
			int rem=no%10;	
			sum=sum+rem;
			no=no/10;
		}
		return sum;
		
	}
	public static void main(String args[])
	{
		int no=155;
		int add=sumOfDigit(no);
		System.out.println(add);
	}

}
