import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prac1 {
	public static void main(String[] args) {
		int check[] = { 55, 2, 20, 1, 5, 0, 1, 5, 2, 1, 21, 2, 2, 0, 1, 2, 2 };
		int div[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		Map<Integer, Integer> m = new HashMap<>();

		for (int i = 0; i < div.length; i++) {
			for (int j = 0; j < check.length; j++) {
				if (check[j] % div[i] == 0) {
					if (m.containsKey(div[i]))
						m.put(div[i], m.get(div[i]) + 1);
					else
						m.put(div[i], 1);

				}

			}
		}
		Set<Entry<Integer, Integer>> e = m.entrySet();
		String s="[";
		for (Entry en : e) {
			s+=en.getKey()+":";
			s+=en.getValue()+",";
		}
		String res="";
		for (int i = 0; i < s.length()-1; i++) {
			res+=s.charAt(i);
		}
		System.out.println(res+"]");
	}
}