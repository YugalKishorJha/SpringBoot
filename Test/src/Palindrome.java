
public class Palindrome {

	public static void main(String[] args) {

		String s = "madam";
		int i = 1011;

		checkAnagramInString(s);
		checkAnagramForNum(i);

	}

	private static void checkAnagramForNum(int i) {
		int temp = i;
		int revNo = 0;

		while (temp != 0) {
			int r = temp % 10;
			revNo = revNo * 10 + r;
			temp = temp / 10;
		}

		if (i == revNo)
			System.out.println("Is a Palindrome");
		else
			System.out.println("Not palindrome");
	}

	private static void checkAnagramInString(String s) {
		int i = 0, j = s.length() - 1;

		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("Not an Palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("Is a Palindrome");
	}

}
