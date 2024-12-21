package patterns;
/*
    *
   ***
  *****
 *******
*********

*/

public class Pyrimid {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=4;j>=i;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("*");
		}
		for(int l=2;l<=i;l++) {      			//IMP- l starts from row 2 becoz row 1 has only only 1 *
			System.out.print("*");
		}
		System.out.println();
		}
	}
}

