package arrays;

public class D1_CopyArrayIntoAnther {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 7, 5, 8 };
		int[] arr2 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		for(int t:arr2) {
			System.out.print(t);
		}
	}
}