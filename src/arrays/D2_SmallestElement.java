package arrays;

public class D2_SmallestElement {
	static void largestElement(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}
		System.out.println("Largest Element: " + min);

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };
		largestElement(arr);
	}
}
