package arrays;

public class D2_LargestElement {
	static void largestElement(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			
		}
		System.out.println("Largest Element: "+max);

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		largestElement(arr);
	}
}
