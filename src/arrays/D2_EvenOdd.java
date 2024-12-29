package arrays;

public class D2_EvenOdd {
	static void evenOdd(int [] a) {
		System.out.print("Even Number: ");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.print("Odd numbers: ");
		for(int j=0;j<a.length;j++)
			if(a[j]%2!=0)
				System.out.print(a[j]+" ");
	}
public static void main(String[] args) {
	int a[]={1,2,5,6,3,2}; 
	evenOdd(a);
}
}
