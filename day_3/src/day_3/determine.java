package day_3;
import java.util.Scanner; 
public class determine {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.print("2�ڸ��� ���� �Է�(10~99): ");
	int num = sc.nextInt();
	
	if (num%11==0)
		System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
	else
		System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
}
}
