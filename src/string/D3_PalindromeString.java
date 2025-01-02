package string;

public class D3_PalindromeString {
	public static void main(String[] args) {
		String name = "Kayak";
		name = name.toLowerCase();
		boolean flag = true;
		int len = name.length();
		for (int i = 0; i < name.length() / 2; i++) {
			if (name.charAt(i) != name.charAt( len -i- 1)) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("String is Palindrome");
		else
			System.out.println("String is Not Palindrome");

	}
}
