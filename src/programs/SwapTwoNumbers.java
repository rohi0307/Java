package programs;

public class SwapTwoNumbers {
public static void main(String[] args) {
	int a=10,b=12,temp = 0;
	temp=a;
	a=b;
	b=temp;
	System.out.println(a+" "+b);
	
	//without using third  variable
	int x=2,y=3;
	x=x+y; //2+3=5  5 stored in x(x=5) but still we have y value
	y=x-y;  //5-3=2  2 stored in y(y=2) one valued swapped
	x=x-y;  //5-2=3 
	System.out.println("x "+x+" y "+y);;
	
	//using arthmatic operator
	 a = (a + b) - (b = a);
		System.out.println(a+" "+b);

}
}
