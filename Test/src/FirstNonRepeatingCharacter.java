import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String s = "bcbca";
		char ch[] = s.toCharArray();
		LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if (lhm.containsKey(ch[i]))
				lhm.put(ch[i], lhm.get(ch[i]) + 1);
			else
				lhm.put(ch[i], 1);
		}
//		System.out.println(lhm);
		Set<Entry<Character, Integer>> entrySet = lhm.entrySet();
//		System.out.println(entrySet);
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() == 1) {
				System.out.println(entry.getKey());
				break;
			}
		}
	}
}
