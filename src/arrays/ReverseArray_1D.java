package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray_1D {
	public static void main(String[] args) {
		Integer[] arr = { 1, 5, 9, 7, 3, -8 };
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
		
        int a[] = { 1, 2, 3, 4, 5 };
        Arrays.sort(a);
        
	}
}
