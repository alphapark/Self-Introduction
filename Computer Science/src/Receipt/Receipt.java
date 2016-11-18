package Receipt;
 import java.util.Scanner;
 public class Receipt {
 	public static void main(String[] ARGS) {
 		Scanner input = new Scanner(System.in);
 		double[] Price = 	{350, 				450, 				550, 650, 750, 150, 250, 1000, 350, 450};
 		String[] Products = {"Galaxy Note 1", 	"Galaxy Note 2", 	"Galaxy Note 3", "Galaxy Note 4", "Galaxy Note 5", "Galaxy S1", "Galaxy S2", "Galaxy Note 7", "Galaxy S3", "Galaxy S4"};
 		int[] Purchases = new int[10];
 		double total = 0;
 		
 		for(int i = 0; i < 10; i++) {
 			System.out.printf("%s costs $%6.2f. How many would you buy?", Products[i], Price[i]);
 			Purchases[i] = input.nextInt();
 			total += Price[i] * Purchases[i];
 		}
 		 
 		System.out.println("------------------------------------");
 		for(int i = 0; i < 10; i++) {
 			System.out.printf("| %-13s | %3d | $%8.2f |\n", Products[i], Purchases[i], Purchases[i]*Price[i]);	
 		}
 		
		System.out.println("------------------------------------");
 		System.out.println(total);
 	}
 }
 	
 		
 		
 	
 	
 