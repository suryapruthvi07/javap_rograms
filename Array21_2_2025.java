package typecasting;
import java.util.*;



class A{
	
	private int size;
	private int [] arr;
	
	public void setSize(int size) {
		this.size=size;
	}
	
	public void setArr(int [] arr) {
		this.arr=arr;
	}
	
	public void init() {
		 int [] arr=new int[size];
		for(int i=0; i<size; i++) {
			
			Scanner sc=new Scanner(System.in);
			arr[i]=sc.nextInt();
			
		}
		setArr(arr);
	}
	
	public void display() {
		for(int i=0; i<size; i++) {
			System.out.println("|" +arr[i]+ "|");
		}
	}
	
	public void displaysum() {
		int sum=0;
		for(int i=0; i<size; i++) {
			sum=arr[i]+sum;
		}
		System.out.println("total sum:"+ sum);
	}
	
	public void displayeven() {
		int evensum=0;
		for(int i=0; i<size; i++)
		
		{
			if(arr[i]%2==0) {
				
				
				System.out.println("Even:" + arr[i]);
				evensum=arr[i]+evensum;
				
				
			}
		}
		System.out.println("Sum Of Even No:" + evensum);
		}
		
		public void displayodd(){
			int oddsum=0;
			for(int i=0; i<size; i++) {
				if(arr[i]%2!=0) {
					System.out.println("Odd:" + arr[i]);
					oddsum=arr[i]+oddsum;
					
				}
			}
			
			System.out.println("Sum Of Odd No:"+oddsum);
		
	}
	
}


public class Array21_2_2025 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eter Size:");
		int size=sc.nextInt();
		A a=new A();
		a.setSize(size);
		a.init();
		a.display();
		
		a.displayeven();
		a.displayodd();
		
		a.displaysum();
		
		
	}

}
