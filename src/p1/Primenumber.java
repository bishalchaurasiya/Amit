package p1;
import java.util.Scanner;
public class Primenumber{
public static void main(String[] args) {
	int n=0,count =0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number:");
	n= sc.nextInt();
	for(int i=1;i<=n;i++) {
		if(n%i==0) {
			count++;
		}
		}if(count==2) {
		  System.out.println("This is a Prime number");
		}else {
		 System.out.println("This a not a prime number");
		}
	}
	
	
}

