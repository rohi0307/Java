package string;

public class D3_ReverseString {
	public static void main(String[] args) {
		String string = "Rohit";
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		System.out.println(reverse);
	}
}
