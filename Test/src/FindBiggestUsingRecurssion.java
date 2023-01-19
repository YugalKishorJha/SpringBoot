
public class FindBiggestUsingRecurssion {

	public static void main(String[] args) {

		int ar[] = {2, 52, 581, 54, 2, 1, 65, 1, 54 };
		int i = 0;
		int maxNo = ar[i];
		System.out.println(findMax(ar, i));

		int lcm[] = { 4, 8, 2, 10, 12 };
		System.out.println(findLcm(lcm));

	}

	private static int findLcm(int[] lcm) {
		int ele = 1;
		int div = 2;

		while (true) {
			int c = 0;
			boolean divi = false;

			for (int i = 0; i < lcm.length; i++) {
				if (lcm[i] == 0)
					return 0;

				else if (lcm[i] < 0)
					lcm[i] = lcm[i] * (-1);

				if (lcm[i] == 1)
					c++;

				if (lcm[i] % div == 0) {
					divi = true;
					lcm[i] = lcm[i] / div;

					if (divi)
						ele = ele * div;

					else
						div++;

					if (c == lcm.length)
						return ele;
				}

			}

		}

	}

	private static int findMax(int[] ar, int i) {
		if (i == 1)
			return ar[i];
		else
			return Math.max(ar[i], ar[i - 1]);
	}

}
