package arrays;

public class D2_SumOfArray {
	static void sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		sum(arr);
	}
}
