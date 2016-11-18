package Jeff;

import java.util.Scanner;
public class Calculator{
	public static void main (String [] args){
		Scanner basic = new Scanner (System.in);
		int a, b, n;
		System.out.print("Put number of operation");
		n= basic.nextInt();
		
		for(int i=0; i<n; i++){
			System.out.printf("Operation #%d", i+1);
			System.out.println();
			System.out.println("Put two numbers to calculate.");
			System.out.print("Number 1:");
			 a = basic.nextInt();
			System.out.print("Number 2:");
			 b = basic.nextInt();
			
			System.out.println("Put an operation sign to perform (+, -, *, /): ");
			char op = basic.next().charAt(0);
			if(op == '+'){
				System.out.printf("The result is %d!", a+b);
			} else if(op == '-'){
				System.out.printf("The result is %d!", a-b);
			} else if(op == '*'){
				System.out.printf("The result is %d!", a*b);
			} else if(op == '/'){
				System.out.printf("The result is %d and the remainder is%d!", a/b, a%b);
			} else{
			System.out.print("You put a wrong number input. Do it again!");
			
			}
			System.out.println();
			System.out.println();
			
		}
		
		System.out.println("All operation are complete.");
		
		
		
	}
	
}
