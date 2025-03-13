package typecasting;

class armstrong{
	private int no=153;
	
	public void setNum(int no) {
		this.no=no;
	}
	public int getNum() {
		return this.no;
	}
	public int findAramstrong() {
		int sum=0;
		while(no>0) {
			int rem=no%10;
			sum += (rem*rem*rem);
			no=no/10;
		}
		return sum;
	}
	
	
	
	
}

public class AramstrongNo {
	public static void main(String args[]) {
		armstrong a=new armstrong();
		a.setNum(153);
		int arm=a.findAramstrong();
		System.out.println(arm);
		
	}

}
