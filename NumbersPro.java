
package typecasting;

  class CountDigits {
	private int num;
	
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return this.num;
	}
	
	public int Countdigit() {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
}
 
 
 public class NumbersPro{
	 public static void main(String args[]) {
		 CountDigits h=new  CountDigits();
		 h.setNum(12345465);
	     int c=h.Countdigit();
		 System.out.println(c);
	 }
 }
