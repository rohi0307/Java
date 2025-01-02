package string;

public class StringMethods {
public static void main(String[] args) {
	String name="Rohit Chavan";
	String role="QA";
	StringBuffer s=new StringBuffer("Rohit");
	System.out.println(s.reverse());
	System.out.println(s.toString());
	System.out.println(name.substring(1,3));
	System.out.println(name.trim());
	System.out.println(name.concat(" QAE"));
	System.out.println(name.compareTo(role));



}
}
