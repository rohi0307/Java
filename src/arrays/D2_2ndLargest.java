package arrays;

public class D2_2ndLargest {
	static void secondLargest(int[] a) {
		System.out.print("Original Array: ");
		for (int i : a) {
			System.out.print(i + " ");
		}
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.println();
		System.out.println("Largest number:" + max);
		System.out.println(a[a.length-2]);

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 3, 2 };
		secondLargest(a);
	}
}
