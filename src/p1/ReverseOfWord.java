package p1;
public class ReverseOfWord {
public static void main(String[] args) {
	int i;
	String str= "Black Straw";
	String[] sp = str.split(" ");
	for(i=sp.length-1;i>=0;i--) {
	System.out.print(sp[i] + " ");	
	}
}
}
