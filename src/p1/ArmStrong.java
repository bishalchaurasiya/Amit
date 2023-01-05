package p1;

import java.util.Scanner;

public class ArmStrong {
public static void main(String[] args) {
	int n,num=0,rem,orig;
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number:");
	n = sc.nextInt();
	orig=n;
	while(n>0) {
		rem=n%10;
		num=(rem*rem*rem)+num;
		n=n/10;
	}
	if(orig==num) {
		System.out.println("This is palindrome");
	}else {
		System.out.println("This is not a palindrome");
	}
	
}
}
