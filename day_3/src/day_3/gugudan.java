package day_3;
import java.util.Scanner; 
public class gugudan {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.print("╢э ют╥б: ");
	int num = sc.nextInt();
	int i=0;
			
	for(i=1; i<10; i++)
		System.out.println(num+"*"+i+"="+(num*i));

}
}
