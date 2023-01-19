import java.util.Arrays;

public class Student {

	void armStrongNo(int a) {
		int ori = a, no = 0;
		while (a != 0) {
			int r = a % 10;
			no += (r * r * r * r);
		}
		if (no == ori)
			System.out.println(no);
	}

	static void mergeArray(int a[], int b[]) {
		int c[] = new int[a.length + b.length];

		int x = 0;
		for (int i = 0; i < c.length; i++) {
			if (i < a.length)
				c[i] = a[i];
			else
				c[i] = b[x++];
		}
		System.out.println(Arrays.toString(c));
	}

	static void percVowelConsonant(String s) {

		char ch[] = s.toCharArray();
		int co = 0, v = 0;
		for (char c : ch) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				v++;
			else
				co++;
		}
		System.out.println(v);
		System.out.println(co);
		double vperc = (v / ((double) ch.length) * 100);
		System.out.println(vperc);

		double cperc = (co / ((double) ch.length) * 100);
		System.out.println(cperc);

	}

	void Palindrome(int i, String s) {
		int ori = i;
		int no = 0;

		while (i != 0) {
			int r = i % 10;
			no = no * 10 + r;
			i = i / 10;
		}
		if (i == ori)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");

		int st = 0, e = s.length() - 1;
		while (st < e) {
			if (s.charAt(st) != s.charAt(e)) {
				System.out.println("not palindrome");
				return;
			}
			st++;
			e--;
		}
		System.out.println("Plaindrome");

	}

	public static void main(String[] args) {
		mergeArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 6, 7, 8 });
		percVowelConsonant("yugal");
	}
}
