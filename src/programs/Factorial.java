package programs;

public class Factorial {
	//	4! = 4*3*2*1 = 24
	public static void main(String[] args) {
		int num=5,fac=1
				;
		for(int i=num;i>0;i--) {
			fac=fac*i;
		}
		System.out.println(fac);
	}

}
