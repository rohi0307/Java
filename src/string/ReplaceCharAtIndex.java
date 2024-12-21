package string;

public class ReplaceCharAtIndex {
public static void main(String[] args) {
	String name="Rohit";
	char ch='x';
	int index=3;
	StringBuilder str=new StringBuilder(name);
	str.setCharAt(index, ch);

	System.out.println(str);
}
}
