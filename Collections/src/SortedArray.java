import java.util.Arrays;

public class SortedArray {

	public static void main(String[] args) {
		
		
		int sal[] = {200, 500, 300, 800,100,600};
		
		for (int i = 0; i < sal.length; i++) {
			
			Arrays.sort(sal);
			System.out.print(sal[i] + " ");			
		}
	}
}
