package arrays;

public class D2_PrintReverseArray {
public static void main(String[] args) {
	int [] arr=new int[] {1,2,3,4,5};
	for(int a:arr) {
		System.out.print(a+" ");
	}
	System.out.println();
	for(int b=arr.length-1;b>=0;b--)
		System.out.print(arr[b]+" ");
}
}
