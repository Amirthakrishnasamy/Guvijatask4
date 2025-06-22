package JATtask4;

import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		if (age>=60) {
			System.out.println("He/She is a senior citizen");
		
		}
	   else {
		System.out.println("He/She is not a senior citizen");
		}
	}

}
