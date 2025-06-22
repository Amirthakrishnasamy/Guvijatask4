package JATtask4;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long num = sc.nextLong();
        sc.close();
        int count=0;
        while (num!=0) {
        	num/=10;
        	count++;
        }
        System.out.println(count);
	}
        		
        		
	}