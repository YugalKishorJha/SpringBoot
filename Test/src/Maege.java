import java.util.Arrays;

public class Maege {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40 };
		int b[] = { 50, 60, 70, 80 };
		int a1 = a.length;
		int b1 = b.length;
		int c = a1 + b1;
		int d[] = new int[c];
		System.arraycopy(a, 0, d, 0, a1);
		System.arraycopy(b, 0, d, a1, b1);
		System.out.println(Arrays.toString(d));

	}

}
