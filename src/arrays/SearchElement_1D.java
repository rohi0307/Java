package arrays;

public class SearchElement_1D {
//Approaches
//	Using the Linear Search method
//	Using the Binary Search method
//	Using List.contains() method
//	Using Stream.anyMatch() method
	
	public static void main(String[] args) {
		long[] arr= {2,4,5,1,88,1,12,8,};
		int check=87;
		boolean test=false;
		for(long element:arr) {
			if(element==check) {
				test=true;
				break;
				
			}
		}
		System.out.println(test);
	}
}
