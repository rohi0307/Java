package arrays;

public class D1_FrequencyOfElement {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] frequency = new int[arr.length];
		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					frequency[j] = visited;
				}
			}
			if (frequency[i] != visited)
				frequency[i] = count;
		}
	}
}
