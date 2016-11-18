package Jeff;
import java.util.Scanner;
public class Receipt {
	public static void main(String[] ARGS) {
	
	System.out.printf("Macbookpro cost $%.4f, How many?\n", MacbookproPrice);
	Macbookpro = input.nextInt();
	System.out.printf("Macbookair cost $%.4f, How many?\n", MacbookairPrice);
	Macbookair = input.nextInt();
	System.out.printf("iphone7 cost $%.4f, How many?\n", iphone7Price);
	iphone7 = input.nextInt();
	System.out.printf("iphone7plus cost $%.4f, How many?\n", iphone7plusPrice);
	iphone7plus = input.nextInt();
	System.out.printf("iphone6s cost $%.4f, How many?\n", iphone6sPrice);
	iphone6s = input.nextInt();
	System.out.printf("ipad cost $%.4f, How many?\n", ipadPrice);
	ipad = input.nextInt();
	System.out.printf("ipod cost $%.4f, How many?\n", ipodPrice);
	ipod = input.nextInt();
	System.out.printf("applewatch cost $%.4f, How many?\n", applewatchPrice);
	applewatch = input.nextInt();
	System.out.printf("beatsolo cost $%.4f, How many?\n", beatsoloPrice);
	beatsolo = input.nextInt();
	System.out.printf("beatsearphone cost $%.4f, How many?\n", beatsearphonePrice);
	beatsearphone = input.nextInt();
	
	System.out.println("----------------------------------");
	System.out.printf("| Macbookpro | %3d | $%.6f |\n", Macbookpro, (double)(Macbookpro)*MacbookproPrice);
	System.out.printf("| Macbookair | %3d | $%.6f |\n", Macbookair, (double)(Macbookair)*MacbookairPrice);
	System.out.printf("| iphone7 | %3d | $%.6f |\n", iphone7, (double)(iphone7)*iphone7Price);
	System.out.printf("| iphone7plus | %3d | $%.6f |\n", iphone7plus, (double)(iphone7plus)*iphone7plusPrice);
	System.out.printf("| iphone6s | %3d | $%.6f |\n", iphone6s, (double)(iphone6s)*iphone6sPrice);
	System.out.printf("| ipad | %3d | $%.6f |\n", ipad, (double)(ipad)*ipadPrice);
	System.out.printf("| ipod | %3d | $%.6f |\n", ipod, (double)(ipod)*ipodPrice);
	System.out.printf("| applewatch | %3d | $%.6f |\n", applewatch, (double)(applewatch)*applewatchPrice);
	System.out.printf("| beatsolo | %3d | $%.6f |\n", beatsolo, (double)(beatsolo)*beatsoloPrice);
	System.out.printf("| beatsearphone | %3d | $%.6f |\n", beatsearphone, (double)(beatsearphone)*beatsearphonePrice);

	System.out.println("----------------------------------");
}
}
}
