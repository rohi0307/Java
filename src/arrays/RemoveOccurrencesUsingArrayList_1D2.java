package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Approach to Implement the ArrayList Method:
Get the array and the key.
Create an empty ArrayList
Insert all elements from the array into the list except the specified key
Convert the list back to an array and return it.
*/
public class RemoveOccurrencesUsingArrayList_1D2 {

	public static void main(String[] args) {
		Integer [] a = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
		Integer k = 3;
		
		// Convert array to ArrayList
		List<Integer> list= new ArrayList<>(Arrays.asList(a));
		list.removeAll(Arrays.asList(k));
		
		// Convert ArrayList back to array
		Integer[] newarr=list.toArray(new Integer[0]);
		System.out.println(Arrays.toString(newarr));

	}
}
