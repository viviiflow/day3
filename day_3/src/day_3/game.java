package day_3;
import java.util.Scanner;
public class game {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.print("1~99 ������ ���� �Է�: ");
	int num = sc.nextInt();
	
	int a=num%30;
	int b=num%10;
	
	if ((a<10)&&(b%3==0)) {
		System.out.println("�ڼ�¦¦");
	}
	else if ((a<10)||(b%3==0)) {
		System.out.println("�ڼ�¦");
	}
	else {
		System.out.println("3.6.9�� �ƴմϴ�.");
	}
	
}
}
