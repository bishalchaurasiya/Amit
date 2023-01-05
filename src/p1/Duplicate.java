// Code for duplicate
package p1;
public class Duplicate {
public static void main(String[] args) {
int [] arr= {1,1,3,5,6,8,9,7,9};
boolean flag=false;
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		if(arr[i]==arr[j]) {
			System.out.println("Duplicate elements found:" + arr[i]);
			flag=true;
		}
	}
	if(flag=false) {
		System.out.println("Duplicate elements not found");
	}
}
}
}
