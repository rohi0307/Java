package programs;

public class Fibonacci {

	// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		System.out.print(a+" , "+b);
		for(int i=0;i<10;i++) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" ,"+sum);

		}
	}

}
