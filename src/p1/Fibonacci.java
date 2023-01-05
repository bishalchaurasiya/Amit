package p1;
import java.util.Scanner;
public class Fibonacci {
public static void main(String[] args) {
	int num, a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number:");
	num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		System.out.println(a + " ");
		c=a+b;
		a=b;
		b=c;
	}
	
}
}

