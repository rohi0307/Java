package programs;

//radar 454
public class Palindrome {
	public static void main(String[] args) {
		/*
		 * String name="rohit"; for(int i=name.length()-1;i>=0;i--) {
		 * System.out.print(name.charAt(i)); }
		 */

		int num = 123, sum = 0;
		while (num > 0) {
			int reminder = num % 10;
			sum = (sum * 10) + reminder;
			num = num / 10;
		}
		System.out.println(sum);

	}
}
