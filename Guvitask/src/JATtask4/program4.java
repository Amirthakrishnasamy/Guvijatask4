package JATtask4;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number 1:");
		int num1=sc.nextInt();
		System.out.println("Enter the number 2:");
		int num2=sc.nextInt();
		System.out.println("Before swap"+num1);
		System.out.println("Before swap"+num2);	

		int num3=num1;
		num1=num2;
		num2=num3;
		System.out.println("After swap"+num1);
		System.out.println("After swap"+num2);	

	}

}
