package Jeff;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Scanner;
//import java.util.Date;


public class HotterColder {
	public static void main(String[] ARGS) {
		SecureRandom rand = new SecureRandom();
		rand.setSeed(new Date().getTime());
		Scanner input = new Scanner(System.in);
		
		//import java.security.SecureRandom
		//SecureRandom rand = new SecureRandom();
		//rand.setSeed(new Date (), getTime());
		//myRandomNumber = rand.nextInt((max-min)+1)+min;
		int absolute = Math.abs(-9);
		System.out.println(absolute);
		
		int max = 100;
		int min = 1;
		int randomNum = rand.nextInt((max-min)+1)+min;
		int Guess;
		int Warm;
	
	
	System.out.printf("Guess a number between 1 and 100");
	Guess=input.nextInt();
	if(Math.abs(randomNum-Guess)<50) {
		System.out.printf("Try it again");
		if(Math.abs(randomNum-Guess>50))
		System.out.printf("Warm");
	
		Warm=input.nextInt();
		if(Math.abs(50)=50);
		
	}
	}

}
