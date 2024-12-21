package arrays;

public class LargestNumber_1D {
	static int[] arr = { 22, 57, 14, 23, 99, 45 };

	public static int largeNumber() {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		System.out.println(largeNumber());
	}
}
