
import java.util.Scanner;

public class Ifelse3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int tax;

        if(i<500000){
            tax=0;
            
        }else if(i>500000&&i<1000000){
            tax=(int)( i*0.2);
        }else{
            tax=(int) (i*0.3);
        }
            System.out.println("your tax is:"+tax);
        }
    }
    

