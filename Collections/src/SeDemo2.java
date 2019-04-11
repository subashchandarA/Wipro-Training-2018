import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class SeDemo2 {

	public static void main(String[] args) {

		char char1 [] = {'b','c','a'};
		int sal[] = {1, 1, 2, 2,3,3,4,5,6,7,7,8};
		
		Set<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < sal.length; i++) {
			hs.add(sal[i]);
		}
		System.out.println(hs);
		
		Set<Integer> s = new TreeSet<Integer>();

		for (int i = 0; i < sal.length; i++) {

			s.add(sal[i]);
		}
		System.out.println(s);

		Set<Character> s1 = new TreeSet<Character>();
		for (int j = 0; j < char1.length; j++) {

			s1.add(char1[j]);
		}
		System.out.println(s1);
	}

}
