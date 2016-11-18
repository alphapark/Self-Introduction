package Jeff;
public class HomeworkSeptSixth {
	public static void main(String[] ARGS){
	int sum = 0;
	for(int i = 0; i <= 1000; i++) {
		if(i%4 == 0 || i%6 == 0)
			sum = sum + i;
		}
	System.out.println(sum);
	}
}