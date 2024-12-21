package programs;

public class PrimeNumber {
// divided by on 1 & number itself 
	// 2,3,5,7,11
	public static void main(String[] args) {
		int num=3;
		if(num==0||num==1) {
			System.out.println("Number is not prime 1");
		}
		else {
			for(int i=2;i<20;i++) {
				if(num%i==0) {
					System.out.println("Number is not prime");
					break;
				}
				
			}
		}
	}

}
