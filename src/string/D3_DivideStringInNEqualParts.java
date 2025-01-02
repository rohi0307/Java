package string;

public class D3_DivideStringInNEqualParts {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";
		int n = 3, temp = 0;
		int len = str.length();
		int num = len / n;
		String[] arr = new String[3];
		for (int i = 0; i < str.length(); i = i + num) {
			String part = str.substring(i, i + num);
			arr[temp] = part;
			temp++;
		}
		for (String k : arr) {
			System.out.println(k);
		}
	}

}
