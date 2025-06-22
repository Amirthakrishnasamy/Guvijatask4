package JATtask4;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for factorial");
		long a=sc.nextLong();
		int s=1;
		for(int i=1;i<=a;i++) {
		s=s*i;	
		}System.out.println(s);
	}

}
