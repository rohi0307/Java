package arrays;

public class D2_PrintElementOnEvenPosition {

	public static void main(String[] args) {
		int [] arr=new int[] {1,2,3,4,5,6,7,8};
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=1;i<arr.length;i=i+2) {
			System.out.print(arr[i]+" ");
		}
	}

}
