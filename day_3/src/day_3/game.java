package day_3;
import java.util.Scanner;
public class game {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.print("1~99 »çÀÌÀÇ Á¤¼ö ÀÔ·Â: ");
	int num = sc.nextInt();
	
	int a=num%30;
	int b=num%10;
	
	if ((a<10)&&(b%3==0)) {
		System.out.println("¹Ú¼öÂ¦Â¦");
	}
	else if ((a<10)||(b%3==0)) {
		System.out.println("¹Ú¼öÂ¦");
	}
	else {
		System.out.println("3.6.9°¡ ¾Æ´Õ´Ï´Ù.");
	}
	
}
}
