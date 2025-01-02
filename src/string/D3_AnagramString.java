package string;

import java.util.Arrays;

public class D3_AnagramString {
	public static void main(String[] args) {
		String str1 = "Brag";
		String str2 = "Grab";
		if (str1.length() != str2.length()) {
			System.out.println("String is not Anagram");
		}
		String s1 = str1.toLowerCase();
		String s2 = str2.toLowerCase();
		// Convert to array
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		// sort
		Arrays.sort(c1);
		Arrays.sort(c2);
		// check
		if (Arrays.equals(c1, c2) == true) {
			System.out.println("String are Anagram");
		}
	}
}
