package arrays;

import java.util.Arrays;

public class RemoveOccurrences_1D {
	public static int[] removeOccerence(int[] a, int k) {
		int index = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] != k)
				a[index++] = a[i];
		return Arrays.copyOf(a, index);
	}

	public static void main(String[] args) {
		int[] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		int k = 3;
		a=removeOccerence(a, k);
		System.out.println(Arrays.toString(a));
	}
}

