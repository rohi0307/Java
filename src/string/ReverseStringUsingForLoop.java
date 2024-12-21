package string;

public class ReverseStringUsingForLoop {
public static void main(String[] args) {
	String name="Rohit",reverse="";
	char ch;
	for(int i=0;i<name.length();i++) {
		ch=name.charAt(i);
		reverse=ch+reverse;
	}
	System.out.println(reverse);
}
}
