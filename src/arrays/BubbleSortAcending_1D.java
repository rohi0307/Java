package arrays;

import java.util.Arrays;

public class BubbleSortAcending_1D {
	public static void main(String[] args) {
		int[] a = new int[] { -2, 0, 1, 3, -1, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+", ");
		}
	}
}
