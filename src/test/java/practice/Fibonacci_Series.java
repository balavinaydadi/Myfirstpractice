package practice;

import java.util.Scanner;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int i, first=0 , second=1, next;
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		number= sc.nextInt();
		
		for(i=0;i<=number;i++) {
			System.out.println(first);
			next= first+ second;
			first=second;
			second=next;
			
		}

	}

}
