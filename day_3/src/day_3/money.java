package day_3;
import java.util.Scanner;
public class money {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("�ݾ� �Է�: ");
	int won = sc.nextInt();
	int n1, n2, n3, n4, n5, n6, n7;
	
	n1=won%50000;
	won/=50000;
	System.out.println("5������ "+won+"��");
	
	n2=n1%10000;
	n1/=10000;
	System.out.println("������ "+n1+"��");
	
	n3=n2%5000;
	n2/=5000;
	System.out.println("5õ���� "+n2+"��");
	
	n4=n3%1000;
	n3/=1000;
	System.out.println("õ���� "+n3+"��");
	
	n5=n4%100;
	n4/=100;
	System.out.println("����� "+n4+"��");
	
	n6=n5%50;
	n5/=50;
	System.out.println("5�ʿ��� "+n5+"��");
	
	n7=n6%10;
	n6/=10;
	System.out.println("�ʿ��� "+n6+"��");
	
	n7/=1;
	System.out.println("�Ͽ��� "+n7+"��");
	
	
}
}
