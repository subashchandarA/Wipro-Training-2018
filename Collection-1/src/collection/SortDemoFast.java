package collection;

import java.util.Arrays;

public class SortDemoFast {
public static void main(String[] args) {
	
	int sal[] = { 123, 4556, 22 , -44, 55 };
	Arrays.sort(sal);
	for (int i = 0; i < sal.length; i++) {
		System.out.print(sal[i] + " ");
	}
	
	System.out.print( "Min  ="+sal[0]);
	System.out.print(" Max = " +sal[sal.length-1]);
}
}
