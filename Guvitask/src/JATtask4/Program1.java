package JATtask4;
import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for a");
		int a=sc.nextInt();
		System.out.println("Enter the number for b");
		int b=sc.nextInt();
		System.out.println("Enter the number for c");
		int c=sc.nextInt();
		System.out.println("Enter the number for d");
		int d=sc.nextInt();

	     if((a+b)>(c+d)) {
	    	 System.out.println("sum of a+b is greater than c+d");
	     }else {
	    	 System.out.println("sum of a+b is less than c+d");
	     }
	}

}
