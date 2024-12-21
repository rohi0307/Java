package programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakeInputFromUser {
public static void main(String[] args) throws IOException {
	 System.out.print("Input your age: ");
	Scanner in=new Scanner(System.in);
	
	String s = in.nextLine();
    System.out.println("You entered string " + s);

    int a = in.nextInt();
    System.out.println("You entered integer " + a);

    float b = in.nextFloat();
    System.out.println("You entered float " + b);
	
	in.close();
	
	
	//Other Ways using Bufferreader class
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter your name");
	String name=reader.readLine();
	System.out.println("Hello Mr "+name);
	
}
}
