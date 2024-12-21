package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortArray_1D {
public static void main(String[] args) {
	Integer [] a = { 2, -1, 4, 3,11,12,-33};
	//Arrays.sort(a);  	//sort all element
	//System.out.println(Arrays.toString(a));
	
	//Arrays.sort(a,2,4);  // sort only from start index to stop index
	//System.out.println(Arrays.toString(a));
	
    Arrays.sort(a, Collections.reverseOrder());   	//It works on an Integer[] array (not int[]). Because, the sorting requires objects not primitive types.
	System.out.println(Arrays.toString(a));
}
}
