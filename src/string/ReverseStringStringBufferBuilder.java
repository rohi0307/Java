package string;

public class ReverseStringStringBufferBuilder {
public static void main(String[] args) {
	String FirstName="Rohit",SecondName="Chavan";
	
	//StringBuffer
	StringBuffer strbuffer=new StringBuffer();
	strbuffer.append(FirstName);
	strbuffer.reverse();
	System.out.println("Reverse First Name: "+strbuffer);
	
	//StringBuilder
	StringBuilder strBuilder=new StringBuilder();
	strBuilder.append(SecondName);
	strBuilder.reverse();
	System.out.println("Reverse Last name: "+strBuilder);
	
}
}
