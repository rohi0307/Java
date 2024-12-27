package arrays;

public class D1_LeftRotateElements {

	/*
	 * Original Array: 1 2 3 4 5 Array after left rotation: 4 5 1 2 3
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		for (int i : arr) {
			System.out.print(i + " ");
		}
		for(int i=0;i<3;i++) {		        //Rotate the given array by n times toward left  
			int j,first;
			first=arr[0];		            //Stores the first element of the array  
			for( j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];		                //Shift element of array by one  
			}
			arr[j]=first;	            //First element of array will be added to the end  
		}
		System.out.println();
		for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");
		}
	}

}
