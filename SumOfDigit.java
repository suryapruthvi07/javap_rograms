package typecasting;

class SumNo{
	private int num;
	
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return this.num;
	}
	
	public int sumOfNoo() {
		int sum=0;
		while(num>0){
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		return sum;
	}
}

public class SumOfDigit {
	public static void main(String args[]) {
		
		SumNo h=new SumNo();
		h.setNum(123);
		int c=h.sumOfNoo();
		System.out.println(c);
	}

}
