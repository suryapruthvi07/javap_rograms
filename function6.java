package typecasting;

public class function6 {
	
	public static void isLeapYear(int n) {
		
		if(n%4==0&&n%100!=0||n%400==0) {
			System.out.println("leap year");
		}
		else {
			System.out.println("not leap year");
		}
		
	}	
	public static void main(String args[])
	
	{
		int n=2022;
		isLeapYear(n);
		
		
	}

}
