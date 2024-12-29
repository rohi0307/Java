package arrays;

public class D2_AscendingOrder {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 2, 8, 7, 1 };
		int temp;
		System.out.print("Original array: ");
		for (int k : arr) {
			System.out.print(k + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {   // change initilization 
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.print("Sorted array: ");
		for (int r : arr) {
			System.out.print(r + " ");
		}
	}
}
