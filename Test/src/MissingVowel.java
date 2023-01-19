  import java.util.ArrayList;

public class MissingVowel {
	public static void main(String[] args) {
		String s = "Sanjayue ";
		s = s.toLowerCase();

		char ch[] = s.toCharArray();
		char v[] = new char[] { 'a', 'e', 'i','o', 'u' };
		ArrayList<Character> ll = new ArrayList<>();
		ll.add('a');ll.add('e');ll.add('i');ll.add('o');ll.add('u');
		

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < v.length; j++) {
				if (ch[i] == v[j])
					ll.remove((Character) (ch[i]));
			}
		}
		System.out.println(ll);
	}
}