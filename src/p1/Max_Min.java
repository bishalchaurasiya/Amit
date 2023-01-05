package p1;
public class Max_Min {
public static void main(String[] args) {
	int temp;
	int [] arr= {10,20,30,60,90,05,02,36,98};
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	System.out.println("1st min number is:" + arr[0]);
	System.out.println("2nd min number is:" +arr[1]);
	System.out.println("1st max number is:" + arr[arr.length-1]);
	System.out.println("2nd max number is:" + arr[arr.length-2]);
}
}
