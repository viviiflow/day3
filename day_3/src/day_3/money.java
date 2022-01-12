package day_3;
import java.util.Scanner;
public class money {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("금액 입력: ");
	int won = sc.nextInt();
	int n1, n2, n3, n4, n5, n6, n7;
	
	n1=won%50000;
	won/=50000;
	System.out.println("5만원권 "+won+"매");
	
	n2=n1%10000;
	n1/=10000;
	System.out.println("만원권 "+n1+"매");
	
	n3=n2%5000;
	n2/=5000;
	System.out.println("5천원권 "+n2+"매");
	
	n4=n3%1000;
	n3/=1000;
	System.out.println("천원권 "+n3+"매");
	
	n5=n4%100;
	n4/=100;
	System.out.println("백원권 "+n4+"매");
	
	n6=n5%50;
	n5/=50;
	System.out.println("5십원권 "+n5+"매");
	
	n7=n6%10;
	n6/=10;
	System.out.println("십원권 "+n6+"매");
	
	n7/=1;
	System.out.println("일원권 "+n7+"매");
	
	
}
}
