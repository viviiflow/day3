package day_3;
import java.util.Scanner;
public class middle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
	
	System.out.println("���� 3�� �Է�: ");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	if (((num1>num2)&&(num2>num3))||(num3>num2&&num2>num1)) {
		System.out.print("�߰����� "+num2);}
	else if (((num2>num1)&&(num1>num3))||((num3>num1)&&(num1>num2))) {
		System.out.print("�߰����� "+num1);}
	else if (((num1>num3)&&(num3>num2))||((num2>num3)&&(num3>num1))) {
		System.out.print("�߰����� "+num3);}
}
}
