package typecasting;

public class functionAmstrongno {
	public static int amastrongNo(int no) {
		int sum=0;
	
		while(no>0) {
			int rem=no%10;
			 sum=sum + (rem*rem*rem );
			no=no/10;
		}
		return sum;
		
	}
	public static void main(String args) {
		
		int no=153;
		int a=amastrongNo(no);
		System.out.println(a==no);
	}

}
