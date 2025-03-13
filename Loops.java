
package typecasting;

import java.util.*;



public class Loops {

	public static void main(String args[]) {

		

		Scanner sc=new Scanner(System.in);

		System.out.println("enter starting number:");

		int start=sc.nextInt();

		System.out.println("enter end number:");

		int end=sc.nextInt();

		

		 

		EvenNO(start,end);

	    oddNo(start ,end);

	    add(start,end);

	 

		

		

		

	}

	public static void EvenNO(int start,int end) {

		

		for(int i=start; i<=end; i++)

		{

			if(i%2==0)

			{

				System.out.println(i+"");

			}

			

		}

		
System.out.println();
		

		

	}

	public static void oddNo(int start,int end) {

		for(int i=start; i<=end; i++)

		{

			if(i%2!=0)

			{

				System.out.println(i+"");

			}

		}
		System.out.println();

	}

	public static void add(int start ,int end) {
int evensum=0; int oddsum=0;
		
		for(int i=start; i<=end; i++) {
			if(i%2==0)
			{
				evensum=evensum+i;
				
			}
			else {
				oddsum=oddsum+i;
			}
		}
		
		

		

	System.out.println("even number addition: " +evensum);
	System.out.println("odd number addition:" +oddsum);

	}


}