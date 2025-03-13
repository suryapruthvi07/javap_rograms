package typecasting;

class SumOf{
	private int no;
	
	
	public void setNum(int no)
	{
		this.no=no;
	}
	
	public int getNum()
	{
		return this.no;
	}
	
	public int sumOfOddNum() {
		int sum=0;
		while(no>0) {
			int rem=no%10;
			if(rem%2!=0)
			{
				sum += rem;
			}
			no=no/10;
		}
		return sum;
	}
}

public class SumOdd {
	public static void main(String args[]) 
	{
		SumOf num=new SumOf();
		num.setNum(13516);
		int odd=num.sumOfOddNum();
		System.out.println(odd);
	}

}
