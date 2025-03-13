package typecasting;

class EvenNo{
	private int num;
	
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return this.num;
	}
	
	public int sumOfEvenNum() {
		int sum=0;
		while(num>0)
		
		{
			int rem=num%10;
			if(rem%2==0)
			{
				sum=sum+rem;
			}
			num=num/10;
		}
		return sum;
	}
	
}

public class sumOfEvenNo {
	public static void main(String args []) {
		EvenNo no=new EvenNo();
		no.setNum(12346);
		int noo=no.sumOfEvenNum();
		System.out.println(noo);
		
		
	}

}
