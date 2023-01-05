package p1;
public class Reverse {
public static void main(String[] args) {
	String orig="Java";
	String rev = "";
	for(int i=orig.length()-1;i>=0;i--) {
		rev=rev+orig.charAt(i);
	}
	System.out.println(rev);
}
}
