package string;

public class ReverseStringStringToCharacterArray {
public static void main(String[] args) {
	String name="Rohit";
	char[] name1=name.toCharArray();
	for(int i=name1.length-1;i>=0;i--) {		//print array in reverse order
		System.out.print(name1[i]);
	}
}
}
