package patterns;

public class PyrimidReverseTriangle {
public static void main(String[] args) {
	for(int i=0;i<=5;i++){
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=4;k>=i;k--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
