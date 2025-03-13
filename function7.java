package typecasting;

public class function7 {
	public static int countSum(int i) {
		int count=0;
		while(i>0) {
		   
		   count ++;
		   
		   i=i/10;
		   
			
		}
		return count;
	}
	public static void main(String args[]) {
		int i=153;
		
		int countdigit=countSum(i);
		System.out.println(countdigit);
		
		
	}

}
