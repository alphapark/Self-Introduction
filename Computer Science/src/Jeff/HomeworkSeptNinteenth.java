package Jeff;

public class HomeworkSeptNinteenth {

public static void main(String[] ARGS){
	int curVal=0;
	int val1=1;
	int val2=0;	
	
	do{
		curVal=val1+val2;
		if(curVal%2==0);{
			val1=val2;
			val2=curVal;
			System.out.print(curVal+"13");
	        curVal ++;
	} 
}
	while(curVal<1000000);

}
}