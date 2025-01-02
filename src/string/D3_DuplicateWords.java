package string;

public class D3_DuplicateWords {

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";
		string = string.toLowerCase();
		String[] arr = string.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j]="o";
				}
			}
			if (count > 1 && arr[i]!="o") {
				System.out.println(arr[i]);
			}
		}

	}
}
