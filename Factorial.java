package typecasting;
class FactorialNum{
	private int no;
	
	public void setNum(int no) {
		this.no=no;
	}
	
	public int getNum() {
		return this.no;
	}
	
	public int factorialOfNo() {
		int factorial=1;
		
		while(no>0) {
			
			factorial=factorial*no;
			no--;
			
		}
		return factorial;
	}
}





public class Factorial {
	public static void main(String args[]) {
		FactorialNum f=new FactorialNum();
		f.setNum(5);
		int fact=f.factorialOfNo();
		System.out.println(fact);
	}

}
