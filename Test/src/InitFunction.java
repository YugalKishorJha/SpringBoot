import java.util.Arrays;

public class InitFunction {

	public static void main(String[] args) {
		String s = "yugal@is6InHyderabad";
		String str[] = s.split("[^a-zA-Z]");
		System.out.println(Arrays.toString(str));

		for (int i = 0; i < str.length; i++) {

			str[i] = str[i].substring(0, 1).toUpperCase() + str[i].substring(1, str.length);
		}

		String res = "";
		for (int i = 0; i < str.length; i++) {
			res += str[i];
		}

		System.out.println(res);

	}

}
